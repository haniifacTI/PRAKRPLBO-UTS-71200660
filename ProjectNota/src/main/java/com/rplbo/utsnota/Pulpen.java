package com.rplbo.utsnota;

public class Pulpen extends Barang{
    String warna;

    public Pulpen(String kode, int harga, int berat, String deskripsi, String warna){
        setKodebarang(kode);
        setHarga(harga);
        setBerat(berat);
        setDeskripsi(deskripsi);
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    @Override
    public void getInformasi() {
        System.out.println("Kode : "+this.getKodebarang());
        System.out.println(("Harga : "+this.getHarga()));
        System.out.println("Berat : "+this.getBerat());
        System.out.println("Deskripsi : "+this.getDeskripsi());
        System.out.println("Warna : "+this.getWarna());
    }
}
