package com.example.converterapp;


/**
 * @author Brendan Kite
 * Class to be used to calculate the difference between US and Metric wrench sizes
 * Need to research the conversion more as I have not found a viable method to convert cleanly
 */
public class WrenchSizes {
    public double metricToStandard(double metric) {
        double metricToInch = metric * 0.03937;
        return 0;
    }

    public int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }
}
