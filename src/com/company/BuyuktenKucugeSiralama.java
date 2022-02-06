package com.company;

import java.util.Scanner;

public class BuyuktenKucugeSiralama {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Birinci Sayi: ");
        a=sc.nextInt();

        System.out.print("İkinci Sayi: ");
        b=sc.nextInt();

        System.out.print("Üçüncü Sayi: ");
        c=sc.nextInt();

        if(a>b && a>c){
            if(b>c){
                System.out.println("a>b>c");
            }
            else if(c>b){
                System.out.println("a>c>b");
            }
            else{
                System.out.println("a>b=c");
            }
        }
        else if(b>a && b>c){
            if(a>c){
                System.out.println("b>a>c");
            }
            else if (c>a){
                System.out.println("b>c>a");
            }
            else{
                System.out.println("b>c=a");
            }
        }
        else if(c>a && c>b){
            if(a>b){
                System.out.println("c>a>b");
            }
            else if (b>a){
                System.out.println("c>b>a");
            }
            else {
                System.out.println("c>b=a");
            }
        }
    }
}
