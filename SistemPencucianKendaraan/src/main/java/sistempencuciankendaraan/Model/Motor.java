/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistempencuciankendaraan.Model;

/**
 *
 * @author Lenovo GK
 */
public class Motor extends Kendaraan implements BisaDicuci{
    
    private int cc;
    
    public Motor(String noPlat, String merk, String warna, int cc, Layanan layanan){
        super(noPlat, merk, warna, layanan);
        this.cc = cc;
        
    }
    public int getJumlahRoda(){
        return 0;
    }
    public int getcc(){
        return cc;
    }
    @Override
    public void cuci(){
        System.out.println("Motor sedang dicuci");            
    }
    @Override public BisaDicuci getBisaDicuci(){
        return this;
    }
    @Override 
    public String getJenisKendaraan(){
        return "motor";
    }
    @Override
    public void tampilkanData(){
        super.tampilkanDataDasar();
   
System.out.println("Jenis Kendaraan : Motor");
System.out.println("CC : " + cc);
System.out.println("Kode Layanan : " + getLayanan().getKodeLayanan());
System.out.println("Layanan : " + getLayanan().getNamaLayanan());
System.out.println("Harga Rp : " + getLayanan().getHarga());
    }
}