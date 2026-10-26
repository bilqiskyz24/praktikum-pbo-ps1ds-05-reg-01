package Unguided;

// Mewarisi dari Klasifikasi
public class DeepLearning extends Klasifikasi {
    private int jumlahLayer;

    public DeepLearning(String namaModel, int jumlahDataLatih, int jumlahKelas, int jumlahLayer) {
        super(namaModel, jumlahDataLatih, jumlahKelas);
        this.jumlahLayer = jumlahLayer;
    }

    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Jumlah Layer: " + jumlahLayer);
    }

    @Override
    public double hitungBiaya() {
        return super.hitungBiaya() + (this.jumlahLayer * 200.0);
    }
}