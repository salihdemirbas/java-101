package com.company;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int yil;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dogum Yili: ");
        yil=sc.nextInt();
        if(yil>0){
            if(yil%12==0){
                System.out.println("Cin Zodyagi: Maymun");
            }
            else if(yil%12==0){
                System.out.println("Cin Zodyagi: Horoz");
            }
            else if(yil%12==1){
                System.out.println("Cin Zodyagi: Köpek");
            }
            else if(yil%12==2){
                System.out.println("Cin Zodyagi: Domuz");
            }
            else if(yil%12==3){
                System.out.println("Cin Zodyagi: Fare");
            }
            else if(yil%12==4){
                System.out.println("Cin Zodyagi: Öküz");
            }
            else if(yil%12==5){
                System.out.println("Cin Zodyagi: Kaplan");
            }
            else if(yil%12==6){
                System.out.println("Cin Zodyagi: Tavşan");
            }
            else if(yil%12==7){
                System.out.println("Cin Zodyagi: Ejderha");
            }
            else if(yil%12==8){
                System.out.println("Cin Zodyagi: Yılan");
            }
            else if(yil%12==9){
                System.out.println("Cin Zodyagi: At");
            }
            else if(yil%12==10){
                System.out.println("Cin Zodyagi: Koyun");
            }

        }
        else{
            System.out.println("Hatali Veri");
        }

    }
}
