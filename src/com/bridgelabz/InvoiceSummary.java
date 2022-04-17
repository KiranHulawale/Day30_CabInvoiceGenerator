package com.bridgelabz;

public class InvoiceSummary {
    public int rideCount;
    public double totalFare;
    public double avgFare;

    public  InvoiceSummary(int rideCount, double totalFare) {
        super();
        this.rideCount = rideCount;
        this.totalFare = totalFare;
        this.avgFare = avgFare;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        InvoiceSummary other = (InvoiceSummary) obj;
        return Double.doubleToLongBits(avgFare) == Double.doubleToLongBits(other.avgFare)
                && rideCount == other.rideCount
                && Double.doubleToLongBits(totalFare) == Double.doubleToLongBits(other.totalFare);
    }
}
