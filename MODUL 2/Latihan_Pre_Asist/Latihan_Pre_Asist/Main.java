package Latihan_Pre_Asist.Latihan_Pre_Asist;
import javax.swing.*;
import java.awt.*;

class Main extends JFrame {
    private CardLayout layoutKartu;
    private JPanel panelUtama;
    private HalamanSatu halamanSatu;
    private HalamanDua halamanDua;

    public Main() {
        layoutKartu = new CardLayout();
        panelUtama = new JPanel(layoutKartu);

        halamanSatu = new HalamanSatu(this);
        halamanDua = new HalamanDua(this);

        panelUtama.add(halamanSatu, "halPertama");
        panelUtama.add(halamanDua, "halKedua");

        add(panelUtama);
        setTitle("Latihan 2 - Status Akun");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void bukaHalaman1() {
        layoutKartu.show(panelUtama, "halPertama");
    }

    public void bukaHalaman2() {
        layoutKartu.show(panelUtama, "halKedua");
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.setVisible(true);
    }
}