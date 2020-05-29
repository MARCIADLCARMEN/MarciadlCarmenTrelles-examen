package com.uisrael.marciadlcarmentrelles_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class Encuesta extends AppCompatActivity {

    Bundle dato;
    EditText pre1, usuario3;
    CheckBox ch1, ch2, ch3;
    RadioButton r1, r2;
    String totalPagar, nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
        dato = getIntent().getExtras();
        usuario3 = findViewById(R.id.usuario3);
        usuario3.setText(dato.getString("usuario"));
        totalPagar = (dato.getString("totalPagar"));
        nombre = (dato.getString("nombres"));

        pre1 = findViewById(R.id.p1);
        ch1 = findViewById(R.id.natacion);
        ch2 = findViewById(R.id.bailoterapia);
        ch3 = findViewById(R.id.futbol);
        r1 = findViewById(R.id.si);
        r2 = findViewById(R.id.no);
    }
    public void enviar_encuesta (View v){
        Intent en = new Intent(this,Resumen.class);

        //Primera Pregunta

        en.putExtra("educativo",pre1.getText().toString());
        en.putExtra("totalPagar",totalPagar);
        en.putExtra("nombre",nombre);
        en.putExtra("usuario",usuario3.getText().toString());


        //Segunda Pregunta

        if(ch1.isChecked()==true){
            en.putExtra("deporte", ch1.getText().toString());
            startActivity(en);
        }
        if (ch2.isChecked()==true){
            en.putExtra("deporte", ch2.getText().toString());
            startActivity(en);
        }
        if (ch3.isChecked()==true){
            en.putExtra("deporte", ch3.getText().toString());
            startActivity(en);
        }
        //Tercera Pregunta

        if (r1.isChecked()==true){
            en.putExtra("idioma", r1.getText().toString());
            startActivity(en);
        }
        if (r2.isChecked()==true){
            en.putExtra("idioma",r2.getText().toString());
            startActivity(en);
        }
    }
}
