package com.company;

import java.util.Scanner;

public class ManavKasaProgram {
    public static void main(String[] args) {
        double armut= 2.14;
        double elma= 3.67;
        double domates=1.11;
        double muz=0.95;
        double patlican=5.00;
        Scanner sc = new Scanner(System.in);
        double armutKg,elmaKg,domatesKg,muzKg,patlicanKg;
        System.out.print("Armut Kac Kilo? ");
        armutKg=sc.nextDouble();
        double armutTutar = armutKg*armut;
        System.out.print("Elma Kac Kilo? ");
        elmaKg=sc.nextDouble();
        double elmaTutar = elmaKg*elma;
        System.out.print("Domates Kac Kilo? ");
        domatesKg=sc.nextDouble();
        double domatesTutar = domatesKg*domates;
        System.out.print("Muz Kac Kilo? ");
        muzKg=sc.nextDouble();
        double muzTutar = muzKg*muz;
        System.out.print("Patlican Kac Kilo? ");
        patlicanKg=sc.nextDouble();
        double patlicanTutar = patlican*patlicanKg;
        double toplamTutar = armutTutar + elmaTutar +domatesTutar +muzTutar+patlicanTutar;
        System.out.print("Toplam Tutar : "+toplamTutar);
    }
}
