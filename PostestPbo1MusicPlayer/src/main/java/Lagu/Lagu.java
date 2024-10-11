/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lagu;

/**
 *
 * @author DELL
 */
public abstract class Lagu {
    private int nomorlagu;
    private String judul;
    private String artis;
    private double durasi;
    
    public Lagu(int nomorlagu, String judul, String artis, double durasi){
        this.nomorlagu = nomorlagu;
        this.judul = judul;
        this.artis = artis;
        this.durasi = durasi;
    }
    
    public abstract void displayinfo();
    
    public int getnomorlagu(){
    return nomorlagu;
    }
    
    public String getjudul(){
        return judul;
    }
    
    public String getartis(){
        return artis;
    }
    
    public double getdurasi(){
        return durasi;
    } 
    
    public void setnomorlagu(int nomorlagu){
    this.nomorlagu = nomorlagu;
    }
    
    public void setjudul(String judul){
        this.judul = judul;
    }
    
    public void setartis(String artis){
        this.artis = artis;
    }
    
    public void setdurasi(double durasi){
        this.durasi = durasi;
    }  
}
