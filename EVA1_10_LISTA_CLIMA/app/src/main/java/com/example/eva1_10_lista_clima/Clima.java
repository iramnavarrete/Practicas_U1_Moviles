package com.example.eva1_10_lista_clima;

public class Clima {
    private int imagen;
    private String ciudad;
    private double temp;
    private String clima;

    public Clima() {
        imagen = R.drawable.sunny;
        ciudad = "Chihuahua";
        temp = 40;
        clima = "El infierno";
    }

    public Clima(int imagen, String ciudad, double temp, String clima) {
        this.imagen = imagen;
        this.ciudad = ciudad;
        this.temp = temp;
        this.clima = clima;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }
}
