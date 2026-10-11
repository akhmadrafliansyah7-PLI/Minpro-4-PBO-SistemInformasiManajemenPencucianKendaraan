/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistempencuciankendaraan;

import sistempencuciankendaraan.Controller.MenuController;
import sistempencuciankendaraan.View.MenuView;
/**
 *
 * @author Lenovo GK
 */
public class SistemPencucianKendaraan {
    
    public static void main(String[] args){
        
        MenuView View = new MenuView();
        MenuController Controller = new MenuController(View);
        
        Controller.jalankanProgram();
    }
}
     