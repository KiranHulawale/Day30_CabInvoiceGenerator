package com.bridgelabz;
import java.util.HashMap;
import java.util.Map;

public class InvoiceGenerator {

    int costPerKm = 10;
    int costPerMin = 1;
    int minFare = 5;
    double totalFare = 0;
    double averageFarePerRide = 0;


    double costPerKmNormal = 10;
    int costPerMinNormal = 1;
    double minFareNormal = 5;
    double costPerKmPremium = 15;
    int costPerMinPremium = 2;
    double minFareNormalPremium = 20;


    //Calculating total fare....
    public double generateInvoice(double distance, int time) {
        totalFare = distance * costPerKm + time * costPerMin;
        if (totalFare < minFare) {
            return minFare;
        } else {
            return totalFare;
        }
    }

    //Multiple Ride...
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

    // Getting list of rides by using id...
    public InvoiceSummary getInvoice(int userId) {
        Map<Integer, Ride[]> map = new HashMap<>();

        Ride[] rides1 = {new Ride(5.0, 5),
                new Ride(0.1, 1)
        };
        Ride[] rides2 = {new Ride(7.0, 10),
                new Ride(6, 1)
        };

        Ride[] rides3 = {new Ride(8.0, 15),
                new Ride(9, 10)
        };
        map.put(1, rides1);
        map.put(2, rides2);
        map.put(3, rides3);

        for (Map.Entry<Integer, Ride[]> entry : map.entrySet()) {
            if (userId == entry.getKey()) {
                System.out.println(entry.getKey());
                Ride[] ridesArray = entry.getValue();
                System.out.println(ridesArray);
                //         return invoiceSummary(ridesArray);
            }
        }
        return null;
    }

    public double calculateFare(double distance, int time, String type) {
        if (type.equalsIgnoreCase("Normal")) {
            totalFare = distance * costPerKmNormal + time * costPerMinNormal;
            return Math.max(totalFare, minFareNormal);

        } else if (type.equalsIgnoreCase("Premium")) {
            totalFare = distance * costPerKmPremium + time * costPerMinPremium;
            return Math.max(totalFare, minFareNormalPremium);

        } else {
            System.out.println("Please Enter Proper Customer Type");
            return 0.0;
        }
    }


    public double calculateFareMultipleRides(Ride[] rides, String type) {
        double totalFare = 0.0;
        if (type.equalsIgnoreCase("Normal")) {
            for (Ride ride : rides) {
                totalFare += calculateFare(ride.distance, (int) ride.time, type);
            }
            return totalFare;

        } else if (type.equalsIgnoreCase("Premium")) {
            for (Ride ride : rides) {
                totalFare += calculateFare(ride.distance, (int) ride.time, type);

            }
            return totalFare;
        } else
            System.out.println("Please Enter Proper Customer Type");
        return 0.0;
    }


    public InvoiceSummary invoiceSummaryType(Ride[] rides, String type) {
        double totalFare = 0.0;
        if (type.equalsIgnoreCase("Normal")) {
            for (Ride ride : rides) {
                totalFare += calculateFare(ride.distance, (int) ride.time,type);
            }
        } else if (type.equalsIgnoreCase("Premium")) {
            for (Ride ride : rides) {
                totalFare += calculateFare(ride.distance, (int) ride.time,type);
            }
        }
        return new InvoiceSummary(rides.length, totalFare);
    }

}
