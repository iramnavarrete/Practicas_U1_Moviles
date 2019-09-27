package com.example.eva1_11_lista_restaurantes;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterRestaurant extends ArrayAdapter<Restaurant> {
    Context context;
    int resource;
    Restaurant[] restaurants;

    public AdapterRestaurant(Context context, int resource, Restaurant[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.restaurants = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgRestaurant;
        TextView txtVwNombre,  txtVwTipo;

        //ConvertView es el layout que representa una fila en la lista
        if (convertView == null){
            //Crear nuestro Layout
            //Inflater
            LayoutInflater layoutInflater = ((Activity)context).getLayoutInflater();
            convertView = layoutInflater.inflate(resource, parent, false);
        }
        imgRestaurant = convertView.findViewById(R.id.imageViewImagen);
        txtVwNombre = convertView.findViewById(R.id.textViewNombre);
        txtVwTipo = convertView.findViewById(R.id.textViewTipo);

        imgRestaurant.setImageResource(restaurants[position].getImagen());
        txtVwNombre.setText(restaurants[position].getNombre());
        txtVwTipo.setText(restaurants[position].getTipo());

        return convertView;
    }
}
