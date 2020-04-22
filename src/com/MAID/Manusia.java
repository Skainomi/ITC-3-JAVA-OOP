package com.MAID;

public class Manusia {
    String nama;
    String ktp;
    int umur;

    public Manusia(String nama) {
        this.nama = nama;
        this.ktp = ktp;
        this.umur = umur;
    }

    public void makan()
    {
        System.out.println("Sedang Makan");
    }

    public void makan(String nama)
    {
        System.out.println(nama + "Sedang Makan");
    }
    public void makan(String nama,int umur)
    {
        System.out.println(nama + "Sedang Makan" + umur);
    }

    public void tidur(String nama)
    {
        System.out.println(nama + "Sedang tidur");
    }
}
