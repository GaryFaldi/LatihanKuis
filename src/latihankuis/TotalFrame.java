/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihankuis;

/**
 *
 * @author GaryFaldi
 */
import javax.swing.*;
import java.awt.*;

public class TotalFrame extends JFrame {
    public TotalFrame(String nama, String telepon, String kendaraan, int harga, int hari) {
        setTitle("Struk Penyewaan");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        
        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        JLabel titleLabel = new JLabel("Detail Penyewaan", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(titleLabel, BorderLayout.NORTH);
        
        gbc.gridx = 0; gbc.gridy = 0; mainPanel.add(new JLabel("Nama Penyewa:"), gbc);
        gbc.gridx = 1; mainPanel.add(new JLabel(nama), gbc);
        
        gbc.gridx = 0; gbc.gridy = 1; mainPanel.add(new JLabel("No Telepon:"), gbc);
        gbc.gridx = 1; mainPanel.add(new JLabel(telepon), gbc);
        
        gbc.gridx = 0; gbc.gridy = 2; mainPanel.add(new JLabel("Kendaraan:"), gbc);
        gbc.gridx = 1; mainPanel.add(new JLabel(kendaraan), gbc);
        
        gbc.gridx = 0; gbc.gridy = 3; mainPanel.add(new JLabel("Harga per Hari:"), gbc);
        gbc.gridx = 1; mainPanel.add(new JLabel("Rp " + harga), gbc);
        
        gbc.gridx = 0; gbc.gridy = 4; mainPanel.add(new JLabel("Jumlah Hari:"), gbc);
        gbc.gridx = 1; mainPanel.add(new JLabel(String.valueOf(hari)), gbc);
        
        int totalHarga = harga * hari;
        gbc.gridx = 0; gbc.gridy = 5; mainPanel.add(new JLabel("Total Harga:"), gbc);
        gbc.gridx = 1; mainPanel.add(new JLabel("Rp " + totalHarga), gbc);
        
        add(mainPanel, BorderLayout.CENTER);
        
        JButton btnSelesai = new JButton("Selesai");
        btnSelesai.addActionListener(e -> System.exit(0));
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnSelesai);
        
        add(buttonPanel, BorderLayout.SOUTH);
        setVisible(true);
    }
}
