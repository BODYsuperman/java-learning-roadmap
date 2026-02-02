package com.alex.demo;

public enum CabinType {
    FIRST(0.9, 0.7),
    ECONOMY(0.85, 0.65);

    double busyDiscount;
    double slackDiscount;

    CabinType(double busy, double slack) {
        this.busyDiscount = busy;
        this.slackDiscount = slack;
    }

    public double discount(int month) {
        return (month >= 5 && month <= 10) ? busyDiscount : slackDiscount;
    }
}

