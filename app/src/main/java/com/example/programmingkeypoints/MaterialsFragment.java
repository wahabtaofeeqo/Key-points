package com.example.programmingkeypoints;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.shockwave.pdfium.PdfDocument;


/**
 * A simple {@link Fragment} subclass.
 */
public class MaterialsFragment extends Fragment implements OnPageChangeListener, OnLoadCompleteListener {

    private PDFView pdfView;

    private static final String QBASIC = "qbasic.pdf";
    private static final String FORTRAN = "fortran_tutorial.pdf";

    private static final String JAVA = "java_tutorial.pdf";
    private static final String VB = "vb.pdf";

    private static final String ANDROID = "android_tutorial.pdf";
    private static final String PYTHON = "python_tutorial.pdf";

    private static final String CPP = "cpp_tutorial.pdf";
    private static final String PASCAL = "pascal_tutorial.pdf";

    private int pageNumber = 0;
    private String filename = QBASIC;

    private String level = "nd1";
    private String semester = "first";

    private SessionManager sessionManager;
    MainActivity activity;

    public MaterialsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = (MainActivity) getActivity();
        sessionManager = new SessionManager(getContext());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_materials, container, false);

        if (sessionManager.getLevel() != null)
            level = sessionManager.getLevel();

        if (sessionManager.getSemester() != null)
            semester = sessionManager.getSemester();

        pdfView = (PDFView) view.findViewById(R.id.pdfView);

        setFilename(level);

        return view;
    }

    @Override
    public void onPageChanged(int page, int pageCount) {
        pageNumber = page;
    }

    @Override
    public void loadComplete(int nbPages) {
        PdfDocument.Meta meta = pdfView.getDocumentMeta();
    }

    private void displayFromAssets(String file) {

        pdfView.fromAsset(file)
                .defaultPage(pageNumber)
                .enableSwipe(true)
                .onPageChange(this)
                .onLoad(this)
                .swipeHorizontal(true)
                .enableAnnotationRendering(true)
                .scrollHandle(new DefaultScrollHandle(getContext()))
                .load();

    }

    private void setFilename(String l) {

        if (l.equalsIgnoreCase("nd 1")) {
            if (semester.equalsIgnoreCase("first")) {
                filename = QBASIC;
                setTitle("QBasic");
            }
            else {
                filename = FORTRAN;
                setTitle("Fortran");
            }
        }

        if (l.equalsIgnoreCase("nd 2")) {
            if (semester.equalsIgnoreCase("first")){
                filename = VB;
                setTitle("VB.Net");
            }

            else {
                filename = JAVA;
                setTitle("Java");
            }
        }

        if (l.equalsIgnoreCase("hnd 1")) {
            if (semester.equalsIgnoreCase("first")) {
                filename = CPP;
                setTitle("CPP");
            }
            else {
                filename = ANDROID;
                setTitle("Android");
            }
        }

        if (l.equalsIgnoreCase("hnd 2")) {
            if (semester.equalsIgnoreCase("first")) {
                filename = PASCAL;
                setTitle("Pascal");
            }
            else {
                filename = PYTHON;
                setTitle("Python");
            }
        }

        displayFromAssets(filename);
    }

    private void setTitle(String title) {
        activity.getSupportActionBar().setTitle(title);
    }
}
