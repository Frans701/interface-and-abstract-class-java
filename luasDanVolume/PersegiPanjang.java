package com.luasDanVolume;

import java.util.Scanner;

public class PersegiPanjang extends Shape{
    private double panjang,lebar;

    Scanner input = new Scanner(System.in);
    
    @Override
    public double GetArea() {
        System.out.print("Masukkan panjang persegi panjang : ");
        this.panjang = input.nextInt();
        System.out.print("Masukkan lebar persegi panjang : ");
        lebar = input.nextInt();
        return panjang*lebar;
    }
    
}
