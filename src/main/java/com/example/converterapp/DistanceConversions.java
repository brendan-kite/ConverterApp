package com.example.converterapp;

/**
 * @author Brendan Kite
 * Class that will convert units of distance
 * Note: Some formulas only yeild approximate answers, so I will
 *       need to go back and fix them eventually. I also need to look
 *       into if a single method with a switch statement would be
 *       more efficient than a method for each conversion.
 */

public class DistanceConversions {
    // -- Kilometer to other measurements
    public double kilometerToMeter(double kilometer) {
        return kilometer * 1000;
    }
    public double kilometerToCentimeter(double kilometer) {
        return kilometer * 100000;
    }
    //Need to Implement
    public double kilometerToMillimeter(double kilometer) {
        return kilometer * 100000;
    }
    //Need to Implement
    public double kilometerToMicrometer(double kilometer) {
        return kilometer * 100000;
    }
    //Need to Implement
    public double kilometerToNanometer(double kilometer) {
        return kilometer * 100000;
    }
    public double kilometerToMile(double kilometer) {
        return kilometer / 1.609;
    }
    public double kilometerToYard(double kilometer) {
        return kilometer * 1094;
    }
    public double kilometerToFoot(double kilometer) {
        return kilometer * 3281;
    }
    public double kilometerToInch(double kilometer) {
        return kilometer * 39370;
    }
    public double kilometerToNauticalMile(double kilometer) {
        return kilometer / 1.852;
    }

    // -- Meter to other measurements
    public double meterToKilometer(double meter) {
        return meter / 1000;
    }
    public double meterToCentimeter(double meter) {
        return meter * 100;
    }
    //Need to Implement
    public double meterToMillimeter(double meter) {
        return meter * 1000;
    }
    //Need to Implement
    public double meterToMicrometer(double meter) {
        return meter * 100000;
    }
    //Need to Implement
    public double meterToNanometer(double meter) {
        return meter * 100000;
    }
    public double meterToMile(double meter) {
        return meter / 1609;
    }
    public double meterToYard(double meter) {
        return meter * 1.094;
    }
    public double meterToFoot(double meter) {
        return meter * 3.281;
    }
    public double meterToInch(double meter) {
        return meter * 39.37;
    }
    public double meterToNauticalMile(double meter) {
        return meter / 1852;
    }

    // -- Centimeter to other measurements
    public double centimeterToKilometer(double centimeter) {
        return centimeter / 100000;
    }
    public double centimeterToMeter(double centimeter) {
        return centimeter / 100;
    }
    public double centimeterToMillimeter(double centimeter) {
        return centimeter * 10;
    }
    public double centimeterToMicrometer(double centimeter) {
        return centimeter * 10000;
    }
    //Need to Implement
    public double centimeterToNanometer(double centimeter) {
        return centimeter * 100000;
    }
    public double centimeterToMile(double centimeter) {
        return centimeter / 160900;
    }
    public double centimeterToYard(double centimeter) {
        return centimeter / 91.44;
    }
    public double centimeterToFoot(double centimeter) {
        return centimeter / 30.48;
    }
    public double centimeterToInch(double centimeter) {
        return centimeter / 2.54;
    }
    public double centimeterToNauticalMile(double centimeter) {
        return centimeter / 185200;
    }

    // -- Millimeter to other measurements
    //Need to Implement
    public double millimeterToKilometer(double millimeter) {
        return millimeter / 100000;
    }
    public double millimeterToMeter(double millimeter) {
        return millimeter / 1000;
    }
    public double millimeterToCentimeter(double millimeter) {
        return millimeter / 10;
    }
    public double millimeterToMicrometer(double millimeter) {
        return millimeter / 1000;
    }
    //Need to Implement
    public double millimeterToNanometer(double millimeter) {
        return millimeter * 100000;
    }
    //Need to Implement
    public double millimeterToMile(double millimeter) {
        return millimeter / 160900;
    }
    public double millimeterToYard(double millimeter) {
        return millimeter / 914.4;
    }
    public double millimeterToFoot(double millimeter) {
        return millimeter / 304.8;
    }
    public double millimeterToInch(double millimeter) {
        return millimeter / 25.4;
    }
    //Need to Implement
    public double millimeterToNauticalMile(double millimeter) {
        return millimeter / 185200;
    }

    // -- Micrometer to other measurements
    //Need to Implement
    public double micrometerToKilometer(double micrometer) {
        return micrometer / 100000;
    }
    //Need to Implement
    public double micrometerToMeter(double micrometer) {
        return micrometer / 1000;
    }
    public double micrometerToCentimeter(double micrometer) {
        return micrometer / 10000;
    }
    public double micrometerToMillimeter(double micrometer) {
        return micrometer / 1000;
    }
    //Need to Implement
    public double micrometerToNanometer(double micrometer) {
        return micrometer * 1000;
    }
    //Need to Implement
    public double micrometerToMile(double micrometer) {
        return micrometer / 160900;
    }
    public double micrometerToYard(double micrometer) {
        return micrometer / 914400;
    }
    public double micrometerToFoot(double micrometer) {
        return micrometer / 304800;
    }
    public double micrometerToInch(double micrometer) {
        return micrometer / 25400;
    }
    //Need to Implement
    public double micrometerToNauticalMile(double micrometer) {
        return micrometer / 185200;
    }

