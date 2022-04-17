package com.bridgelabz;

public class InvoiceGenerator {


    int costPerKm = 10;
    int costPerMin = 1;
    double totalFare = 0;
    double averageFarePerRide = 0;

    public double generateInvoice(double distance, int time) {
        double fare =  distance * costPerKm + time * costPerMin;
        return fare > 5 ? fare : 5;
    }


    public double multipleFare(Ride[] rides) {
        totalFare = 0.0;
        for (Ride ride : rides) {
            totalFare = totalFare + generateInvoice(ride.distance, (int) ride.time);
        }
        System.out.print("Total Fare is: ");
        return totalFare;
    }

    //Invoice summary...
    public InvoiceSummary invoiceSummary(Ride[] rides) {
        totalFare = 0.0;
        for (Ride ride : rides) {
            totalFare = totalFare + generateInvoice(ride.distance, (int) ride.time);
        }
        //    System.out.println(rides.length);
        return new InvoiceSummary(rides.length, totalFare);

    }


}
