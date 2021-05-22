package com.luasDanVolume;

import java.util.Scanner;

public class MenghitungVolume implements Volume{
    double phi = (float) 3.14;
    double r, tinggi, volume, sisi, panjang, lebar;
    
    Scanner input = new Scanner(System.in);
    @Override
    public void Balok() {
        System.out.print("Masukkan sisi panjang : ");
        panjang = input.nextInt();
        System.out.print("Masukkan sisi lebar : ");
        lebar = input.nextInt();
        System.out.print("Masukkan sisi tinggi : ");
        tinggi = input.nextInt();
        volume = panjang * lebar * tinggi;
        System.out.println("volume balok : "+ volume + " cm^3");
    }

    @Override
    public void Kubus() {
        System.out.print("Masukkan sisi : ");
        sisi = input.nextInt();
        volume = sisi * sisi * sisi;
        System.out.println("Volume kubus : "+ volume + " cm^3");
    }

    @Override
    public void Tabung() {
        System.out.print("Masukkan jari - jari : ");
        r = input.nextInt();
        System.out.print("Masukkan tinggi : ");
        tinggi = input.nextInt();   
        volume = phi * r * r * tinggi;
        System.out.println("Volume Tabung : "+ volume + " cm^3");
    }
   
}
