package com.example.myform;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class Saludo extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        //Activar flecha ir atrás
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        //Declaramos la barra de desplaamiento
        SeekBar seekBar = findViewById(R.id.barraEdad);
        seekBar.setProgress(0);
        seekBar.setMax(100);

        //Delcaramos el TextView numérico para la barra de desplazamiento
        final TextView valorBarraEdad = findViewById(R.id.textViewEdad);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                valorBarraEdad.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
