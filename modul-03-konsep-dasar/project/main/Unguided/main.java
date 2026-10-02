/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul03.unguided.suhu;

/**
 *
 * @author ACER
 */
public class main {
    public static void main(String[] args) {

        double[] suhuHarian = {
            30.4, 24.3, 26.8, -1.0, 31.4, 30.8, 32.9
        };

      pengolahsuhu pengolah  = new pengolahsuhu(suhuHarian);

        System.out.println("=== Data Suhu Awal ===");
        pengolah.tampilkanData();

        int IndexKosong = pengolah.cariIndexKosong();

        System.out.println("Index hari kosong: " + IndexKosong);

        pengolah.isiDataKosong();

        System.out.println("=== Data Suhu Setelah Pengisian ===");
        pengolah.tampilkanData();

        double rataRata = pengolah.hitungRataRata();

        System.out.println("Rata-rata: " + rataRata);

        System.out.println("Isi array suhuHarian di main:");
        pengolah.tampilkanData();
    }
  }


   