    // -- Nanometer to other measurements
    //Need to Implement
    public double nanometerToKilometer(double nanometer) {
        return nanometer / 100000;
    }
    //Need to Implement
    public double nanometerToMeter(double nanometer) {
        return nanometer / 1000;
    }
    //Need to Implement
    public double nanometerToCentimeter(double nanometer) {
        return nanometer / 10000;
    }
    //Need to Implement
    public double nanometerToMillimeter(double nanometer) {
        return nanometer / 1000;
    }
    //Need to Implement
    public double nanometerToMicrometer(double nanometer) {
        return nanometer / 1000;
    }
    //Need to Implement
    public double nanometerToMile(double nanometer) {
        return nanometer / 160900;
    }
    //Need to Implement
    public double nanometerToYard(double nanometer) {
        return nanometer / 914400;
    }
    //Need to Implement
    public double nanometerToFoot(double nanometer) {
        return nanometer / 304800;
    }
    //Need to Implement
    public double nanometerToInch(double nanometer) {
        return nanometer / 25400;
    }
    //Need to Implement
    public double nanometerToNauticalMile(double nanometer) {
        return nanometer / 185200;
    }

    // -- Mile to other measurements
    public double mileToMeter(double mile) {
        return mile * 1609;
    }
    public double mileToCentimeter(double mile) {
        return mile * 160900;
    }
    //Need to Implement
    public double mileToMillimeter(double mile) {
        return mile * 100000;
    }
    //Need to Implement
    public double mileToMicrometer(double mile) {
        return mile * 100000;
    }
    //Need to Implement
    public double mileToNanometer(double mile) {
        return mile * 100000;
    }
    public double mileToKilometer(double mile) {
        return mile * 1.609;
    }
    public double mileToYard(double mile) {
        return mile * 1760;
    }
    public double mileToFoot(double mile) {
        return mile * 5280;
    }
    public double mileToInch(double mile) {
        return mile * 63360;
    }
    public double mileToNauticalMile(double mile) {
        return mile / 1.151;
    }

    // -- Yard to other measurements
    public double yardToMeter(double yard) {
        return yard / 1.094;
    }
    public double yardToCentimeter(double yard) {
        return yard * 91.44;
    }
    public double yardToMillimeter(double yard) {
        return yard * 914.4;
    }
    public double yardToMicrometer(double yard) {
        return yard * 914400;
    }
    //Need to Implement
    public double yardToNanometer(double yard) {
        return yard * 100000;
    }
    public double yardToKilometer(double yard) {
        return yard / 1094;
    }
    public double yardToMile(double yard) {
        return yard / 1760;
    }
    public double yardToFoot(double yard) {
        return yard * 3;
    }
    public double yardToInch(double yard) {
        return yard * 36;
    }
    public double yardToNauticalMile(double yard) {
        return yard / 2025;
    }

    // -- Foot to other measurements
    public double footToMeter(double foot) {
        return foot / 3.281;
    }
    public double footToCentimeter(double foot) {
        return foot * 30.48;
    }
    public double footToMillimeter(double foot) {
        return foot * 304.8;
    }
    public double footToMicrometer(double foot) {
        return foot * 304800;
    }
    //Need to Implement
    public double footToNanometer(double foot) {
        return foot * 100000;
    }
    public double footToKilometer(double foot) {
        return foot / 3281;
    }
    public double footToMile(double foot) {
        return foot / 5280;
    }
    public double footToYard(double foot) {
        return foot / 3;
    }
    public double footToInch(double foot) {
        return foot * 12;
    }
    public double footToNauticalMile(double foot) {
        return foot / 6076;
    }

    // -- Inch to other measurements
    public double inchToMeter(double inch) {
        return inch / 39.37;
    }
    public double inchToCentimeter(double inch) {
        return inch * 2.54;
    }
    public double inchToMillimeter(double inch) {
        return inch * 25.4;
    }
    public double inchToMicrometer(double inch) {
        return inch * 25400;
    }
    //Need to Implement
    public double inchToNanometer(double inch) {
        return inch * 100000;
    }
    public double inchToKilometer(double inch) {
        return inch / 39370;
    }
    public double inchToMile(double inch) {
        return inch / 63360;
    }
    public double inchToYard(double inch) {
        return inch / 36;
    }
    public double inchToFoot(double inch) {
        return inch / 12;
    }
    public double inchToNauticalMile(double inch) {
        return inch / 72910;
    }

    // -- Nautical Mile to other measurements
    public double nMileToMeter(double nMile) {
        return nMile * 1852;
    }
    public double nMileToCentimeter(double nMile) {
        return nMile * 185200;
    }
    //Need to Implement
    public double nMileToMillimeter(double nMile) {
        return nMile * 25.4;
    }
    //Need to Implement
    public double nMileToMicrometer(double nMile) {
        return nMile * 25400;
    }
    //Need to Implement
    public double nMileToNanometer(double nMile) {
        return nMile * 100000;
    }
    public double nMileToKilometer(double nMile) {
        return nMile * 1.852;
    }
    public double nMileToMile(double nMile) {
        return nMile * 1.151;
    }
    public double nMileToYard(double nMile) {
        return nMile * 2025;
    }
    public double nMileToFoot(double nMile) {
        return nMile * 6076;
    }
    public double nMileToInch(double nMile) {
        return nMile * 72910;
    }
}
