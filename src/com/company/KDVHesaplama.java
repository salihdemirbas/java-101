package com.company;

import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {
        double kdvOran = 0.18;
    Scanner sc = new Scanner(System.in);
    System.out.print("Lütfen ürünün fiyatını giriniz: ");
    double tutar = sc.nextDouble();
        System.out.println("KDV'siz Tutar= "+tutar);
        System.out.println("KDV = "+(tutar*kdvOran) );
        System.out.println("KDVli Tutar = "+((tutar*kdvOran)+tutar));


}}
