/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan49.biayaemaskawin;
import java.util.Scanner;
/**
 *
 * @author asus
 * NAMA     : Muhamad Rizqi Ramdani
 * KELAS    : IF-2
 * NIM      : 10118069
 * Deskripsi Program : biaya mas kawin
 */
public class PBO2_10118069_Latihan49_BiayaEmasKawin {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        MasKawin mk = new MasKawin();
        
        System.out.println("===== Hitung Biaya Emas Kawin =====");
        System.out.println("Masukan Harga Emas per Gram : Rp. " );
        mk.setHarga(scanner.nextDouble());
        System.out.println("Masukan Berat Emas yang dibeli : ");
        mk.setBerat(scanner.nextDouble());
        System.out.println("Total Harga yang harus dibayar adalah : Rp. "
                + mk.hitungMasKawin());
    }
           
}
