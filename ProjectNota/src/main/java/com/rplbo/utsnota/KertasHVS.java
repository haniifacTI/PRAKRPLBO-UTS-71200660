package com.rplbo.utsnota;

public class KertasHVS extends Barang{
    private int gram;

    public KertasHVS(String kode,int harga,int berat,String deskripsi, int gram){
        setKodebarang(kode);
        setHarga(harga);
        setBerat(berat);
        setDeskripsi(deskripsi);
        this.gram = gram;
    }

    public void setGram(int gram) {
        this.gram = gram;
    }

    @Override
    public void getInformasi() {
        System.out.println("Kode : "+this.getKodebarang());
        System.out.println(("Harga : "+this.getHarga()));
        System.out.println("Berat : "+this.getBerat());
        System.out.println("Deskripsi : "+this.getDeskripsi());
        System.out.println("Gram : "+this.getGram());
    }

    public int getGram() {
        return gram;
    }
}
