package com.example.converterapp;

public class TemperatureConversions {
    private double FahrenheitToCelsius(double F) {
        return((F - 32) * 1.8);
    }
    private double FahrenheitToKelvin(double F) {
        return((F - 32) * 1.8 + 273.15);
    }
    private double CelsiusToFahrenheit(double C) {
        return((C * 1.8) + 32);
    }
    private double CelsiusToKelvin(double C) {
        return(C + 273.15);
    }
    private double KelvinToFahrenheit(double K) {
        return((K - 273.15) * 1.8 + 32);
    }
    private double KelvinToCelsius(double K) {
        return(K - 273.15);
    }
}
