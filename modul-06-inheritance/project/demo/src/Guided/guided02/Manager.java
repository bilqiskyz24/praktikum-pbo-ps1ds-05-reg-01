package Guided.guided02.Demo.Demo02;

    public class Manager extends Employee {
    public String alamat;
    
    public Manager(String nama, String alamat){
        super(nama);
        this.alamat = alamat;
    }
    
    public void tampilInformasi(){
        super.tampilNama();
        System.out.println("alamat: " + alamat);
        System.out.println("departemen " + super.departemen);
    }
}
