package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();
        Account obj = new Account(a,b,c);
        if(obj.getDiscriminant() > 0) {
            System.out.printf("Phương trình có 2 nghiệm là %f và %f",obj.getRoot1(obj.getDiscriminant()), obj.getRoot2(obj.getDiscriminant()));
        } else if(obj.getDiscriminant() == 0) {
            System.out.printf("Phương trình có 2 nghiệm bằng nhau là %f",obj.getRoot1(obj.getDiscriminant()));
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
