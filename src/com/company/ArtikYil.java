package com.company;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        Scanner sc = new Scanner(System.in);
        System.out.print("Yil : ");
        yil=sc.nextInt();
        if(yil%4==0 && (yil%100!=0||yil%400==0)){
            System.out.println(yil+" artik yildir.");
        }
        else {
            System.out.println(yil+" artik yil degildir..");
        }
    }
}
