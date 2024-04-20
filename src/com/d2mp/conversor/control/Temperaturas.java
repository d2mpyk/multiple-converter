package com.d2mp.conversor.control;

public class Temperaturas {
    public Temperaturas() {
    }
    public double CelsiusToFarenheith(double temperatura){
        return (((double) 9/5) * temperatura) + 32;
    }
    public double FarenheitToCelsius(double temperatura){
        return (double)(5/9)*(temperatura-32);
    }
    public double CelsiusToKelvin(double temperatura){
        return temperatura+273.15;
    }
    public double KelvinToCelsius(double temperatura){
        return temperatura-273.15;
    }
    public double FarenheitToKelvin(double temperatura){
        return FarenheitToCelsius(temperatura)+273.15;
    }
    public double KelvinToFarenheit(double temperatura){
        return (((double) 9/5) * (temperatura - 273.15)) + 32;
    }
}
