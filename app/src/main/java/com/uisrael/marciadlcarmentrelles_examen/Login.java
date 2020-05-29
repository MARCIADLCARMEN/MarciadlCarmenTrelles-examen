package com.uisrael.marciadlcarmentrelles_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText nom, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nom = findViewById(R.id.user);
        pass = findViewById(R.id.password);

    }
    public void login (View v){

        String us;
        us = "estudiante2020";
        String pa;
        pa = "uisrael2020";

        if (nom.getText().toString().equals(us) && pass.getText().toString().equals(pa)){
            Intent ingreso = new Intent(this,Registro.class);
            ingreso.putExtra("dato_user", nom.getText().toString());
            Toast.makeText(getApplicationContext(),"Dato Correcto", Toast.LENGTH_LONG).show();
            startActivity(ingreso);
        } else {
            Toast.makeText(getApplicationContext(), "Dato Incorrecto", Toast.LENGTH_LONG).show();

        }
    }
}
