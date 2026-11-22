package latihan_modul3;
import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;

class HalamanKatalog extends JPanel{
    private GridLayout layoutUtama;
    private GridLayout layoutAtas;
    private GridLayout layoutKartu;
    private GridLayout layoutCompany;
    private GridLayout layoutEcommerce;
    private FlowLayout layoutBawah;
    private JPanel panelAtas;
    private JPanel panelKartu;
    private JPanel panelBawah;
    private JPanel kartuCompany;
    private JPanel kartuEcommerce;
    private ImageIcon iconLogo;
    private ImageIcon iconCompany;
    private ImageIcon iconEcommerce;
    private JLabel labelLogo;
    private JLabel labelJudul;
    private JLabel gambarCompany;
    private JLabel gambarEcommerce;
    private JLabel namaCompany;
    private JLabel namaEcommerce;
    private JButton tombolPesan;
    private Main frame;

    public HalamanKatalog(Main frame) {
        this.frame = frame;

        layoutUtama = new GridLayout(3, 1, 12, 8);
        layoutAtas = new GridLayout(2, 1, 0, 8);
        layoutKartu = new GridLayout(1, 2, 12, 0);
        layoutCompany = new GridLayout(2, 1, 0, 8);
        layoutEcommerce = new GridLayout(2, 1, 0, 8);
        layoutBawah = new FlowLayout(FlowLayout.CENTER);
        panelAtas = new JPanel();
        panelKartu = new JPanel();
        panelBawah = new JPanel();
        kartuCompany = new JPanel();
        kartuEcommerce = new JPanel();
        ImageIcon iconLogo = new ImageIcon("assets/logo_dne.png");
        ImageIcon iconCompany = new ImageIcon("assets/company.png");
        ImageIcon iconEcommerce = new ImageIcon("assets/ecommerce.png");
        labelLogo = new JLabel(iconLogo);
        labelJudul = new JLabel("Katalog Layanan", SwingConstants.CENTER, Theme.JUDUL, Theme.HITAM);
        gambarCompany = new JLabel(iconCompany);
        gambarEcommerce = new JLabel(iconEcommerce);
        namaCompany = new JLabel("Company Profile", SwingConstants.CENTER, Theme.JUDUL, Theme.HITAM);
        namaEcommerce = new JLabel("E-Commerce", SwingConstants.CENTER, Theme.JUDUL, Theme.HITAM);
        tombolPesan = new JButton("Pesan Sekarang");
        
        kartuCompany.setLayout(layoutCompany);
        kartuEcommerce.setLayout(layoutEcommerce);
        kartuCompany.add(gambarCompany);
        kartuCompany.add(namaCompany);
        kartuEcommerce.add(gambarEcommerce);
        kartuEcommerce.add(namaEcommerce);

        setLayout(layoutAtas);
        setLayout(layoutKartu);
        setLayout(layoutBawah);
        setLayout(layoutUtama);
        
        panelAtas.add(labelLogo);
        panelAtas.add(labelJudul);
        panelKartu.add();
        panelBawah.add(tombolPesan);
    }
}