package Unguided;

public class Klasifikasi extends ModelML {
    private int jumlahKelas;

    public Klasifikasi(String namaModel, int jumlahDataLatih, int jumlahKelas) {
        super(namaModel, jumlahDataLatih);
        this.jumlahKelas = jumlahKelas;
    }

    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Jumlah Kelas: " + jumlahKelas);
    }

    @Override
    public double hitungBiaya() {
        return super.hitungBiaya() * this.jumlahKelas;
    }
}