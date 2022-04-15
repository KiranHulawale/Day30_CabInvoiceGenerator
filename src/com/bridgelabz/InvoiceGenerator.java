package com.bridgelabz;

public class InvoiceGenerator {
    

    int costPerKm = 10;
    int costPerMin = 1;

    public double generateInvoice(double distance, int time) {
        double fare =  distance * costPerKm + time * costPerMin;
        return fare > 5 ? fare : 5;
    }
    
    public double multiplefare(Ride[] rides) {
        double singleFare;
        double totalFare = 0;
        for (Ride ride  : rides) {
            singleFare = totalFare + generateInvoice(ride.distance, (int) ride.time);
            totalFare += singleFare > 5 ? singleFare : 5;
        }
        return totalFare;
    }
}
