package com.rplbo;

public class Perempuan {
    private String nama;
    private int usia;
    private String status;
    private double jumlahCinta = 0;
    private Pria jodoh;
    private Pria temanKencan;
    private double standarJumlahCinta;

    public Perempuan(String nama, int usia, double val){
        this.nama = nama;
        this.usia = usia;
        this.standarJumlahCinta = val;
    }

    public void MengajakKencan(Pria pria){
        if(this.temanKencan == pria) {
            this.jumlahCinta += 1;
            temanKencan.setJumlahCinta(temanKencan.getJumlahCinta()+0.5);
        }else{
            System.out.println("KAU JANGAN TIDAK SETIA, JANGAN KAU AJAK PRIA LAIN JALAN!!");
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getJumlahCinta() {
        return jumlahCinta;
    }

    public void setJumlahCinta(double jumlahCinta) {
        this.jumlahCinta = jumlahCinta;
    }

    public Pria getJodoh() {
        return jodoh;
    }

    public void setJodoh(Pria jodoh) {
        this.jodoh = jodoh;
    }

    public Pria getTemanKencan() {
        return temanKencan;
    }

    public void setTemanKencan(Pria temanKencan) {
        this.temanKencan = temanKencan;
    }

    public double getStandarJumlahCinta() {
        return standarJumlahCinta;
    }

    public void setStandarJumlahCinta(double standarJumlahCinta) {
        this.standarJumlahCinta = standarJumlahCinta;
    }
}
