package com.company;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        double n1,n2,sonuc;
        int secim;
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen ilk sayiyi giriniz: ");
        n1=sc.nextDouble();
        System.out.print("Lütfen ikinci sayiyi giriniz: ");
        n2=sc.nextDouble();
        System.out.println("Yapmak istediginiz islemi seciniz");
        System.out.println("1-Toplama");
        System.out.println("2-Çıkarma");
        System.out.println("3-Çarpma");
        System.out.println("4-Bölme");
        System.out.println("--------------------------------");
        secim=sc.nextInt();
        if(secim==1){
            sonuc=n1+n2;
            System.out.println("Sonuc: "+sonuc);
        }
        else if(secim==2){
            sonuc=n1-n2;
            System.out.println("Sonuc: "+sonuc);
        }
        else if(secim==3){
            sonuc=n1*n2;
            System.out.println("Sonuc: "+sonuc);
        }
        else if(secim==4){
            if(n2==0){
                System.out.println("İkinci sayi 0 olamaz..");
            }
            else{
            sonuc=n1/n2;
            System.out.println("Sonuc: "+sonuc);}

        }
        else{
            System.out.println("Hatalı secim yaptiniz...");
            System.out.println("Çıkış yapılıyor....");
        }
    }
}
