package Unguided;

public class RegresiLinier extends ModelML {
    private int jumlahFitur;

    public RegresiLinier(String namaModel, int jumlahDataLatih, int jumlahFitur) {
        super(namaModel, jumlahDataLatih);
        this.jumlahFitur = jumlahFitur;
    }

    @Override
    public void tampilkanInformasi() {
        super.tampilkanInformasi();
        System.out.println("Jumlah Fitur: " + jumlahFitur);
    }

    @Override
    public double hitungBiaya() {
        return super.hitungBiaya() + (this.jumlahFitur * 10.0);
    }

    // Method baru sesuai soal (b)
    public double hitungBiaya(int epoch, int batch) {
        return (super.getJumlahDataLatih() * (double)epoch) / batch;
    }
}