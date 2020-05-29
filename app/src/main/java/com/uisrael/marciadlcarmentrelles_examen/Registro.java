package com.uisrael.marciadlcarmentrelles_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    Bundle usuario_registrado;
    EditText nombre, monto_inicial, pago_mensual, usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        usuario_registrado = getIntent().getExtras();
        nombre = findViewById(R.id.nombre);
        monto_inicial = findViewById(R.id.montoinicial);
        pago_mensual = findViewById(R.id.pagomensual);
        usuario = findViewById(R.id.usuarioconectado);
        String dato = usuario_registrado.getString("dato_user");
        usuario.setText(dato);

        }
        public void guardar (View v){
            Intent registra = new Intent(this,Encuesta.class);
            startActivity(registra);
            Toast.makeText(getApplicationContext(), "Elemento guardado con exito", Toast.LENGTH_SHORT).show();
            registra.putExtra("nombres",nombre.getText().toString());
        }
        public void Calcular (View v) {
            double datoinicial;
            double datomensual;
            double pmensual;
            double stotal;
            double montoinicial = 1800;

            datoinicial = Double.parseDouble(monto_inicial.getText().toString());
            datomensual = montoinicial - datoinicial;
            pmensual = datomensual / 3;
            stotal = pmensual + 90;
            pago_mensual.setText(Double.toString(stotal));
    }
}
