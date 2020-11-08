/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan34kalkulator;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Andreas Suryadi
 * KELAS    : IF-10K
 * NIM      : 10119918
 * Deskripsi Program : Menampilkan hasil perhitungan dua angka kedalam bentuk
 * tambah, kurang, kali, bagi, dan sisa bagi dalam bentuk OOP
 *
 */

public class PBO10K10119918Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Kalkulator kalkulator = new Kalkulator();
        
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        
        System.out.print("Masukkan Angka ke-1 : ");
        kalkulator.value1 = scanner.nextDouble();
        
        System.out.print("Masukkan Angka ke-2 : ");
        kalkulator.value2 = scanner.nextDouble();
        
        System.out.println();
        
        System.out.printf("Hasil Pertambahan : %.1f %n", kalkulator.tambahBilangan());
        System.out.printf("Hasil Pengurangan : %.1f %n", kalkulator.kurangBilangan());
        System.out.printf("Hasil Perkalian : %.1f %n", kalkulator.kaliBilangan());
        System.out.printf("Hasil Pembagian : %.1f %n", kalkulator.bagiBilangan());
        System.out.printf("Hasil Sisa : %.1f %n", kalkulator.sisaBilangan());
    }
    
}
