package com.company;

import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        double sicaklik;
        Scanner sc = new Scanner(System.in);
        System.out.print("Sicaklik: ");
        sicaklik=sc.nextDouble();
        if(sicaklik<5){
            System.out.println("Kayak yapabilirsin.");
        }
        else if(sicaklik>=5 && sicaklik<15){
            System.out.println("Sinemaya gidebilirsin.");
        }
        else if(sicaklik>=15 && sicaklik<25){
            System.out.println("Pikniğe gidebilirsin.");
        }
        else if(sicaklik>=25){
            System.out.println("Yüzmeye gidebilirsin.");
        }
    }
}
