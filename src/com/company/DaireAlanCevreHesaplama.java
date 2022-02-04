package com.company;

import java.util.Scanner;

public class DaireAlanCevreHesaplama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Yaricap degerini giriniz:");
        double yariCap = sc.nextDouble();
        double pi=Math.PI;
        System.out.println("Cevre: "+(pi*2*yariCap));
        System.out.println("Alan: "+(pi*yariCap*yariCap));
        System.out.print("Merkez aci degerini giriniz:");
        double merkezAci = sc.nextDouble();
        System.out.println("Merkez acisi "+merkezAci+" olan Alan: "+ ((pi*yariCap*yariCap*merkezAci)/360));

    }
}
