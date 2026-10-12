/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul04.Guided;

/**
 *
 * @author ACER
 */

public class DemoManusia {
    public static void main(String[] args) {
        
        manusia arrMns[] = new manusia[3]; 

        //Constreuctor pertama
        manusia objMns1 = new manusia();

        // kedua
        manusia objMns2 = new manusia("John"); 

        //ketiga
        manusia objMns3 = new manusia("Baruji", 44);

        arrMns[0] = objMns1;
        arrMns[1] = objMns2;
        arrMns[2] = objMns3; 

        for (int i = 0; i<3; i++) {
            System.out.println("Nama: " + arrMns[i].getNama());
            System.out.println("Umur: " + arrMns[i].getUmur());
            System.out.println();
        }
    }
}
