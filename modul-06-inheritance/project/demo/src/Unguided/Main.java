package Unguided;

public class Main {
    public static void main(String[] args) {
        // Mengcreate objek
        RegresiLinier regresi = new RegresiLinier("Regresi Linier", 500, 4);
        Klasifikasi decisionTree = new Klasifikasi("Decision Tree", 800, 3);
        DeepLearning neuralNetwork = new DeepLearning("Neural Network", 1000, 5, 3);

        // Menyimpan dalam array bertipe kelas induk
        ModelML[] daftarModel = { regresi, decisionTree, neuralNetwork };
        double totalBiayaKeseluruhan = 0;

        // Perulangan untuk menampilkan info & hitung biaya
        System.out.println("=== INFORMASI & BIAYA MODEL ===");
        for (ModelML model : daftarModel) {
            model.tampilkanInformasi();
            double biaya = model.hitungBiaya(); // Memanggil hitung biaya tanpa parameter
            System.out.println("Biaya Komputasi Dasar : " + biaya);
            System.out.println("---------------------------------");
            totalBiayaKeseluruhan += biaya;
        }

        System.out.println("TOTAL BIAYA KESELURUHAN: " + totalBiayaKeseluruhan);
        System.out.println();

        //Tampilkan biaya dengan parameter spesifik
        System.out.println("=== BIAYA BERDASARKAN EPOCH & BATCH ===");
        System.out.println("Neural Network (10 epoch) : " + neuralNetwork.hitungBiaya(10));
        System.out.println("Regresi Linier (10 epoch) : " + regresi.hitungBiaya(10));
        System.out.println("Regresi Linier (10 epoch, batch 50) : " + regresi.hitungBiaya(10, 50));
    }
}