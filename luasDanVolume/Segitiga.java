package com.luasDanVolume;

import java.util.Scanner;

public class Segitiga extends Shape{
    private int alas, tinggi;

    Scanner input = new Scanner(System.in);

    @Override
    public double GetArea() {
        System.out.print("Masukkan alas segitiga : ");
        alas = input.nextInt();
        System.out.print("Masukkan tinggi segitiga : ");
        tinggi = input.nextInt();
        return 0.5*alas*tinggi;
    }   
}
