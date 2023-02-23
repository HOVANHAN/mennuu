package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Popupmenu extends AppCompatActivity {
    TextView txt;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popupmenu);

        txt =findViewById(R.id.txtpopup);
        Intent intent = getIntent();
        txt.setText(intent.getStringExtra("popup").toString());
    }
}