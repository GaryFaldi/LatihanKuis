/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihankuis;

/**
 *
 * @author GaryFaldi
 */
public abstract class Kendaraan {
    protected String nama;
    protected int hargaSewa;

    public Kendaraan(String nama, int hargaSewa) {
        this.nama = nama;
        this.hargaSewa = hargaSewa;
    }

    public String getNama() {
        return nama;
    }

    public int getHargaSewa() {
        return hargaSewa;
    }
    
    public abstract void info();
}
