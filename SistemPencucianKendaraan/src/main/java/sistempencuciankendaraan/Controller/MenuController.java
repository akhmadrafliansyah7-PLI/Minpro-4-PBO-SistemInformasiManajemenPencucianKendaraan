/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistempencuciankendaraan.Controller;

import java.util.Scanner;
import sistempencuciankendaraan.DAO.TransaksiDAO;
import sistempencuciankendaraan.Model.BisaDicuci;
import sistempencuciankendaraan.Model.Kendaraan;
import sistempencuciankendaraan.Model.Layanan;
import sistempencuciankendaraan.Model.Mobil;
import sistempencuciankendaraan.Model.Motor;
import sistempencuciankendaraan.Model.Pelanggan;
import sistempencuciankendaraan.Model.Transaksi;
import sistempencuciankendaraan.View.MenuView;
/**
 *
 * @author Lenovo GK
 */
public class MenuController {
    
    private MenuView view;
    private Scanner input = new Scanner(System.in);
    private  TransaksiDAO transaksiDAO = new TransaksiDAO();
    
    public MenuController(MenuView view){
        this.view = view;
    }
    public void jalankanProgram(){
        
        int pilihan;
        
        do{
            view.tampilkanMenu();
            pilihan = view.inputMenu();
            
            switch (pilihan){
                case 1:
                    tambahData();
                    break;
                    
                case 2:
                    tampilkanData();
                    break;
                
                case 3:
                    ubahData();
                    break;
                    
                case 4:
                    hapusData();
                    break;
                    
                case 5:  
                    prosesPencucian();
                    break;      
                    
                case 6:
System.out.println("Program Selesai");
                    break;
                    
                default:
                    
System.out.println("Pilihan Menu Tidak Tersedia");
                
            }
        }while (pilihan !=6);
    }
public void tambahData(){
        
    System.out.println("\n=== Tambah Data Pencucian ===");

    String nama;
    while (true){
        System.out.print("Nama Pelanggan: ");
        nama = input.nextLine();

        if (nama.isEmpty()){
            System.out.println("Nama Pelanggan Tidak Boleh Kosong!");
        } else {
            break;
        }
    }

    String noTelepon;
    
    while (true){
        System.out.print("Nomor Telepon: ");
        noTelepon = input.nextLine();
       
        if (noTelepon.isEmpty() || noTelepon.matches("\\d+")){
            break;
        } else {
            System.out.println("Nomor Telepon hanya boleh berisi angka!");
        }
    }
    int nomorPelanggan = transaksiDAO.getNomorPelangganTersedia();
    Pelanggan.setCounter(nomorPelanggan - 1);
    
    Pelanggan pelanggan;
    if (noTelepon.isEmpty()){
        pelanggan = new Pelanggan(nama);
    }else{
        pelanggan = new Pelanggan(nama, noTelepon);
    }

    System.out.print("Nomor Plat: ");
    String noPlat = input.nextLine();

    System.out.print("Merk Kendaraan: ");
    String merk = input.nextLine();

    System.out.print("Warna Kendaraan: ");
    String warna = input.nextLine();

    System.out.println("\nJenis Kendaraan: ");
    System.out.println("1. Mobil");
    System.out.println("2. Motor");

    int detailKendaraan;
    Kendaraan kendaraan = null;

    while (true){

        System.out.println("pilih: ");

        if (!input.hasNextInt()){
            System.out.println("Input Harus Berupa Angka");
            input.nextLine();
            continue;
        }
        detailKendaraan = input.nextInt();
        input.nextLine();

        if (detailKendaraan == 1){
            int jumlahRoda;

            while (true){
                System.out.print("Jumlah Roda: ");

                if (input.hasNextInt()){
                    jumlahRoda = input.nextInt();
                    input.nextLine();
                    break;
                }else{
                    System.out.println("Jumlah pintu harus berupa angka");
                    input.nextLine();
                }
            }
            
            System.out.println("\nPilih Layanan: ");
            System.out.println("1. Cuci Reguler Mobil - Rp50000");
            System.out.println("2. Cuci Premium Mobil - Rp75000");
            
            Layanan layanan;

            while (true){

                System.out.println("Pilihan Layanan: ");

                if (!input.hasNextInt()){
                    System.out.println("Input Harus Berupa Angka");
                    input.nextLine();
                    continue;
                }

                int pilihanLayanan = input.nextInt();
                input.nextLine();

                if (pilihanLayanan == 1){
                layanan = new Layanan("LY001", "Cuci Reguler Mobil", 50000);
                    break;

                }else if (pilihanLayanan == 2){
                    layanan = new Layanan("LY002", "Cuci Premium Mobil", 75000);
                    break;
                
                }else{
                System.out.println("Pilihan Layanan Tidak Valid! pilih 1-2.");
            }
        }
        kendaraan = new Mobil(noPlat, merk, warna, jumlahRoda, layanan);
       
        int nomorTersedia = transaksiDAO.getNomorTersedia();
        Transaksi.setCounter(nomorTersedia - 1);
        
        Transaksi transaksi = new Transaksi(pelanggan, kendaraan, layanan);

        transaksiDAO.tambah(transaksi);

        System.out.println("\nData Pencucian Berhasil Ditambahkan!");
        break;
        
        }else if (detailKendaraan == 2){
            int cc;

            while (true){
                System.out.print("cc : ");

                if (input.hasNextInt()){
                    cc = input.nextInt();
                    input.nextLine();
                    break;
                }else{
                    System.out.println("cc harus berupa angka");
                    input.nextLine();
                }
            }
            
            System.out.println("\nPilih Layanan: ");
            System.out.println("1. Cuci Reguler Motor - Rp20000");
            System.out.println("2. Cuci Premium Motor - Rp35000");
            
             Layanan layanan;

            while (true){

                System.out.println("Pilihan Layanan: ");

                if (!input.hasNextInt()){
                    System.out.println("Input Harus Berupa Angka");
                    input.nextLine();
                    continue;
                }

                int pilihanLayanan = input.nextInt();
                input.nextLine();

                if (pilihanLayanan == 1){
                layanan = new Layanan("LY003", "Cuci Reguler Motor", 20000);
                    break;

                }else if (pilihanLayanan == 2){
                    layanan = new Layanan("LY004", "Cuci Premium Motor", 35000);
                    break;
                }else{
                    System.out.println("Pilihan Layanan Tidak Valid! pilih 1-2.");
                }
            }
            kendaraan = new Motor(noPlat, merk, warna, cc, layanan);
            
            int nomorTersedia = transaksiDAO.getNomorTersedia();
            Transaksi.setCounter(nomorTersedia - 1);
            
            Transaksi transaksi = new Transaksi(pelanggan, kendaraan, layanan);

            transaksiDAO.tambah(transaksi);

            System.out.println("\nData Pencucian Berhasil Ditambahkan!");
        break;  
        }else{
            System.out.println("Pilihan Layanan Tidak Valid! pilih 1-2.");
        }
    }
}
public void tampilkanData(){
    
    System.out.println("\n=== Data Pencucian Kendaraan ===");
    transaksiDAO.tampilkanSemua();
}
public void ubahData(){

    System.out.println("\n=== Ubah Data Pencucian ===");

    System.out.println("Masukan ID Transaksi: ");
    String idTransaksi = input.nextLine();

    Transaksi transaksi = transaksiDAO.cariById(idTransaksi);

        if(transaksi != null) {

                        System.out.print("Nama Pelanggan Baru: ");
                        String nama = input.nextLine();

                        String noTelepon;
    
                        while (true){
                            System.out.print("Nomor Telepon Baru: ");
                            noTelepon = input.nextLine();

                            if (noTelepon.isEmpty() || noTelepon.matches("\\d+")){
                                break;
                            } else {
                                System.out.println("Nomor Telepon hanya boleh berisi angka!");
                            }
                        }

transaksi.getPelanggan().setNama(nama);
transaksi.getPelanggan().setNoTelepon(noTelepon);

                        System.out.print("noPlat Baru: ");
                        String noPlat = input.nextLine();

                        System.out.print("Merk Kendaraan Baru: ");
                        String merk = input.nextLine();

                        System.out.print("warna Kendaraan Baru: ");
                        String warna = input.nextLine();

                        System.out.println("\nJenis Kendaraan Baru: ");
                        System.out.println("1. Mobil");
                        System.out.println("2. Motor");

                        int detailKendaraanBaru;
                        Kendaraan kendaraanBaru = null;

                        while (true){

                            System.out.println("pilih: ");

                            if (!input.hasNextInt()){
                                System.out.println("Input Harus Berupa Angka");
                                input.nextLine();
                                continue;
                            }
                            detailKendaraanBaru = input.nextInt();
                            input.nextLine();

                            if (detailKendaraanBaru == 1){
                                int jumlahRoda;

                                while (true){
                                    System.out.print("Jumlah Roda: ");

                                    if (input.hasNextInt()){
                                        jumlahRoda = input.nextInt();
                                        input.nextLine();
                                        break;
                                    }else{
                                        System.out.println("Jumlah pintu harus berupa angka");
                                        input.nextLine();
                                    }
                                }
                                
                            System.out.println("\nPilih Layanan Baru: ");
                            System.out.println("1. Cuci Reguler Mobil - Rp50000");
                            System.out.println("2. Cuci Premium Mobil - Rp75000");

                            Layanan layananBaru1;

                            while (true){

                                System.out.println("Pilihan Layanan: ");

                                if (!input.hasNextInt()){
                                    System.out.println("Input Harus Berupa Angka");
                                    input.nextLine();
                                    continue;
                                }

                                int pilihanLayananBaru1 = input.nextInt();
                                input.nextLine();

                                if (pilihanLayananBaru1 == 1){
                                layananBaru1 = new Layanan("LY001", "Cuci Reguler Mobil", 50000);
                                    break;

                                }else if (pilihanLayananBaru1 == 2){
                                    layananBaru1 = new Layanan("LY002", "Cuci Premium Mobil", 75000);
                                    break;

                                }else{
                                System.out.println("Pilihan Layanan Tidak Valid! pilih 1-2.");
                            }
                        }

                        kendaraanBaru = new Mobil(noPlat, merk, warna, jumlahRoda, layananBaru1);
                        transaksi.setKendaraan(kendaraanBaru);
                        transaksi.setLayanan(layananBaru1);
                        break;
                            }else if (detailKendaraanBaru == 2){
                                int cc;

                                while (true){
                                    System.out.print("cc : ");

                                    if (input.hasNextInt()){
                                        cc = input.nextInt();
                                        input.nextLine();
                                        break;
                                    }else{
                                        System.out.println("cc harus berupa angka");
                                        input.nextLine();
                                    }
                                }

                                System.out.println("\nPilih Layanan: ");
                                System.out.println("1. Cuci Reguler Motor - Rp20000");
                                System.out.println("2. Cuci Premium Motor - Rp35000");

                                 Layanan layananBaru2;

                                while (true){

                                    System.out.println("Pilihan Layanan: ");

                                    if (!input.hasNextInt()){
                                        System.out.println("Input Harus Berupa Angka");
                                        input.nextLine();
                                        continue;
                                    }

                                    int pilihanLayananBaru2 = input.nextInt();
                                    input.nextLine();

                                    if (pilihanLayananBaru2 == 1){
                                    layananBaru2 = new Layanan("LY003", "Cuci Reguler Motor", 20000);
                                        break;

                                    }else if (pilihanLayananBaru2 == 2){
                                        layananBaru2 = new Layanan("LY004", "Cuci Premium Motor", 35000);
                                        break;
                                    }else{
                                        System.out.println("Pilihan Layanan Tidak Valid! pilih 1-2.");
                                    }
                                }
                                kendaraanBaru = new Motor(noPlat, merk, warna, cc, layananBaru2);
                                transaksi.setKendaraan(kendaraanBaru);
                                transaksi.setLayanan(layananBaru2);

                            
                            break;

                            }else{
                                System.out.println("Pilihan Layanan Tidak Valid! pilih 1-2.");
                            }
                        }
                    transaksiDAO.ubah(transaksi);
                    System.out.print("\nData Berhasil Diubah");
                }else{
                    System.out.println("ID Transaksi Tidak Ditemukan.");
            }
                
        }

public void prosesPencucian(){

    System.out.println("\n=== Proses Pencucian ===");

    System.out.println("Masukan ID Transaksi: ");
    String idTransaksi = input.nextLine();

    Transaksi transaksi = transaksiDAO.cariById(idTransaksi);

        if(transaksi!= null) {
            
            System.out.println("\n--- Data Pencucian ---");
System.out.println("---------------------------");
            
            Kendaraan kendaraan = transaksi.getKendaraan();
            
            kendaraan.tampilkanData();
            
System.out.println("---------------------------");
            
            String pilihan;
            
            while(true){
                System.out.print("Mulai Pencucian (ya/tidak): ");
                pilihan = input.nextLine();
                
                if (pilihan.equalsIgnoreCase("ya") || pilihan.equalsIgnoreCase("tidak")){
                    break;
                }
                System.out.println("Input Tidak Valid, Silahkan Masukkan ya atau tidak.");
                        
            }
            if (pilihan.equalsIgnoreCase("ya")){
                
                BisaDicuci bisaDicuci = kendaraan.getBisaDicuci();
                
                bisaDicuci.cuci();
                
                System.out.println("Mohon Tunggu Proses Pencucian Berlangsung.");
                
                System.out.println("Pencucian Selesai");
                
            }else{
                System.out.println("Proses Pencucian Dibatalkan");
            }
            return;   
        }     
        System.out.println("ID Transaksi Tidak Ditemukan.");
    }

public void hapusData(){

    System.out.println("\n=== Hapus Data Pencucian ===");

    System.out.println("Masukan ID Transaksi");
    String idTransaksi = input.nextLine();
    
    Transaksi transaksi = transaksiDAO.cariById(idTransaksi);

        if (transaksi != null) {

    transaksiDAO.hapus(idTransaksi);
            System.out.println("\nData Berhasil Dihapus");
            
        }else{
            System.out.println("ID Transaksi Tidak Ditemukan.");
        }
    }
    
}
