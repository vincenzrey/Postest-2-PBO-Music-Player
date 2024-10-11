/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lagu;

/**
 *
 * @author DELL
 */

public final class LaguPop extends Lagu {
    
    public LaguPop (int nomorlagu, String judul, String artis, double durasi){
        super (nomorlagu, judul, artis, durasi);
    }
    
    @Override
    public void displayinfo() {
        System.out.println("[Pop] " + getnomorlagu() + ". " + getjudul() + " - " + getartis() + " (" + getdurasi() + " menit)");
    }
}

