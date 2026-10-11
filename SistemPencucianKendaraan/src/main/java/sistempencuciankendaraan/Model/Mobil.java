/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistempencuciankendaraan.Model;

/**
 *
 * @author Lenovo GK
 */
public class Mobil extends Kendaraan implements BisaDicuci{
    
    private int jumlahRoda;
    
    public Mobil(String noPlat, String merk, String warna, int jumlahRoda, Layanan layanan){
        super(noPlat, merk, warna, layanan);
        this.jumlahRoda = jumlahRoda;
    } 
    public int getJumlahRoda(){
        return jumlahRoda;
    }
    public int getcc(){
        return 0;
    }
    @Override
    public void cuci(){
        System.out.println("Mobil sedang dicuci"); 
    }
    @Override 
    public BisaDicuci getBisaDicuci(){
        return this;
    }
    @Override 
    public String getJenisKendaraan(){
        return "mobil";
    }
    @Override
    public void tampilkanData(){
        super.tampilkanDataDasar();
   
System.out.println("Jumlah Roda : " + jumlahRoda);
System.out.println("Kode Layanan : " + getLayanan().getKodeLayanan());
System.out.println("Layanan : " + getLayanan().getNamaLayanan());
System.out.println("Harga Rp : " + getLayanan().getHarga());
    }
}
