package latihan_modul3;
import javax.swing.*;
import java.awt.*;

class HalamanPesanan extends JPanel{
    private GridLayout layoutUtama;
    private FlowLayout layoutJudul;
    private GridLayout layoutInfo;
    private GridLayout layoutLayanan;
    private GridLayout layoutTotal;
    private FlowLayout layoutTombol;
    private JPanel panelJudul;
    private JPanel panelInformasi;
    private JPanel panelLayanan;
    private JPanel panelTotal;
    private JPanel panelTombol;
    private ImageIcon iconSukses;
    private JLabel labelJudul;
    private JLabel labelLayanan;
    private JLabel labelNamaLayanan;
    private JLabel labelTotalJudul;
    private JLabel labelTotal;
    private JCheckBox checkHosting;
    private JButton tombolKembali;
    private JButton tombolHitung;
    private JButton tombolSimpan;
    private int hargaWebsite;
    private int hargaHosting;
    private Main frame;

    public HalamanPesanan(Main frame) {
        this.frame = frame;

        layoutUtama = new GridLayout(3, 1, 0, 8);
        layoutJudul = new FlowLayout(FlowLayout.CENTER, 0, 8);
        layoutInfo = new GridLayout(3, 1, 0, 4);
        layoutLayanan = new GridLayout(1, 2, 8, 0);
        layoutTotal = new GridLayout(1, 2, 8, 0);
        layoutTombol = new FlowLayout(FlowLayout.CENTER, 12, 8);
        panelJudul = new JPanel();
        panelInformasi = new JPanel();
        panelLayanan = new JPanel();
        panelTotal = new JPanel();
        panelTombol = new JPanel();
        iconSukses = new ImageIcon("assets/check.png");
        labelJudul = new JLabel("Detail Pesanan");
        labelLayanan = new JLabel("Layanan Website:");
        labelNamaLayanan = new JLabel("Website Profesional (Rp1.049.000)", SwingConstants.CENTER);
        labelTotalJudul = new JLabel("Total Harga:");
        labelTotal = new JLabel("Rp1.049.000", SwingConstants.CENTER);
        checkHosting = new JCheckBox("Hosting 1 Tahun (+Rp100.000)");
        tombolKembali = new JButton("Kembali");
        tombolHitung = new JButton("Hitung Total");
        tombolSimpan = new JButton("Simpan");
        hargaWebsite = 1049000;
        hargaHosting = 100000;

        labelJudul.setFont(Theme.JUDUL);
        labelJudul.setForeground(Theme.HITAM);
        labelLayanan.setFont(Theme.SUBJUDUL);
        labelLayanan.setForeground(Theme.HITAM);
        labelNamaLayanan.setFont(Theme.SUBJUDUL);
        labelNamaLayanan.setForeground(Theme.HITAM);
        labelTotalJudul.setFont(Theme.SUBJUDUL);
        labelTotalJudul.setForeground(Theme.HITAM);
        labelTotal.setFont(Theme.SUBJUDUL);
        labelTotal.setForeground(Theme.HITAM);
        checkHosting.setFont(Theme.NORMAL);
        checkHosting.setForeground(Theme.HITAM);

        tombolKembali.setFont(Theme.TOMBOL);
        tombolKembali.setBackground(Theme.PUTIH);
        tombolKembali.setForeground(Theme.BIRU);
        tombolHitung.setFont(Theme.TOMBOL);
        tombolHitung.setBackground(Theme.BIRU);
        tombolHitung.setForeground(Theme.PUTIH);
        tombolSimpan.setFont(Theme.TOMBOL);
        tombolSimpan.setBackground(Theme.KUNING);
        tombolSimpan.setForeground(Theme.HITAM);

        setLayout(layoutUtama);
        panelJudul.setLayout(layoutJudul);
        panelInformasi.setLayout(layoutInfo);
        panelLayanan.setLayout(layoutLayanan);
        panelTotal.setLayout(layoutTotal);
        panelTombol.setLayout(layoutTombol);

        panelJudul.add(labelJudul);
        panelLayanan.add(labelLayanan);
        panelLayanan.add(labelNamaLayanan);
        panelTotal.add(labelTotalJudul);
        panelTotal.add(labelTotal);
        panelInformasi.add(panelLayanan);
        panelInformasi.add(checkHosting);
        panelInformasi.add(panelTotal);
        panelTombol.add(tombolKembali);
        panelTombol.add(tombolHitung);
        panelTombol.add(tombolSimpan);

        add(panelJudul);
        add(panelInformasi);
        add(panelTombol);

        tombolKembali.addActionListener(e -> frame.bukaKatalog());
        tombolHitung.addActionListener(e -> hitungTotal());
        tombolSimpan.addActionListener(e -> simpanPesanan());
    }

    public void hitungTotal(){
        int total = hargaWebsite;
        if (checkHosting.isSelected()) {
            total = total + hargaHosting;
        }
        labelTotal.setText(String.format("Rp%,d", total).replace(',', '.'));
    }

    public void simpanPesanan(){
        JOptionPane.showMessageDialog(this, "Order Sukses", "DNE DEVS", JOptionPane.PLAIN_MESSAGE, iconSukses);
        resetPesanan();
        frame.bukaKatalog();
    }

    public void resetPesanan(){
        checkHosting.setSelected(false);
        labelTotal.setText("Rp1.049.000");
    }
}