package com.m.infinitywallpaper.abtract;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;

public abstract class MActivity extends AppCompatActivity {


    private ProgressDialog progressDialog;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        progressDialog = new ProgressDialog(this);

    }

    public void showProgressDialog(String message) {
        if (progressDialog != null) {
            progressDialog.show();
        }
    }

    public void hideProgressDialog() {
        if (progressDialog != null) progressDialog.dismiss();
    }



}
