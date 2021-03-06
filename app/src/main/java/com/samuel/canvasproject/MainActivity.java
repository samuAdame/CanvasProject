package com.samuel.canvasproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout lyMain = findViewById(R.id.lyMain);
        CanvasView canvasView = new CanvasView(this);
        canvasView.setVisibility(View.VISIBLE);
        lyMain.addView(canvasView);
    }
}