package com.company;

import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;
        double ortalama;
        Scanner sc = new Scanner(System.in);

        System.out.print("Matematik: ");
        mat=sc.nextInt();

        System.out.print("Fizik: ");
        fizik=sc.nextInt();

        System.out.print("Türkçe: ");
        turkce=sc.nextInt();

        System.out.print("Kimya: ");
        kimya=sc.nextInt();

        System.out.print("Müzik: ");
        muzik=sc.nextInt();

        if(mat<0 || mat>100){
            ortalama = ( fizik + turkce + kimya + muzik)/4;
        }
        if(fizik<0 || fizik>100){
            ortalama = (mat + turkce + kimya + muzik)/4;
        }
        if(turkce<0 || turkce>100){
            ortalama = (mat + fizik + kimya + muzik)/4;
        }
        if(kimya<0 || kimya>100){
            ortalama = (mat + fizik + turkce +  muzik)/4;
        }
        if(muzik<0 || muzik>100){
            ortalama = (mat + fizik + turkce + kimya )/4;
        }
        else{
        ortalama = (mat + fizik + turkce + kimya + muzik)/5;
        }
        System.out.println("Ortalama: " +ortalama);


        if(ortalama<55){
            System.out.println(ortalama + " ile kaldiniz...");
        }
        else if(ortalama>=55){
            System.out.println(ortalama + "ile gectiniz...");
        }





    }
}
