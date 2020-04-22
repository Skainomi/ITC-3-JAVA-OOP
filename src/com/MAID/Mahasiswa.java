package com.MAID;

public class Mahasiswa extends Manusia implements Bernyanyi {
    //attribute
    String nama;
    private String nim;
    private double IPK;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        super.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    public Mahasiswa(String nama, String nim, double IPK)
    {
        super(nama);
        this.nama = nama;
        this.nim = nim;
        this.IPK = IPK;
    }

    //method
    public void belajar()
    {
        System.out.println("sedang belajar");
    }

    public void doTugas()
    {
        System.out.println("Ngerjain Tugas");
    }

    public void tidur(String nama)
    {

        System.out.println(nama + "tidur nyenyak di kos");
    }

    @Override
    public void bernada() {
        System.out.println(nama + "Sedang Bernyanyi");
    }

    @Override
    public void berjoget(String gerakan) {
        System.out.println("joget " + gerakan);
    }
}
