package com.example.programmingkeypoints;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.navigation.NavigationView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private SessionManager sessionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        sessionManager = new SessionManager(this);

        setupNavigation();
        changeFragment(new HomeFragment(), false);
    }

    public void changeFragment(Fragment fragment, boolean backTrack) {

       FragmentTransaction transaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
                .replace(R.id.container, fragment);

       if (backTrack) {
           transaction.addToBackStack(null);
       }

       transaction.commit();
    }

    public void startKeyFragment(String title) {

        KeyFragment fragment = KeyFragment.newInstance(title);

        getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
                .replace(R.id.container, fragment)
                .commit();
    }

    private void setupNavigation() {
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav);
        View view = navigationView.getHeaderView(0);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {

                    case R.id.navHome:
                        changeFragment(new HomeFragment(), false);
                        drawerLayout.closeDrawers();
                        return true;

                    case R.id.navKeys:
                        changeFragment(new KeyFragment(), true);
                        drawerLayout.closeDrawers();
                        return true;

                    case R.id.navContact:
                        changeFragment(new FeedbackFragment(), true);
                        drawerLayout.closeDrawers();
                        return true;

                    case R.id.navAbout:
                        changeFragment(new AboutFragment(), true);
                        drawerLayout.closeDrawers();
                        return true;

                    case R.id.navBooks:
                        changeFragment(new MaterialsFragment(), true);
                        drawerLayout.closeDrawers();
                        return true;
                }

                item.setChecked(true);
                return false;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            drawerLayout.openDrawer(GravityCompat.START);
        }

        if (item.getItemId() == R.id.change) {
            showDialog();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {

        if (getSupportFragmentManager().getBackStackEntryCount() > 0)
            getSupportFragmentManager().popBackStack();
        else
            super.onBackPressed();
    }

    public void showDialog() {

        final MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(this);

        ViewGroup viewGroup = findViewById(android.R.id.content);
        View view = getLayoutInflater().inflate(R.layout.dialog, viewGroup, false);

        builder.setView(view);

        final Spinner spinner = (Spinner) view.findViewById(R.id.level);
        final Spinner spinner1 = (Spinner) view.findViewById(R.id.semester);
        final MaterialButton open = (MaterialButton) view.findViewById(R.id.open);
        final MaterialButton cancel = (MaterialButton) view.findViewById(R.id.cancel);

        String[] levels = new String[]{"ND 1", "ND 2", "HND 1", "HND 2"};
        String[] semester = new String[]{"First", "Second"};

        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, levels));
        spinner1.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, semester));

        final AlertDialog dialog = builder.create();

        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String level  = spinner.getSelectedItem().toString();
                String semester = spinner1.getSelectedItem().toString();

                sessionManager.setLevel(level);
                sessionManager.setSemester(semester);

                dialog.dismiss();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
}
