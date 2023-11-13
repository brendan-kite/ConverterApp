package com.example.converterapp;

/**
 * @author Brendan Kite
 * Class to aid in common cooking measurement conversions
 */
public class CookingConversions {

    // -- Conversions from cup to other measurements
    public double cupToFluidOunce(double cups) {
        return(cups * 8.115);
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
    public double cupToLiter(double cups) {
        return(cups / 4.167);
    }
    public double cupToMilliliter(double cups) {
        return(cups * 240);
    }


    // -- Converts fluid ounce to other measurements
    public double fluidOunceToCup(double fluidOz) {
        return(fluidOz / 8.115);
    }
    public double fluidOunceToGallon(double fluidOz) {
        return(fluidOz / 128);
    }
    public double fluidOunceToQuart(double fluidOz) {
        return(fluidOz / 32);
    }
    public double fluidOunceToPint(double fluidOz) {
        return(fluidOz / 16);
    }
    public double fluidOunceToTablespoon(double fluidOz) {
        return(fluidOz * 2);
    }
    public double fluidOunceToTeaspoon(double fluidOz) {
        return(fluidOz * 6);
    }
    public double fluidOunceToLiter(double fluidOz) {
        return(fluidOz / 33.814);
    }
    public double fluidOunceToMilliliter(double fluidOz) {
        return(fluidOz * 29.574);
    }

    // -- Tablespoon to other measurements
    public double tablespoonToCup(double tbsp) {
        return(tbsp / 16);
    }
    public double tablespoonToGallon(double tbsp) {
        return(tbsp / 256);
    }
    public double tablespoonToQuart(double tbsp) {
        return(tbsp / 64);
    }
    public double tablespoonToPint(double tbsp) {
        return(tbsp / 32);
    }
    public double tablespoonToFluidOunce(double tbsp) {
        return(tbsp / 2);
    }
    public double tablespoonToTeaspoon(double tbsp) {
        return(tbsp * 3);
    }
    public double tablespoonToLiter(double tbsp) {
        return(tbsp / 67.628);
    }
    public double tablespoonToMilliliter(double tbsp) {
        return(tbsp * 14.787);
    }

    // -- Teaspoon to other measurements
    public double teaspoonToCup(double tsp) {
        return(tsp / 48.692);
    }
    public double teaspoonToGallon(double tsp) {
        return(tsp / 768);
    }
    public double teaspoonToQuart(double tsp) {
        return(tsp / 192);
    }
    public double teaspoonToPint(double tsp) {
        return(tsp / 96);
    }
    public double teaspoonToFluidOunce(double tsp) {
        return(tsp / 6);
    }
    public double teaspoonToTablespoon(double tsp) {
        return(tsp / 3);
    }
    public double teaspoonToLiter(double tsp) {
        return(tsp / 202.9);
    }
    public double teaspoonToMilliliter(double tsp) {
        return(tsp * 4.929);
    }

    // -- Gallon to other measurements
    public double gallonToCup(double gallon) {
        return(gallon * 15.773);
    }
    public double gallonToQuart(double gallon) {
        return(gallon * 4);
    }
    public double gallonToPint(double gallon) {
        return(gallon * 8);
    }
    public double gallonToFluidOunce(double gallon) {
        return(gallon * 128);
    }
    public double gallonToTablespoon(double gallon) {
        return(gallon * 256);
    }
    public double gallonToTeaspoon(double gallon) {
        return(gallon * 768);
    }
    public double gallonToLiter(double gallon) {
        return(gallon * 3.78541);
    }
    public double gallonToMilliliter(double gallon) {
        return(gallon * 3785);
    }

    // -- Quart to other measurements
    public double quartToCup(double quart) {
        return(quart * 3.94314);
    }
    public double quartToGallon(double quart) {
        return(quart / 4);
    }
    public double quartToPint(double quart) {
        return(quart * 2);
    }
    public double quartToFluidOunce(double quart) {
        return(quart * 32);
    }
    public double quartToTablespoon(double quart) {
        return(quart * 64);
    }
    public double quartToTeaspoon(double quart) {
        return(quart * 192);
    }
    public double quartToLiter(double quart) {
        return(quart / 1.057);
    }
    public double quartToMilliliter(double quart) {
        return(quart * 946.4);
    }

    // -- Pint to other measurements
    public double pintToCup(double pint) {
        return(pint * 1.972);
    }
    public double pintToQuart(double pint) {
        return(pint * 2);
    }
    public double pintToGallon(double pint) {
        return(pint / 8);
    }
    public double pintToFluidOunce(double pint) {
        return(pint * 16);
    }
    public double pintToTablespoon(double pint) {
        return(pint * 32);
    }
    public double pintToTeaspoon(double pint) {
        return(pint * 96);
    }
    public double pintToLiter(double pint) {
        return(pint / 2.113);
    }
    public double pintToMilliliter(double pint) {
        return(pint * 473.2);
    }

    // -- Liter to other measurements
    public double literToCup(double l) {
        return(l * 4.167);
    }
    public double lintToQuart(double l) {
        return(l * 1.057);
    }
    public double literToGallon(double l) {
        return(l / 3.785);
    }
    public double literToFluidOunce(double l) {
        return(l * 33.814);
    }
    public double literToTablespoon(double l) {
        return(l * 67.628);
    }
    public double literToTeaspoon(double l) {
        return(l * 202.9);
    }
    public double literToPint(double l) {
        return(l * 2.113);
    }
    public double literToMilliliter(double l) {
        return(l * 1000);
    }

    // -- MilliLiter to other measurements
    public double milliLiterToCup(double ml) {
        return(ml / 240);
    }
    public double milliLiterToQuart(double ml) {
        return(ml / 946.4);
    }
    public double milliLiterToGallon(double ml) {
        return(ml / 3785);
    }
    public double milliLiterToFluidOunce(double ml) {
        return(ml / 29.574);
    }
    public double milliLiterToTablespoon(double ml) {
        return(ml / 14.787);
    }
    public double milliLiterToTeaspoon(double ml) {
        return(ml / 4.929);
    }
    public double milliLiterToLiter(double ml) {
        return(ml / 1000);
    }
    public double milliLiterToPint(double ml) {
        return(ml / 473.2);
    }
}
