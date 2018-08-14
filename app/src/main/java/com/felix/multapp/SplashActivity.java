package com.felix.multapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "go to main activity", Snackbar.LENGTH_LONG)
                        .setAction("Go", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                            }
                        }).show();

            }
        });
    }

}
