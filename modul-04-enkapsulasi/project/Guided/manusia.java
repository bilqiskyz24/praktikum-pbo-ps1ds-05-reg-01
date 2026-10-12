/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul04.Guided;

/**
 *
 * @author ACER
 */
public class manusia {
    // Definisi atribut
    private String nama;
    private int umur;

    //4.2 constructor
    public manusia(){};
    public manusia(String nama) {
        this.nama = nama;
    }
    public manusia(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // method setter 
    public void setNama(String a) {
        nama = a;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // method getter
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }


}

