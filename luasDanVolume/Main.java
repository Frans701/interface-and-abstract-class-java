package com.luasDanVolume;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pilihan;
        MenghitungVolume v = new MenghitungVolume();
        Scanner input = new Scanner(System.in);

        System.out.println("Program menghitung luas dan volume");
        System.out.println("1. menghitung luas ");
        System.out.println("2. menghitung volume ");
        System.out.print("Masukkan pilihan : ");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("1. Segitiga");
                System.out.println("2. Persegi");
                System.out.println("3. Persegi Panjang");
                System.out.print("Masukkan pilihan : ");
                pilihan = input.nextInt();
                switch (pilihan) {
                    case 1:
                        Segitiga a = new Segitiga();
                        System.out.println("Luas segitiga : " + a.GetArea() + " cm^2");
                        break;
                    case 2:
                        Persegi b = new Persegi();
                        System.out.println("Luas segitiga : " + b.GetArea() + " cm^2");
                        break;
                    case 3:
                        PersegiPanjang c = new PersegiPanjang();
                        System.out.println("Luas segitiga : " + c.GetArea() + " cm^2");
                        break;
                    default:
                        System.out.println("INPUTAN ANDA SALAH!!!");
                        break;
                }
                break;
            case 2:
                System.out.println("1. Balok");
                System.out.println("2. Kubus");
                System.out.println("3. Tabung");
                System.out.print("Masukkan pilihan : ");
                pilihan = input.nextInt();
                switch (pilihan) {
                    case 1:
                        v.Balok();
                        break;
                    case 2:
                        v.Kubus();
                        break;
                    case 3:
                        v.Tabung();
                        break;
                    default:
                        System.out.println("INPUTAN ANDA SALAH!!!");
                        break;
                }
                break;
            default:
                System.out.println("INPUTAN ANDA SALAH!!!");
                break;
        }
    }
}