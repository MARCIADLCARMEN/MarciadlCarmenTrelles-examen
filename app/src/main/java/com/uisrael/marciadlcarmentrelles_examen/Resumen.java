package com.uisrael.marciadlcarmentrelles_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Resumen extends AppCompatActivity {

    Bundle encuesta_recibida;
    EditText us, preg1, preg2, preg3, pagoTotal, nombre, usuario4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

        us = findViewById(R.id.usuario4);
        encuesta_recibida = getIntent().getExtras();
        String nom = encuesta_recibida.getString("dato_user");
        us.setText(nom);
        pagoTotal = findViewById(R.id.pagototal);
        pagoTotal.setText(encuesta_recibida.getString("totalPagar"));;
        nombre = findViewById(R.id.nombre);
        nombre.setText(encuesta_recibida.getString("nombre"));;
        usuario4 = findViewById(R.id.usuario4);
        usuario4.setText(encuesta_recibida.getString("usuario"));;

        preg1 = findViewById(R.id.respuesta1);
        preg2 = findViewById(R.id.respuesta2);
        preg3 = findViewById(R.id.respuesta3);

        String respuesta1 = encuesta_recibida.getString("educativo");
        preg1.setText(respuesta1);
        String respuesta2 = encuesta_recibida.getString("deporte");
        preg2.setText(respuesta2);
        String respuesta3 = encuesta_recibida.getString("idioma");
        preg3.setText(respuesta3);

    }
}
