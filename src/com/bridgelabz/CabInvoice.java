package com.bridgelabz;

public class CabInvoice {

    static InvoiceGenerator invoice = new InvoiceGenerator();

    public static void main(String[] args) {

        System.out.println(invoice.generateInvoice(3,3));
    }
}
