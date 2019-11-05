package com.company;

public class Account {
    private double a;
    private double b;
    private double c;

    public Account(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Account() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return (this.b * this.b) + 4 * this.a * this.c;
    }

    public double getRoot1(double delta) {
        if (delta > 0) {
            return (-this.b + Math.pow(delta, 0.5)) / 2 * this.a;
        } else {
            return 0;
        }
    }

    public double getRoot2(double delta) {
        if (delta > 0) {
            return (-this.b - Math.pow(delta, 0.5)) / 2 * this.a;
        } else {
            return 0;
        }
    }
}
