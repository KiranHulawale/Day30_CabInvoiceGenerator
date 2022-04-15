package com.bridgelabz;

public class CabInvoice {


    public static void main(String[] args) {
        InvoiceGenerator invoice = new InvoiceGenerator();
        System.out.println(invoice.generateInvoice(7.5, 4));
        Ride[] rides = {new Ride(6, 3),
                new Ride(5,3),
                new Ride(9,6)
        };
        System.out.println(invoice.multiplefare(rides));
    }
    }
