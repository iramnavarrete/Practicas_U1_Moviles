package com.example.eva1_11_lista_restaurantes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    Restaurant [] restaurants = {

            new Restaurant(R.drawable.f1,"La flor de coliflor","Restaurante elegantioso"),
            new Restaurant(R.drawable.f2,"Sushi Ricolino","Comida china"),
            new Restaurant(R.drawable.f3,"Parque del rio","Restaurante de hotel"),
            new Restaurant(R.drawable.f4,"Festive Season","Restaurante de lujo"),
            new Restaurant(R.drawable.f5,"Restaurante en burgos","Restaurante muy rosa")

    };

    ListView listaRest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaRest = findViewById(R.id.listaRest);
        listaRest.setAdapter(new AdapterRestaurant(this,R.layout.layout_restaurant,restaurants));
        listaRest.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this,restaurants[i].getNombre(),Toast.LENGTH_SHORT).show();
    }

}
