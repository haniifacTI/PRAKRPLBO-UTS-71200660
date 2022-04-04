package com.rplbo.utsnota;

public class Item {
    KertasHVS[] krhvs;
    BukuTulis[] bktulis;
    Pulpen[] pen;

    public Item(KertasHVS[] krhvs) {
        this.krhvs = krhvs;
    }

    public Item(BukuTulis[] bktulis) {
        this.bktulis = bktulis;
    }

    public Item(Pulpen[] pen) {
        this.pen = pen;
    }

    public Item(BukuTulis[] bktulis, Pulpen[] pen) {
        this.bktulis = bktulis;
        this.pen = pen;
    }

    public Item(KertasHVS[] krhvs, Pulpen[] pen) {
        this.krhvs = krhvs;
        this.pen = pen;
    }

    public Item(BukuTulis[] bktulis, KertasHVS[] krhvs) {
        this.krhvs = krhvs;
        this.bktulis = bktulis;
    }

    public Item(BukuTulis[] bktulis, KertasHVS[] krhvs, Pulpen[] pen) {
        this.krhvs = krhvs;
        this.bktulis = bktulis;
        this.pen = pen;
    }

    public int getJumlahBukuTulis(){
        return bktulis.length;
    }

    public int getJumlahPen(){
        return pen.length;
    }

    public Pulpen[] getPen() {
        return pen;
    }

    public int getJumlahKertasHVS(){
        return krhvs.length;
    }

    public BukuTulis[] getBktulis() {
        return bktulis;
    }

    public KertasHVS[] getKrhvs() {
        return krhvs;
    }
}
