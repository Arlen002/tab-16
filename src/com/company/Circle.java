package com.company;

import java.util.Scanner;

public class Circle {
    private static final int PI = 10;

    static void area(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Сан жазыныз: ");
        int radius = sc.nextInt();
        int aynt = PI * (radius * radius);
        System.out.println("Айлананын аянты: "+aynt);
    }
    static void circumference(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Сан жазыныз: ");
        int radius = sc.nextInt();
        int around = PI * 2 * radius;
        System.out.println("Айлананын узундугу: "+around);

    }
}
