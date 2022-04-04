package com.rplbo;

public class Pria {
    private String nama;
    private int usia;
    private String status;
    private double jumlahCinta = 0;
    private Perempuan jodoh;
    private Perempuan temanKencan;

    public Pria(String nama, int usia){
        this.nama = nama;
        this.usia = usia;
    }

    public void PDKT(Perempuan calon){
        if(this.temanKencan == null) {
            this.temanKencan = calon;
            calon.setTemanKencan(this);
        }else{
            System.out.println("JANGAN SELINGKUH MAS HEI TOLONG");
        }
    }

    public void MengajakKencan(Perempuan perempuan){
        if(this.temanKencan == perempuan) {
            this.jumlahCinta += 1;
            perempuan.setJumlahCinta(perempuan.getJumlahCinta()+1);
        }else{
            System.out.println("KAU JANGAN TIDAK SETIA, JANGAN KAU AJAK CEWEK LAIN JALAN!!");
        }
    }

    public void MenembakKekasih(){
        if(this.temanKencan == null){
            System.out.println("SIAPA YANG MAU KAU TEMBAK :') | JANGAN NGAYAL DEH "+this.nama);
        }else if(temanKencan.getStandarJumlahCinta() > temanKencan.getJumlahCinta()){
            System.out.println("KAMU DITOLAK OLEH "+temanKencan.getNama()+" | SEMANGAT !! BERSEDIHNYA JANGAN BERLARUT!!.");
        }else{
            this.jodoh = temanKencan;
            this.temanKencan.setJodoh(this);
            System.out.println("SELAMAT KAMU DITERIMA :D | SELAMAT MENJALANI HIDUP BARU "+this.nama);
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

    public Perempuan getJodoh() {
        return jodoh;
    }

    public void setJodoh(Perempuan jodoh) {
        this.jodoh = jodoh;
    }

    public Perempuan getTemanKencan() {
        return temanKencan;
    }

    public void setTemanKencan(Perempuan temanKencan) {
        this.temanKencan = temanKencan;
    }
}
