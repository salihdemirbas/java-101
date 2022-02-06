package com.company;

import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        int mesafe,yas,yolculukTipi;
        double normalTutar,yasIndirimi,indirimliTutar,gidisDonusIndirimi,sonuc;
        Scanner sc = new Scanner(System.in);

        System.out.print("Mesafe(km): ");
        mesafe = sc.nextInt();

        System.out.print("Yas: ");
        yas = sc.nextInt();

        System.out.print("Yolculuk Tipi(1-Tek Yön -- 2-Gidiş/Dönüş): ");
        yolculukTipi = sc.nextInt();

        if(mesafe<0 || yas<0 || (yolculukTipi<1 || yolculukTipi>2)){
            System.out.println("Hatali Veri Girişi");
        }
        else{
            normalTutar = mesafe *0.1;
            if(yas<13){
                yasIndirimi=normalTutar*0.5;

                if(yolculukTipi==1){
                    sonuc=normalTutar-yasIndirimi;
                    System.out.println("Tutar: " +sonuc);
                }
                else{
                    gidisDonusIndirimi=(normalTutar-yasIndirimi)*0.2;
                    sonuc=(normalTutar-yasIndirimi)-gidisDonusIndirimi;
                    System.out.println("Tutar: " +sonuc);

                }
            }
            else if(yas>12 && yas<25){
                yasIndirimi=normalTutar*0.1;
                if(yolculukTipi==1){
                    sonuc=normalTutar-yasIndirimi;
                    System.out.println("Tutar: " +sonuc);
                }
                else{
                    gidisDonusIndirimi=(normalTutar-yasIndirimi)*0.2;
                    sonuc=((normalTutar-yasIndirimi)-gidisDonusIndirimi)*2;
                    System.out.println("Tutar: " +sonuc);

                }
            }
            else if(yas>64){
                yasIndirimi=normalTutar*0.3;
                if(yolculukTipi==1){
                    sonuc=normalTutar-yasIndirimi;
                    System.out.println("Tutar: " +sonuc);
                }
                else{
                    gidisDonusIndirimi=(normalTutar-yasIndirimi)*0.2;
                    sonuc=((normalTutar-yasIndirimi)-gidisDonusIndirimi)*2;
                    System.out.println("Tutar: " +sonuc);

                }
            }
            else{
                if(yolculukTipi==1){
                    System.out.println("Tutar: "+normalTutar);
                }
                else{
                    System.out.println("Tutar: "+normalTutar*2);
                }

            }



        }


    }
}
