/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihankuis;

/**
 *
 * @author GaryFaldi
 */
public class Mobil extends Kendaraan {
    public Mobil(String nama, int hargaSewa) {
        super(nama, hargaSewa);
    }

    @Override
    public void info() {
        System.out.println("Mobil: " + nama + ", Harga: " + hargaSewa);
    }
}
