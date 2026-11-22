package Latihan_Pre_Asist.Latihan_Pre_Asist;
import javax.swing.*;
import java.awt.*;

class HalamanDua extends JPanel {
    private Main mainFrame;
    private GridLayout layoutHalaman;
    private JLabel labelJudul;
    private JButton tombolKembali;

    public HalamanDua(Main mainFrame) {
        this.mainFrame = mainFrame;

        layoutHalaman = new GridLayout(2, 1);
        setLayout(layoutHalaman);
        setBackground(Theme.GELAP_LATAR);

        labelJudul = new JLabel("Halaman 2 - Info Profil Akun", SwingConstants.CENTER);
        labelJudul.setFont(Theme.FONT_UTAMA);
        labelJudul.setForeground(Theme.GELAP_TEKS);

        tombolKembali = new JButton("<< Kembali");
        tombolKembali.setFont(Theme.FONT_UTAMA);
        tombolKembali.setBackground(Theme.GELAP_TOMBOL_BG);
        tombolKembali.setForeground(Theme.GELAP_TOMBOL_TEKS);
        tombolKembali.setBorderPainted(false);
        tombolKembali.setFocusPainted(false);
        tombolKembali.addActionListener(e -> this.mainFrame.bukaHalaman1());

        add(labelJudul);
        add(tombolKembali);
    }
}