package Unguided;

public class ModelML {
    private String namaModel;
    private int jumlahDataLatih;

    public ModelML(String namaModel, int jumlahDataLatih) {
        this.namaModel = namaModel;
        this.jumlahDataLatih = jumlahDataLatih;
    }

    public String getNamaModel() { return namaModel; }
    public int getJumlahDataLatih() { return jumlahDataLatih; }

    public void tampilkanInformasi() {
        System.out.println("Nama Model : " + namaModel);
        System.out.println("Data Latih : " + jumlahDataLatih);
    }

    // Overloading method hitung biaya
    public double hitungBiaya() {
        return this.jumlahDataLatih * 2.0;
    }

    public double hitungBiaya(int epoch) {
        return this.jumlahDataLatih * epoch;
    }
}