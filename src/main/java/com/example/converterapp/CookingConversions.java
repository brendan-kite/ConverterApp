package com.example.converterapp;

public class CookingConversions {

    // -- Conversions from cup to other measurements
    public double cupToFluidOunce(double cups) {
        return(cups * 8);
    }
    public double cupToTablespoon(double cups) {
        return(cups * 16);
    }
    public double cupToTeaspoon(double cups) {
        return(cups * 48);
    }
    public double cupToGallon(double cups) {
        return(cups / 16);
    }
    public double cupToQuart(double cups) {
        return(cups / 4);
    }
    public double cupToPint(double cups) {
        return(cups / 2);
    }
    public double fluidOunceToCup(double fluidOz) {
        return(fluidOz / 8);
    }
    public double tablespoonToCup(double tbsp) {
        return(tbsp / 16);
    }
}
