package com.example.programmingkeypoints;


import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Email;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment implements Validator.ValidationListener {

    @Email
    private TextInputEditText username;

    @NotEmpty
    private TextInputEditText password;

    private Validator validator;
    private ProgressDialog progressDialog;
    private SessionManager sessionManager;

    LoginActivity activity;

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        validator = new Validator(this);
        progressDialog = new ProgressDialog(getContext());

        sessionManager = new SessionManager(getContext());
        activity = (LoginActivity) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        username = (TextInputEditText) view.findViewById(R.id.username);
        password = (TextInputEditText) view.findViewById(R.id.password);

        validator = new Validator(this);
        validator.setValidationListener(this);

        MaterialButton login = (MaterialButton) view.findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validator.validate();
            }
        });

        AppCompatButton button = (AppCompatButton) view.findViewById(R.id.register);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.changeFragment(new RegisterFragment(), true);
            }
        });
        return view;
    }

    @Override
    public void onValidationFailed(List<ValidationError> errors) {
        Utils.showMessage(getContext(), "Provide Valid Data");
    }

    @Override
    public void onValidationSucceeded() {

        DataManager dataManager = new DataManager(getContext());
        String un = username.getText().toString();
        String pass = Utils.md5(password.getText().toString());

        if (dataManager.login(un, pass)) {
            Utils.showMessage(getContext(), "Login Successfully");
            sessionManager.setUsername(un);
            sessionManager.setLogin(true);

            startActivity(new Intent(getContext(), MainActivity.class));
            activity.finish();
        }
        else {
            Utils.showMessage(getContext(), "Username OR Password not correct. ");
        }
    }

    private void login(final String email, final String password) {

        if (password != null) {

            progressDialog.setMessage("Please wait...");
            progressDialog.show();

            StringRequest stringRequest = new StringRequest(Request.Method.POST, AppConfig.BASE_URL + "login", new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {

                    progressDialog.dismiss();
                    try {
                        JSONObject jsonObject = new JSONObject(response);

                        if (jsonObject.getBoolean("error")) {
                            Utils.showMessage(getContext(), jsonObject.getString("errorMessage"));
                        }
                        else {

                            sessionManager.setLogin(true);
                            Utils.showMessage(getContext(), jsonObject.getString("message"));
                            startActivity(new Intent(getContext(), MainActivity.class));
                            activity.finish();
                        }
                    }
                    catch (JSONException e) {
                        e.printStackTrace();
                        progressDialog.dismiss();
                    }
                }
            },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            error.printStackTrace();

                            Utils.showMessage(getContext(), error.getMessage());
                            progressDialog.dismiss();
                        }
                    }) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String, String> map = new HashMap<>();
                    map.put("email", email);
                    map.put("password", password);
                    map.put("page", "car-login");

                    return  map;
                }
            };

            Controller.getInstance().addRequestQueue(stringRequest);
        }
    }

    private void response(String message) {

        AlertDialog.Builder dialog = new AlertDialog.Builder(getContext());
        dialog.setMessage(message);

        dialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                startActivity(new Intent(getContext(), MainActivity.class));
                activity.finish();
            }
        });

        dialog.show();
    }
}
