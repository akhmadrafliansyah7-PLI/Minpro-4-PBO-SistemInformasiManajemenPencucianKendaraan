/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistempencuciankendaraan;

import sistempencuciankendaraan.Controller.MenuController;
import sistempencuciankendaraan.DAO.TransaksiDAO;
import sistempencuciankendaraan.Model.Transaksi;
/**
 *
 * @author Lenovo GK
 */
import sistempencuciankendaraan.View.MenuView;
import sistempencuciankendaraan.Controller.MenuController;

public class SistemPencucianKendaraan {
    
    public static void main(String[] args){
        
        MenuView View = new MenuView();
        MenuController Controller = new MenuController(View);
        
        TransaksiDAO transaksiDAO = new TransaksiDAO();
        Transaksi.setCounter(transaksiDAO.getNomorTerakhir());
        
        Controller.jalankanProgram();
    }
}
     