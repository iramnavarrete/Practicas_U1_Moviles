package com.example.EVA1_7_SCREEN;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button boton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.append("Hola\n");
            }
        });

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            Log.wtf("tag","PANTALLA");
        }
    }
}
