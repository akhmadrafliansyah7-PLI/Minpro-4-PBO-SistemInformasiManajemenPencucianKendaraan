/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistempencuciankendaraan.Model;
/**
 *
 * @author Lenovo GK
 */
public class Transaksi {
    
    private static int counter = 0;
    
    private final String idTransaksi;
    private Pelanggan pelanggan;
    private Kendaraan kendaraan;
    private Layanan layanan;
    
    public Transaksi(Pelanggan pelanggan, Kendaraan kendaraan, Layanan layanan){
        counter++;
        this.idTransaksi = String.format("TR%03d", counter);
        this.pelanggan = pelanggan;
        this.kendaraan = kendaraan;
        this.layanan = layanan;
    }
    public Transaksi(String idTransaksi, Pelanggan pelanggan, Kendaraan kendaraan, Layanan layanan){
        this.idTransaksi = idTransaksi;
        this.pelanggan = pelanggan;
        this.kendaraan = kendaraan;
        this.layanan = layanan;
    }
    public static void setCounter(int nilai){
        counter = nilai;
    }
    
    public String getIdTransaksi(){
        return idTransaksi;
    }
    public Pelanggan getPelanggan(){
        return pelanggan;
    }
    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }
    public Kendaraan getKendaraan(){
        return kendaraan;
    }
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }
    public Layanan getLayanan(){
        return layanan;
    }
    public void setLayanan(Layanan layanan) {
        this.layanan = layanan;
    }
    public void tampilkanData(){
        
        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("ID Pelanggan : " + pelanggan.getIdPelanggan());
        System.out.println("Nama Pelanggan : " + pelanggan.getNama());
        System.out.println("Nomor Telepon : " + pelanggan.getNoTelepon());
        kendaraan.tampilkanData();
    }
}