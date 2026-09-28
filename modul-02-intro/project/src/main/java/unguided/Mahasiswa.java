package unguided;

public class Mahasiswa {
    String nama;
    double nilai1;
    double nilai2;

    Mahasiswa(String nama, double nilai1, double nilai2) {
        this.nama = nama;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
    }

    double hitungRataRata() {
        return (nilai1 + nilai2) / 2;
    }
}
