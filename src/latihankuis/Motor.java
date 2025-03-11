/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihankuis;

/**
 *
 * @author GaryFaldi
 */
public class Motor extends Kendaraan {
    public Motor(String nama, int hargaSewa) {
        super(nama, hargaSewa);
    }

    @Override
    public void info() {
        System.out.println("Motor: " + nama + ", Harga: " + hargaSewa);
    }
}
