package com.example.eva1_5_radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    RadioGroup rdGroupComida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdGroupComida = findViewById(R.id.rdGroupComida);
        rdGroupComida.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
        String sMensa="";
        if (checkedId == R.id.radioButton){
            sMensa = "Tacos";
        }else if (checkedId == R.id.radioButton2){
            sMensa = "Tortas";
        }
        else if (checkedId == R.id.radioButton3){
            sMensa = "Burritos";
        }else {
            sMensa = "Montados";
        }

        Toast.makeText(this,sMensa,Toast.LENGTH_SHORT).show();
    }
}
