package com.dnielfe.manager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public final class SampleActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
    }

    public void clickExit(View view){
        finish();
    }
}
