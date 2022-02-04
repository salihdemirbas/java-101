package com.company;

import java.util.Scanner;

public class TaksimetreHesaplama
{
    public static void main(String[] args) {
        double kmBasiUcret = 2.20;
        double acilisBedeli = 10;
        double mesafe;
        Scanner sc = new Scanner(System.in);

        System.out.print("Gidilecek Mesafe: ");
        mesafe = sc.nextDouble();
        System.out.println("Tutar: "+(((mesafe*kmBasiUcret)+acilisBedeli)));





    }
}
