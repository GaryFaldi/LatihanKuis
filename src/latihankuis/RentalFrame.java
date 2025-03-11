/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihankuis;

/**
 *
 * @author GaryFaldi
 */
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.*;


public class RentalFrame extends JFrame {
    public RentalFrame() {
        setTitle("Rental Kendaraan");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JLabel titleLabel = new JLabel("Silahkan pilih Jenis Kendaraan", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(titleLabel, BorderLayout.NORTH);
        
        JPanel panel = new JPanel();
        JButton btnMotor = new JButton("Motor");
        JButton btnMobil = new JButton("Mobil");

        btnMotor.addActionListener(e -> new DetailFrame("Motor").setVisible(true));
        btnMobil.addActionListener(e -> new DetailFrame("Mobil").setVisible(true));

        panel.add(btnMotor);
        panel.add(btnMobil);

        add(panel);
    }

    public static void main(String[] args) {
        new RentalFrame().setVisible(true);
    }
}