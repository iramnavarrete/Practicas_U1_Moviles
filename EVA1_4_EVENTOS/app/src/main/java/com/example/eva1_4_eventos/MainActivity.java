package com.example.eva1_4_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener { //Para que escuche el listener

    private Button btnPorInt, btnPorClaseAn, btnPorClaseEx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPorInt = findViewById(R.id.btnPorInt);
        btnPorClaseAn = findViewById(R.id.btnPorClaseAn);
        btnPorClaseEx = findViewById(R.id.btnPorClaseEx);

        btnPorInt.setOnClickListener(this); //Los objetos de MainActivity
        btnPorClaseAn.setOnClickListener(new View.OnClickListener() { //Es clase anónima porque no tiene nombre
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Hola guapo", Toast.LENGTH_LONG).show(); //getApplicationContext() Devuelve el contexto de la actividad donde están incrustados
            }
        });
        MiEventoClick meClick = new MiEventoClick();
        meClick.setContext(this);
        btnPorClaseEx.setOnClickListener(meClick);

    }


    public void miClick(View v){
        //Contexto, texto, duración
        Toast.makeText(this,"Hola mundo", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this,"Evento por listener", Toast.LENGTH_LONG).show();
    }
}
