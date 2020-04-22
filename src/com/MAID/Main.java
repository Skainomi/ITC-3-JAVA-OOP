package com.MAID;

public class Main {

    public static void main(String[] args) {
        Mahasiswa daru = new Mahasiswa("Anjar", "123180056", 4.0);
        daru.setNama("Allaydaru");
        daru.setNim("123180054");
        daru.setIPK(4.0);

        System.out.println("Nama = " + daru.getNama());
        System.out.println("Nim = " + daru.getNim());
        System.out.println("IPK = " + daru.getIPK());

        daru.belajar();
        daru.doTugas();

        Manusia manusia = new Manusia("Riki");
        Mahasiswa mahasiswa = new Mahasiswa("akli", "123180030", 4.0);

        mahasiswa.ktp = "12738168240";
        System.out.println("Nama : " + mahasiswa.nama);

        manusia.makan("Anjar", 20);

        mahasiswa.berjoget("TikTok");

    }
}
