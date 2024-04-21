package com.d2mp.conversor.enums;

public enum UnidadDistancia {
    MILIMETRO("Milímetro", 0.001),
    CENTIMETRO("Centímetro", 0.01),
    METRO("Metro", 1.0),
    KILOMETRO("Kilómetro", 1000.0);

    private final String nombre;
    private final double valorEnMetros;

    UnidadDistancia(String nombre, double valorEnMetros) {
        this.nombre = nombre;
        this.valorEnMetros = valorEnMetros;
    }

    public String getNombre() {
        return nombre;
    }

    public double convertirAMetros(double cantidad) {
        return cantidad * valorEnMetros;
    }

    public double convertirDesdeMetros(double cantidadEnMetros) {
        return cantidadEnMetros / valorEnMetros;
    }

    public double convertirAMillas(double cantidad) {
        return convertirDesdeMetros(cantidad) / 1609.34; // 1 milla = 1609.34 metros
    }

    public double convertirDesdeMillas(double cantidadEnMillas) {
        return convertirAMetros(cantidadEnMillas * 1609.34); // 1 milla = 1609.34 metros
    }
}

