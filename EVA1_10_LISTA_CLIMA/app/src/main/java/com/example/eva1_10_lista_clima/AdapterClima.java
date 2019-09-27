package com.example.eva1_10_lista_clima;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterClima extends ArrayAdapter<Clima> {

    Context context;
    int resource;
    Clima[] cCiudades;

    public AdapterClima(Context context, int resource, Clima[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.cCiudades = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgClima;
        TextView txtVwCiudad, txtVwTemp, txtVwClima;

        //ConvertView es el layout que representa una fila en la lista
        if (convertView == null){
            //Crear nuestro Layout
            //Inflater
            LayoutInflater layoutInflater = ((Activity)context).getLayoutInflater();
            convertView = layoutInflater.inflate(resource, parent, false);
        }
        imgClima = convertView.findViewById(R.id.imgClima);
        txtVwCiudad = convertView.findViewById(R.id.txtVwCiudad);
        txtVwTemp = convertView.findViewById(R.id.textViewTemp);
        txtVwClima = convertView.findViewById(R.id.textViewClima);

        imgClima.setImageResource(cCiudades[position].getImagen());
        txtVwCiudad.setText(cCiudades[position].getCiudad());
        txtVwTemp.setText(cCiudades[position].getTemp() + "°C");
        txtVwClima.setText(cCiudades[position].getClima());

        return convertView;
    }
}
