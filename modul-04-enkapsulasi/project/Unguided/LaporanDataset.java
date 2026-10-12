/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided;

/**
 *
 * @author ACER
 */

public class LaporanDataset {

    public void cetak(Dataset dataset) {
        System.out.println("=== Laporan Dataset ===");
        System.out.println("Nama         : " + dataset.getNama());
        System.out.println("Jumlah Baris : " + dataset.getJumlahBaris());
        System.out.println("Jumlah Kolom : " + dataset.getJumlahKolom());

        // Format persentase 2 angka di belakang koma
        System.out.printf("Missing      : %d sel (%.2f%%)%n",
                dataset.getJumlahMissing(),
                dataset.getPersentaseMissing());

        String status = dataset.perluDibersihkan() ? "Perlu dibersihkan" : "Bersih";
        System.out.println("Status       : " + status);
    }
}
