package com.company;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String kullaniciAdi,sifre;
        int secim;
        Scanner sc = new Scanner(System.in);

        System.out.print("Kullanici Adi: ");
        kullaniciAdi=sc.nextLine();
        System.out.print("Parola: ");
        sifre=sc.nextLine();

        if (kullaniciAdi.equals("salihdemirbas") && sifre.equals("12345")){
            System.out.println("GİRİS BASARİLİ");
        }
        else{
            System.out.println("Bilgileriniz hatali,sifre sifirlamak ister misiniz?");
            System.out.println("1-EVET");
            System.out.println("2-HAYIR");
            Scanner sc1 = new Scanner(System.in);
            secim=sc1.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Yeni Parola: ");
                    String yeniSifre=sc1.nextLine();
                    if(yeniSifre.equals(sifre)){
                        System.out.println("Parola olusturulamadi \n Cikis yapiliyor");
                    }
                    else{
                        System.out.println("Parola DEGİSTİRİLDİ");
                    }
                    break;
                case 2:
                    System.out.println("Çıkış yapiliyor... ");
                    break;
                default:
                    System.out.println("Hatali Secim");
            }

        }

    }
}
