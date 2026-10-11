/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistempencuciankendaraan.Model;
/**
 *
 * @author Lenovo GK
 */
public class Layanan {
    
    private final String kodeLayanan;
    private String namaLayanan;
    private final double harga;
    
    public Layanan(String kodeLayanan, String namaLayanan, double harga){
        this.kodeLayanan = kodeLayanan;
        this.namaLayanan = namaLayanan;
        this.harga = harga;
    }
    
    public String getKodeLayanan(){
        return kodeLayanan;
    }
    
    public String getNamaLayanan(){
        return namaLayanan;
    }
    public void setNamaLayanan(String namaLayanan) {
        this.namaLayanan = namaLayanan;
    }
    public double getHarga(){
        return harga;
    }

}