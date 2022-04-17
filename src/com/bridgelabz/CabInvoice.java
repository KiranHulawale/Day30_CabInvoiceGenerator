package com.bridgelabz;

public class CabInvoice {

    public static void main(String[] args) {
        InvoiceGenerator invoice = new InvoiceGenerator();
        System.out.println(invoice.generateInvoice(5.5, 4));
        Ride[] rides = {new Ride(4, 5),
                new Ride(3,7),
                new Ride(5,8)
        };
        System.out.println(invoice.multipleFare(rides));

    }


}
