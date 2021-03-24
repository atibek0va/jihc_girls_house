package com.example.dormitoryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class onboarding1 extends AppCompatActivity implements View.OnClickListener{

    Button btnNext, btnSkip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding1);

        btnNext = findViewById(R.id.btnNext);
        btnSkip = findViewById(R.id.btnSkip);

        btnNext.setOnClickListener(this);
        btnSkip.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnSkip){
            Intent i = new Intent(this, kuntizbe.class);
            startActivity(i);
        }
        else if(view.getId() == R.id.btnNext){
            Intent in = new Intent(this, onboarding2.class);
            startActivity(in);
        }
    }
}