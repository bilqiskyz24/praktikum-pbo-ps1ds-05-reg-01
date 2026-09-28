package unguided;

public class Main {

    public static void main(String[] args) {

        final double KKM = 75.0;

        Mahasiswa[] mahasiswa = {
            new Mahasiswa("Andi", 80.0, 85.0),
            new Mahasiswa("Budi", 70.0, 65.0),
            new Mahasiswa("Citra", 90.0, 90.0)
        };

        System.out.println("REKAP NILAI PRAKTIKUM");
        System.out.println("KKM: " + KKM);
        System.out.println();

        for (int i = 0; i < mahasiswa.length; i++) {

            double rataRata = mahasiswa[i].hitungRataRata();

            System.out.println("Mahasiswa " + (i + 1) + ": " + mahasiswa[i].nama);
            System.out.println("Nilai Modul 1 : " + mahasiswa[i].nilai1);
            System.out.println("Nilai Modul 2 : " + mahasiswa[i].nilai2);
            System.out.println("Rata-rata     : " + rataRata);

            if (rataRata >= KKM) {
                System.out.println("Status        : LULUS");
            } else {
                System.out.println("Status        : REMEDIAL");
            }

            System.out.println();
        }
    }
}
