package com.d2mp.conversor.control;

import java.text.DecimalFormat;

public class Temperaturas {
    public Temperaturas() {
    }
    public double CelsiusToFarenheith(double temperatura){
        return ((1.8 * temperatura) + 32);
    }
    public double FarenheitToCelsius(double temperatura){
        return ((0.5556)*(temperatura-32));
    }
    public double CelsiusToKelvin(double temperatura){
        return temperatura+273.15;
    }
    public double KelvinToCelsius(double temperatura){
        return temperatura-273.15;
    }
    public double FarenheitToKelvin(double temperatura){
        return ((0.5556)*(temperatura-32)+273.15);
    }
    public double KelvinToFarenheit(double temperatura){
        return (((1.8) * (temperatura - 273.15)) + 32);
    }
    public double round2Decimal(double numero) {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(numero));
    }
}
