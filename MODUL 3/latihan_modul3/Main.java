package latihan_modul3;
import java.awt.CardLayout;
import javax.swing.*;

public class Main extends JFrame{
    CardLayout cardLayout;
    JPanel panelUtama;
    HalamanKatalog halamanKatalog;
    HalamanPesanan halamanPesanan;

    public Main(){
        cardLayout = new CardLayout();
        panelUtama = new JPanel();
        panelUtama.setLayout(cardLayout);

        halamanKatalog = new HalamanKatalog(this);
        halamanPesanan = new HalamanPesanan(this);

        panelUtama.add(halamanKatalog,  "katalog");
        panelUtama.add(halamanPesanan,  "pesanan");

        setTitle("DNE DEVS");
        setSize(520, 350);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(panelUtama);
    }

    public void bukaKatalog(){
        cardLayout.show(panelUtama, "katalog");
    }

    public void bukaPesanan(){
        halamanPesanan.resetPesanan();
        cardLayout.show(panelUtama, "pesanan");
    }

    public static void main(String[] args) {
        Main aplikasi;
        aplikasi = new Main();
        aplikasi.setVisible(true);
    }
}
