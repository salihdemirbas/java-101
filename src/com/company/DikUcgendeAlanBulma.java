package com.company;

import java.util.Scanner;

public class DikUcgendeAlanBulma {
    public static void main(String[] args){
        double aKenari, bKenari,alan;
        Scanner sc = new Scanner(System.in);
        System.out.print("A Kenarinin Uzunlugu: ");
        aKenari= sc.nextDouble();
        System.out.print("B Kenarinin Uzunlugu: ");
        bKenari=sc.nextDouble();
        alan=(aKenari*bKenari)/2;
        System.out.println("Dik Ucgenin Alanı: "+alan);
    }


}
