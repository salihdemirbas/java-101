package com.company;

import java.util.Scanner;

public class VucutKitleEndeksHesaplama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lutfen boyunuzu metre cinsinden giriniz: ");
        double boy = sc.nextDouble();
        System.out.print("Lutfen kilonuzu kg cinsinden giriniz: ");
        double kilo = sc.nextDouble();
        System.out.println("Vücut Kitle Endeksiniz: "+(kilo/(boy*boy)));

    }
}
