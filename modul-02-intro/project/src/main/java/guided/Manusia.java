package guided;
public class manusia {

    private String nama;
    private int tinggi;

    void setInfo(String nama, int tinggi) {
        this.nama = nama;
        this.tinggi = tinggi;
    }

    void info() {
        System.out.println(this.nama + " Memiliki Tinggi " + this.tinggi + "cm");
    }
}
