package com.example.eva1_10_lista_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  ListView.OnItemClickListener{
    Clima [] cCiudades = {
            new Clima(),
            new Clima(R.drawable.atmospher,"Aldama",25,"Chido"),
            new Clima(R.drawable.cloudy,"Camargo",28,"Nice!"),
            new Clima(R.drawable.light_rain,"Parral",25,"Llivioso"),
            new Clima(R.drawable.rainy,"Madera",25,"Lluvias intensas"),
            new Clima(R.drawable.snow,"Creel",25,"Nevadas"),
            new Clima(R.drawable.thunderstorm,"Jiménez",25,"Tormeta"),
            new Clima(R.drawable.tornado,"Delicias",25,"Run like hell")

    };

    ListView listaClima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaClima = findViewById(R.id.listaClima);
        listaClima.setAdapter(new AdapterClima(this,R.layout.layout_clima,cCiudades));
        listaClima.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this,cCiudades[i].getCiudad(),Toast.LENGTH_SHORT).show();
    }
}
