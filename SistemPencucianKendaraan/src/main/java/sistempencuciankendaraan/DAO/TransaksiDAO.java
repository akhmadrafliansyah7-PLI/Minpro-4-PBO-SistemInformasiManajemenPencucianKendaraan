/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistempencuciankendaraan.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sistempencuciankendaraan.Database.Koneksi;
import sistempencuciankendaraan.Model.Kendaraan;
import sistempencuciankendaraan.Model.Layanan;
import sistempencuciankendaraan.Model.Mobil;
import sistempencuciankendaraan.Model.Motor;
import sistempencuciankendaraan.Model.Pelanggan;
import sistempencuciankendaraan.Model.Transaksi;
/**
 *
 * @author Lenovo GK
 */
public class TransaksiDAO {
    
    
    public void tambah(Transaksi transaksi){
        String sql = "INSERT INTO pencucian "
            + "(id_transaksi, id_pelanggan, nama_pelanggan, "
            + "no_telepon, no_plat, merk, warna, "
            + "jenis_kendaraan, jumlah_roda, cc, "
            + "kode_layanan, nama_layanan, harga) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
    Pelanggan pelanggan = transaksi.getPelanggan();
    Kendaraan kendaraan = transaksi.getKendaraan();
    Layanan layanan = transaksi.getLayanan();

    String jenisKendaraan = kendaraan.getJenisKendaraan();
    Integer jumlahRoda = null;
    Integer cc = null;
    
    if (jenisKendaraan.equalsIgnoreCase("Mobil")) {
        jumlahRoda = kendaraan.getJumlahRoda();
    } else if (jenisKendaraan.equalsIgnoreCase("Motor")) {
        cc = kendaraan.getcc();
    }
    try (
        Connection conn = Koneksi.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql)
    ) {
        ps.setString(1, transaksi.getIdTransaksi());
        ps.setString(2, pelanggan.getIdPelanggan());
        ps.setString(3, pelanggan.getNama());
        ps.setString(4, pelanggan.getNoTelepon());
        ps.setString(5, kendaraan.getNoPlat());
        ps.setString(6, kendaraan.getMerk());
        ps.setString(7, kendaraan.getWarna());
        ps.setString(8, jenisKendaraan);

        if (jumlahRoda == null) {
            ps.setNull(9, java.sql.Types.INTEGER);
        } else {
            ps.setInt(9, jumlahRoda);
        }

        if (cc == null) {
            ps.setNull(10, java.sql.Types.INTEGER);
        } else {
            ps.setInt(10, cc);
        }

        ps.setString(11, layanan.getKodeLayanan());
        ps.setString(12, layanan.getNamaLayanan());
        ps.setDouble(13, layanan.getHarga());

        ps.executeUpdate();
        System.out.println("Data berhasil disimpan ke database.");

    } catch (SQLException e) {
        System.out.println("Gagal menambahkan data: "
                + e.getMessage());
    }
    }
    public void tampilkanSemua() {

        String sql = "SELECT * FROM pencucian";

        try (
            Connection conn = Koneksi.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()
        ) {
            boolean adaData = false;

            while (rs.next()) {
                adaData = true;

                System.out.println("\n==============================");
                System.out.println("ID Transaksi: "
                    + rs.getString("id_transaksi"));
                System.out.println("ID Pelanggan: "
                    + rs.getString("id_pelanggan"));
                System.out.println("Nama Pelanggan: "
                    + rs.getString("nama_pelanggan"));
                System.out.println("Nomor Telepon: "
                    + rs.getString("no_telepon"));
                System.out.println("Nomor Plat: "
                    + rs.getString("no_plat"));
                System.out.println("Merk: "
                    + rs.getString("merk"));
                System.out.println("Warna: "
                    + rs.getString("warna"));
                System.out.println("Jenis Kendaraan: "
                    + rs.getString("jenis_kendaraan"));

                if ("Mobil".equalsIgnoreCase(
                        rs.getString("jenis_kendaraan"))) {
                    System.out.println("Jumlah Roda: "
                        + rs.getString("jumlah_roda"));
                } else {
                    System.out.println("CC: "
                        + rs.getString("cc"));
                }

                System.out.println("Kode Layanan: "
                    + rs.getString("kode_layanan"));
                System.out.println("Layanan: "
                    + rs.getString("nama_layanan"));
                System.out.println("Harga: Rp"
                    + rs.getBigDecimal("harga"));
            }

            if (!adaData) {
                System.out.println("Belum ada data pencucian.");
            }

        } catch (SQLException e) {
            System.out.println("Gagal menampilkan data: "
                + e.getMessage());
        }
    }
    public void ubah(Transaksi transaksi) {
        String sql = "UPDATE pencucian SET "
                + "nama_pelanggan = ?, "
                + "no_telepon = ?, "
                + "no_plat = ?, "
                + "merk = ?, "
                + "warna = ?, "
                + "jenis_kendaraan = ?, "
                + "jumlah_roda = ?, "
                + "cc = ?, "
                + "kode_layanan = ?, "
                + "nama_layanan = ?, "
                + "harga = ? "
                + "WHERE id_transaksi = ?";

        Pelanggan pelanggan = transaksi.getPelanggan();
        Kendaraan kendaraan = transaksi.getKendaraan();
        Layanan layanan = transaksi.getLayanan();

        String jenisKendaraan = kendaraan.getJenisKendaraan();

        Integer jumlahRoda = null;
        Integer cc = null;

        if (jenisKendaraan.equalsIgnoreCase("Mobil")) {
            jumlahRoda = kendaraan.getJumlahRoda();
        } else if (jenisKendaraan.equalsIgnoreCase("Motor")) {
            cc = kendaraan.getcc();
        }

        try (
            Connection conn = Koneksi.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            ps.setString(1, pelanggan.getNama());
            ps.setString(2, pelanggan.getNoTelepon());
            ps.setString(3, kendaraan.getNoPlat());
            ps.setString(4, kendaraan.getMerk());
            ps.setString(5, kendaraan.getWarna());
            ps.setString(6, jenisKendaraan);

            if (jumlahRoda == null) {
                ps.setNull(7, java.sql.Types.INTEGER);
            } else {
                ps.setInt(7, jumlahRoda);
            }

            if (cc == null) {
                ps.setNull(8, java.sql.Types.INTEGER);
            } else {
                ps.setInt(8, cc);
            }

            ps.setString(9, layanan.getKodeLayanan());
            ps.setString(10, layanan.getNamaLayanan());
            ps.setDouble(11, layanan.getHarga());
            ps.setString(12, transaksi.getIdTransaksi());

            ps.executeUpdate();

            System.out.println("Data berhasil diubah di database.");

        } catch (SQLException e) {
            System.out.println("Gagal mengubah data: " + e.getMessage());
        }
    }
    public void hapus(String idTransaksi) {
        String sql = "DELETE FROM pencucian WHERE id_transaksi = ?";

        try (
            Connection conn = Koneksi.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ) {
            ps.setString(1, idTransaksi);

            ps.executeUpdate();

            System.out.println("Data berhasil dihapus dari database.");

        } catch (SQLException e) {
            System.out.println("Gagal menghapus data: " + e.getMessage());
        }
    }
    public Transaksi cariById(String idTransaksi) {

        String sql = "SELECT * FROM pencucian WHERE id_transaksi = ?";

        try (
            Connection conn = Koneksi.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ) {

            ps.setString(1, idTransaksi);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {

                    Pelanggan pelanggan = new Pelanggan(
                        rs.getString("id_pelanggan"),
                        rs.getString("nama_pelanggan"),
                        rs.getString("no_telepon")
                    );
                    Layanan layanan = new Layanan(
                        rs.getString("kode_layanan"),
                        rs.getString("nama_layanan"),
                        rs.getDouble("harga")
                    );
                    Kendaraan kendaraan;

                    if (rs.getString("jenis_kendaraan")
                            .equalsIgnoreCase("Mobil")) {

                        kendaraan = new Mobil(
                            rs.getString("no_plat"),
                            rs.getString("merk"),
                            rs.getString("warna"),
                            rs.getInt("jumlah_roda"),
                            layanan
                        );

                    } else {

                        kendaraan = new Motor(
                            rs.getString("no_plat"),
                            rs.getString("merk"),
                            rs.getString("warna"),
                            rs.getInt("cc"),
                            layanan
                        );
                    }

                    return new Transaksi(
                        rs.getString("id_transaksi"),
                        pelanggan,
                        kendaraan,
                        layanan
                    );
                }
            }

        } catch (SQLException e) {
            System.out.println("Gagal mencari data: " + e.getMessage());
        }

        return null;
    }
    public int getNomorTerakhir() {
    String sql = "SELECT id_transaksi FROM pencucian "
               + "ORDER BY CAST(SUBSTRING(id_transaksi, 3) AS UNSIGNED) DESC "
               + "LIMIT 1";

    try (
        Connection conn = Koneksi.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery()
    ) {
        if (rs.next()) {
            String id = rs.getString("id_transaksi");
            return Integer.parseInt(id.substring(2));
        }
    } catch (SQLException e) {
        System.out.println("Gagal mengambil ID transaksi terakhir: "
                + e.getMessage());
    }

    return 0;
}
}
