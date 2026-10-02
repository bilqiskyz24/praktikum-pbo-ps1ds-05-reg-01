/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul03.unguided.suhu;

/**
 *
 * @author ACER
 */
public class pengolahsuhu {
   private double[] suhuHarian;
   
   //class field
   public static final double NILAI_KOSONG = -1.8;
   
   public pengolahsuhu(double[] suhuHarian) {
       this.suhuHarian = suhuHarian;
   }
   
   public void tampilkanData(){
       for (int i =0; i < suhuHarian.length; i++) {
           
           System.out.print("Hari" + (i + 1)+ " : ");
           
           if (suhuHarian[i] == NILAI_KOSONG) {
               System.out.println(("kosong"));
           } else {
               System.out.println(suhuHarian[i] + "°C");
           }
       }
   }
   
// mencari index data kosong
  public int cariIndexKosong() {
    for (int i = 0; i < suhuHarian.length; i++) {
        if (suhuHarian[i] == NILAI_KOSONG) {
            return i;
        }
    }

    return -1;
}
// mengisi data yang kosonhg
public void isiDataKosong() {
    int IndexKosong = cariIndexKosong();
    
    if (IndexKosong != -1) {
        
        suhuHarian[IndexKosong]=
        (suhuHarian[IndexKosong -1]
                + suhuHarian[IndexKosong +1]) /2;
    }
}
//Menghitung rata-rata suhu
public double hitungRataRata() {
    
    double total = 0;
    
    for (int i = 0; i < suhuHarian.length; i++) {
        total += suhuHarian[i];
    }
    
    return total / suhuHarian.length;
    
}
}

