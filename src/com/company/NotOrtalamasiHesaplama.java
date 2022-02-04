package com.company;

import java.util.Scanner;

public class NotOrtalamasiHesaplama {

    public static void main(String[] args) {
        System.out.println("-------------------------------------------------");
        System.out.println("Not Ortalamasi Hesaplayan Programa Hoşgeldiniz.");
        System.out.println("-------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen Matematik sinav notunuzu giriniz...");
        int matematikNot = sc.nextInt();
        System.out.println("Lütfen Fizik sinav notunuzu giriniz...");
        int fizikNot = sc.nextInt();
        System.out.println("Lütfen Kimya sinav notunuzu giriniz...");
        int kimyaNot = sc.nextInt();
        System.out.println("Lütfen Türkçe sinav notunuzu giriniz...");
        int turkceNot = sc.nextInt();
        System.out.println("Lütfen Tarih sinav notunuzu giriniz...");
        int tarihNot = sc.nextInt();
        System.out.println("Lütfen Müzik sinav notunuzu giriniz...");
        int muzikNot = sc.nextInt();
        System.out.println("-------------------------------------------------");
        float ortalama = (matematikNot + fizikNot + kimyaNot + turkceNot + tarihNot + muzikNot)/6;
        System.out.println("Notlarinizin Ortalamasi : " +ortalama);
        System.out.println("-------------------------------------------------");

    }
}
