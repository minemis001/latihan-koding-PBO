package latihan_modul3;
import javax.swing.*;
import java.awt.*;


class HalamanPesanan extends JPanel{
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