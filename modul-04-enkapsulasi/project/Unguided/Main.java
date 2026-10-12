/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        // Objek 1: Constructor tanpa parameter, lalu diisi dengan setter
        Dataset d1 = new Dataset();
        d1.setNama("Titanic");
        d1.setJumlahBaris(891);
        d1.setJumlahKolom(12);
        d1.setJumlahMissing(866);

        // Objek 2: Constructor 1 parameter
        Dataset d2 = new Dataset("Wine Quality");
        d2.setJumlahBaris(1599);
        d2.setJumlahKolom(12);
        d2.setJumlahMissing(0);

        // Objek 3: Constructor lengkap
        Dataset d3 = new Dataset("Iris", 150, 5, 0);

        // Simpan dalam array
        Dataset[] daftarDataset = { d1, d2, d3 };

        // Cetak laporan dengan perulangan
        LaporanDataset laporan = new LaporanDataset();
        for (Dataset d : daftarDataset) {
            laporan.cetak(d);
            System.out.println();
        }

        // Tampilkan total dataset
        System.out.println("Total dataset dibuat : " + Dataset.getTotalDataset());
    }
}

