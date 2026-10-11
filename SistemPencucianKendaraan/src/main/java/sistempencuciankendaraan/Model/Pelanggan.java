/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistempencuciankendaraan.Model;

/**
 *
 * @author Lenovo GK
 */
public class Pelanggan {
    
    private static int counter = 0;
    
    private final String idPelanggan;
    private String nama;
    private String noTelepon;
    
    public Pelanggan(String nama, String noTelepon){
        counter++;
        this.idPelanggan = String.format("PL%03d", counter);
        this.nama = nama;
        this.noTelepon = noTelepon;
    }
    
    public Pelanggan(String nama){
        counter++;
        this.idPelanggan = String.format("PL%03d", counter);
        this.nama = nama;
        this.noTelepon = "-";
    
    }
    public Pelanggan(String idPelanggan, String nama, String noTelepon){
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.noTelepon = noTelepon;
    }
    public String getIdPelanggan(){
        return idPelanggan;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNoTelepon(){
        return noTelepon;
    }
    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }
}
