/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistempencuciankendaraan.Model;

import sistempencuciankendaraan.Model.Layanan;
/**
 *
 * @author Lenovo GK
 */
public abstract class Kendaraan {
    
    protected String noPlat;
    protected String merk;
    protected String warna;
    protected Layanan layanan;
    
    public Kendaraan(String noPlat, String merk, String warna, Layanan layanan){
        this.noPlat = noPlat;
        this.merk = merk;
        this.warna = warna;
        this.layanan = layanan;
    }
    public String getNoPlat(){
        return noPlat;
    }
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }
    public String getMerk(){
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getWarna(){
        return warna;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public Layanan getLayanan(){
        return layanan;
    }
    public void setLayanan(Layanan layanan) {
        this.layanan = layanan;
    }
    protected void tampilkanDataDasar(){
        System.out.println("No Plat : " + noPlat);
        System.out.println("Merk : " + merk);
        System.out.println("Warna : " + warna);
    }
    public abstract void tampilkanData();
    
    public abstract BisaDicuci getBisaDicuci();
    public abstract String getJenisKendaraan();
    public abstract int getJumlahRoda();
    public abstract int getcc();
}

