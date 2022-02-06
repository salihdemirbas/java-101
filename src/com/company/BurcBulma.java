package com.company;

import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int ay,gun;
        Scanner sc = new Scanner(System.in);


        System.out.print("Dogdugunuz ay: ");
        ay=sc.nextInt();
        System.out.print("Dogdugunuz gun: ");
        gun=sc.nextInt();

        if(ay==1){
            if(gun>1 && gun<31){
                if(gun<22){
                    System.out.println("Burc: Oglak");
                }
                else {
                    System.out.println("Burc: Kova");
                }

            }
            else{
                System.out.println("Gecersin gun girdiniz.");
            }

        }
        else if(ay==2){
            if(gun>1 && gun<28){
                if(gun<20){
                    System.out.println("Burc: Kova");
                }
                else{
                    System.out.println("Burc: Balik");
                }
            }
            else{
                System.out.println("Hatali gun");
            }

        }
        else if(ay==3){

            if(gun>1 && gun<31){
                if(gun<20){
                    System.out.println("Burc: Balik");
                }
                else{
                    System.out.println("Burc: Koc");
                }
            }
            else{
                System.out.println("Hatali gun");
            }

        }
        else if(ay==4){
            if(gun>1 && gun<31){
                if(gun<20){
                    System.out.println("Burc: Koc");
                }
                else{
                    System.out.println("Burc: Boğa");
                }
            }
            else{
                System.out.println("Hatali gun");
            }

        }
        else if(ay==5){
            if(gun>1 && gun<31){
                if(gun<22){
                    System.out.println("Burc: Boga");
                }
                else{
                    System.out.println("Burc: İkizler");
                }
            }
            else{
                System.out.println("Hatali gun");
            }

        }
        else if(ay==6){
            if(gun>1 && gun<31){
                if(gun<23){
                    System.out.println("Burc: İkizler");
                }
                else{
                    System.out.println("Burc: Yengec");
                }
            }
            else{
                System.out.println("Hatali gun");
            }

        }
        else if(ay==7){
            if(gun>1 && gun<31){
                if(gun<23){
                    System.out.println("Burc: Yengec");
                }
                else{
                    System.out.println("Burc: Aslan");
                }
            }
            else{
                System.out.println("Hatali gun");
            }

        }
        else if(ay==8){
            if(gun>1 && gun<31){
                if(gun<23){
                    System.out.println("Burc: Aslan");
                }
                else{
                    System.out.println("Burc: Başak");
                }
            }
            else{
                System.out.println("Hatali gun");
            }

        }
        else if(ay==9){
            if(gun>1 && gun<31){
                if(gun<23){
                    System.out.println("Burc: Başak");
                }
                else{
                    System.out.println("Burc: Terazi");
                }
            }
            else{
                System.out.println("Hatali gun");
            }

        }
        else if(ay==10){
            if(gun>1 && gun<31){
                if(gun<23){
                    System.out.println("Burc: Terazi");
                }
                else{
                    System.out.println("Burc: Akrep");
                }
            }
            else{
                System.out.println("Hatali gun");
            }

        }
        else if(ay==11){
            if(gun>1 && gun<31){
                if(gun<23){
                    System.out.println("Burc: Akrep");
                }
                else{
                    System.out.println("Burc: Yay");
                }
            }
            else{
                System.out.println("Hatali gun");
            }

        }
        else if(ay==12){
            if(gun>1 && gun<31){
                if(gun<22){
                    System.out.println("Burc: Yay");
                }
                else{
                    System.out.println("Burc: Oglak");
                }
            }
            else{
                System.out.println("Hatali gun");
            }

        }
        else {
            System.out.println("Gecersiz ay girdiniz");
        }




    }
}
