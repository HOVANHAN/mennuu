package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OptionMenu extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu);

        txt = findViewById(R.id.txtOption);
        Intent intent = getIntent();
        txt.setText(intent.getStringExtra("optionmenu").toString());

    }
}