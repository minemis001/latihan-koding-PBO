import javax.swing.*;
import java.awt.CardLayout;

public class Main extends JFrame {
    private CardLayout layoutKartu;
    private JPanel panelUtama;
    private HalamanSatu halamanSatu;
    private HalamanDua halamanDua;

    public Main() {
        setTitle("Aplikasi Dua Halaman");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);

        layoutKartu = new CardLayout();
        panelUtama = new JPanel(layoutKartu);

        halamanSatu = new HalamanSatu(this);
        halamanDua = new HalamanDua(this);

        panelUtama.add(halamanSatu, "HALAMAN1");
        panelUtama.add(halamanDua, "HALAMAN2");

        add(panelUtama);
        bukaHalaman1();
    }

    public void bukaHalaman1() {
        layoutKartu.show(panelUtama, "HALAMAN1");
    }

    public void bukaHalaman2() {
        layoutKartu.show(panelUtama, "HALAMAN2");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main().setVisible(true));
    }
}