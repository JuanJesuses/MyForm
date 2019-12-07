package com.example.myform;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class Saludo extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        //Activar flecha ir atrás y el icono de la app en la actionBar
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_myicon_round);

        Button botonSiguiente = findViewById(R.id.botonSiguienteSaludo);

        //Declaramos la barra de desplazamiento
        SeekBar seekBar = findViewById(R.id.barraEdad);
        seekBar.setProgress(16);
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

        botonSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Saludo.this, comparticion.class);
                startActivity(i);
            }
        });

    }
}
