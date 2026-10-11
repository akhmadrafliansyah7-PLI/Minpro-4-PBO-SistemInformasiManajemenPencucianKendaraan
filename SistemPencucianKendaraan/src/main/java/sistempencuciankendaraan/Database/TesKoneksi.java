/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistempencuciankendaraan.Database;

import sistempencuciankendaraan.DAO.TransaksiDAO;
/**
 *
 * @author Lenovo GK
 */
public class TesKoneksi {
    
    public static void main(String[] args) {
        TransaksiDAO dao = new TransaksiDAO();
        dao.tampilkanSemua();
    }
}
