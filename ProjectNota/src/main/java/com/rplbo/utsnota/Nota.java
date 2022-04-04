package com.rplbo.utsnota;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Nota {
    private String nota;
    private String notelppembeli;
    private Item items;
    private String namapembeli;

    public Nota(String nota, String namapembeli, String notelppembeli, Item items) {
        this.nota = nota;
        this.notelppembeli = notelppembeli;
        this.items = items;
        this.namapembeli = namapembeli;
    }

    public void setNotelppembeli(String notelppembeli) {
        this.notelppembeli = notelppembeli;
    }

    public void setNamapembeli(String namapembeli) {
        this.namapembeli = namapembeli;
    }

    public String getNonota() {
        return nota;
    }

    public String getNamapembeli() {
        return namapembeli;
    }

    public void setNonota(String nota) {
        this.nota = nota;
    }

    public void tampilNota() {
        System.out.println("NOTA PEMBELIAN");
        System.out.println("No Nota : " + getNonota());
        System.out.println("Nama Pembeli: " + getNamapembeli());
        System.out.println("Telp Pembeli: " + getNotelppembeli());

        LocalDateTime tglwaktu = LocalDateTime.now();
        DateTimeFormatter formattglwaktu = DateTimeFormatter.ofPattern("E MMM dd HH:mm:ss");
        String hasilformat = tglwaktu.format(formattglwaktu);
        System.out.println("Tanggal: " + hasilformat + " WIB 2022");


        System.out.println("=====================================");
        int subtotal = 0;

        for (int i = 0; i < this.items.getJumlahBukuTulis();i++){
            this.items.bktulis[i].getInformasi();
            subtotal += this.items.bktulis[i].getHarga();
            System.out.println("---------------------------------------------");
        }
        System.out.println("Sub Total : "+subtotal);
        System.out.println("=====================================");

        subtotal = 0;

        for (int i = 0; i < this.items.getJumlahKertasHVS();i++){
            this.items.krhvs[i].getInformasi();
            subtotal += this.items.krhvs[i].getHarga();
            System.out.println("---------------------------------------------");
        }
        System.out.println("Sub Total : "+subtotal);
        System.out.println("=====================================");

        subtotal = 0;

        for (int i = 0; i < this.items.getJumlahPen();i++){
            this.items.pen[i].getInformasi();
            subtotal += this.items.pen[i].getHarga();
            System.out.println("---------------------------------------------");
        }
        System.out.println("Sub Total : "+subtotal);

        System.out.println("==================================================");
    }

    public String getNotelppembeli() {
        return notelppembeli;
    }

    public int hitungTotalBayar(){
        int grandtotal = 0;
        for (int i = 0; i < this.items.getJumlahBukuTulis();i++){
            grandtotal += this.items.bktulis[i].getHarga();
        }

        for (int i = 0; i < this.items.getJumlahKertasHVS();i++){
            grandtotal += this.items.krhvs[i].getHarga();
        }

        for (int i = 0; i < this.items.getJumlahPen();i++){
            grandtotal += this.items.pen[i].getHarga();
        }

        return grandtotal;
    }
}
