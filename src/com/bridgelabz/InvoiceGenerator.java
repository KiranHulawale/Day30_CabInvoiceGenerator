package com.bridgelabz;

public class InvoiceGenerator {

    public double distance;
    public double time;

    public InvoiceGenerator() {
        super();
        this.distance = distance;
        this.time = time;
    }

    int costPerKm = 10;
    int costPerMin = 1;
    //int minFare = 5;
    public double generateInvoice(double distance, int time) {

        double fare =  distance * costPerKm + time * costPerMin;

        return fare > 5 ? fare : 5;
    }
}
