package latihan_modul3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class HalamanKatalog extends JPanel implements ActionListener{
    private Main frame;
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

    public HalamanKatalog(Main frame) {
        this.frame = frame;

        layoutUtama = new GridLayout(3, 1, 12, 8);
        layoutAtas = new GridLayout(2, 1, 0, 8);
        layoutKartu = new GridLayout(1, 2, 0, 8);
        layoutCompany = new GridLayout(2, 1, 8, 0);
        layoutEcommerce = new GridLayout(2, 1, 0, 8);
        layoutBawah = new FlowLayout(FlowLayout.CENTER);
        panelAtas = new JPanel();
        panelKartu = new JPanel();
        panelBawah = new JPanel();
        kartuCompany = new JPanel();
        kartuEcommerce = new JPanel();
        labelLogo = new JLabel("Gambar Logo");
        labelJudul = new JLabel("Katalog Layanan");
        gambarCompany = new JLabel("Gambar Company");
        gambarEcommerce = new JLabel("Gambar Ecommerce");
        namaCompany = new JLabel("Company Profile");
        namaEcommerce = new JLabel("E-Commerce");
        tombolPesan = new JButton("Pesan Sekarang");
        
        ImageIcon logo = new ImageIcon("assets/logo_dne.png");
        ImageIcon company = new ImageIcon("assets/company.png");
        ImageIcon ecommerce = new ImageIcon("assets/ecommerce.png");
        kartuCompany.add(gambarCompany);
        kartuCompany.add(namaCompany);
        kartuEcommerce.add(gambarEcommerce);
        kartuEcommerce.add(namaEcommerce);

        setLayout(layoutUtama);
        
    }
}