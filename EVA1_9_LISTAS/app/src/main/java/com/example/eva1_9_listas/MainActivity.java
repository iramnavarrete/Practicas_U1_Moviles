package com.example.eva1_9_listas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener {
    String []  asResta = {
            "Montados la junta",
            "Montados Don Pepe",
            "Tortas el cubano",
            "Burritos Doña Coco",
            "Piripau",
            "Burritos Reyna",
            "Cafenio",
            "Tacos pedorros",
            "Gorditas Doña Tota"
    };
    ListView listView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listVwListaDatos);
        textView = findViewById(R.id.textView);
        //Contexto, como se ve, lista
        listView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1, asResta));
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //Toast.makeText(this,asResta[i],Toast.LENGTH_SHORT).show();
        textView.setText(asResta[i]);
    }
}
