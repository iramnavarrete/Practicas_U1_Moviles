package com.example.eva1_11_lista_restaurantes;

public class Restaurant {
    private int imagen;
    private String nombre;
    private String tipo;


    public Restaurant(int imagen, String nombre,  String tipo) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
