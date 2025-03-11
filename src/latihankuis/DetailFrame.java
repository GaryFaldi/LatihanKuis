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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DetailFrame extends JFrame {
    private JTextField namaField, teleponField, hariField;
    private JRadioButton rb1, rb2, rb3;
    private ButtonGroup group;
    private String jenisKendaraan;

    public DetailFrame(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
        setTitle("Detail Penyewaan - " + jenisKendaraan);
        setSize(600, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        
        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        JLabel titleLabel = new JLabel("Masukkan Data Diri Anda", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(titleLabel, BorderLayout.NORTH);
        
        gbc.gridx = 0; gbc.gridy = 0; mainPanel.add(new JLabel("Nama Penyewa:"), gbc);
        gbc.gridx = 1; namaField = new JTextField(15); mainPanel.add(namaField, gbc);

        gbc.gridx = 0; gbc.gridy = 1; mainPanel.add(new JLabel("No Telepon:"), gbc);
        gbc.gridx = 1; teleponField = new JTextField(15); mainPanel.add(teleponField, gbc);

        gbc.gridx = 0; gbc.gridy = 2; mainPanel.add(new JLabel("Pilih Kendaraan:"), gbc);
        
        JPanel radioPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        if (jenisKendaraan.equals("Motor")) {
            rb1 = new JRadioButton("Scooter - Rp 50,000");
            rb2 = new JRadioButton("Sport - Rp 100,000");
            rb3 = new JRadioButton("Matic - Rp 70,000");
        } else {
            rb1 = new JRadioButton("Sedan - Rp 300,000");
            rb2 = new JRadioButton("SUV - Rp 500,000");
            rb3 = new JRadioButton("MPV - Rp 400,000");
        }
        
        group = new ButtonGroup();
        group.add(rb1);
        group.add(rb2);
        group.add(rb3);
        
        radioPanel.add(rb1);
        radioPanel.add(rb2);
        radioPanel.add(rb3);
        
        gbc.gridx = 1; mainPanel.add(radioPanel, gbc);
        
        gbc.gridx = 0; gbc.gridy = 3; mainPanel.add(new JLabel("Jumlah Hari Sewa:"), gbc);
        gbc.gridx = 1; hariField = new JTextField(5); mainPanel.add(hariField, gbc);
        
        JButton btnSimpan = new JButton("Simpan");
        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 2;
        mainPanel.add(btnSimpan, gbc);
        
        add(mainPanel, BorderLayout.CENTER);
        
        btnSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                simpanData();
            }
        });

        setVisible(true);
    }

    private void simpanData() {
        try {
            String nama = namaField.getText();
            String telepon = teleponField.getText();
            int jumlahHari = Integer.parseInt(hariField.getText());
            int hargaSewa = 0;
            String kendaraanDipilih = "";

            if (rb1.isSelected()) {
                kendaraanDipilih = rb1.getText().split(" - ")[0];
                hargaSewa = Integer.parseInt(rb1.getText().split("Rp ")[1].replace(",", ""));
            } else if (rb2.isSelected()) {
                kendaraanDipilih = rb2.getText().split(" - ")[0];
                hargaSewa = Integer.parseInt(rb2.getText().split("Rp ")[1].replace(",", ""));
            } else if (rb3.isSelected()) {
                kendaraanDipilih = rb3.getText().split(" - ")[0];
                hargaSewa = Integer.parseInt(rb3.getText().split("Rp ")[1].replace(",", ""));
            } else {
                JOptionPane.showMessageDialog(this, "Pilih jenis kendaraan!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (nama.isEmpty() || telepon.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nama dan Telepon wajib diisi!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            new TotalFrame(nama, telepon, kendaraanDipilih, hargaSewa, jumlahHari).setVisible(true);
            this.dispose();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Jumlah hari harus angka!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}


