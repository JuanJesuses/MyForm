package com.example.myform;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class comparticion extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comparticion);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        final ImageButton botonOk = findViewById(R.id.confirmar);
        final Button botonShare = findViewById(R.id.botonCompartir);

        botonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                botonShare.setVisibility(View.VISIBLE);
                botonOk.setVisibility(View.GONE);
            }
        });

    }
}
