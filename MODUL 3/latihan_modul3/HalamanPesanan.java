package latihan_modul3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class HalamanPesanan extends JPanel implements ActionListener{
    private Main frame;
    private GridLayout layoutUtama;
    private GridLayout layoutInfo;
    private GridLayout layoutLayanan;
    private GridLayout layoutTotal;
    private FlowLayout layoutJudul;
    private JPanel panelJudul;
    private JPanel panelInformasi;
    private JPanel panelLayanan;
    private JPanel panelTotal;
    private JPanel panelTombol;
    private JLabel labelJudul;
    private JLabel labelLayanan;
    private JLabel labelNamaLayanan;
    private JLabel totalJudul;
    private JLabel labelTotal;
    private JCheckBox checkHosting;
    private JButton tombolKembali;
    private JButton tombolHitung;
    private JButton tombolSimpan;
    private int hargaWebsite;
    private int hargaHosting;

    public HalamanPesanan(Main frame) {
        this.frame = frame;

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
        tombolKembali.addActionListener(e -> this.frame.bukaHalaman1());

        add(labelJudul);
        add(tombolKembali);
    }

    public void hitungTotal(){
        
    }

    public void simpanPesanan(){

    }

    public void resetPesanan(){
        
    }
}