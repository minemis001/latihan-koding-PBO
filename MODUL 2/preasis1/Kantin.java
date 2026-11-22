package preasis1;
import javax.swing.*;
import java.awt.*;

public class Kantin extends JFrame {
    GridLayout layoutAksi;
    //GridLayout layoutUtama;
    FlowLayout layoutMenu;
    JPanel panelMenu;
    JPanel tombolPanel;
    JButton tombolSimpan;
    JButton tombolEdit;
    JButton tombolHapus;
    JLabel menuKantin;

    public Kantin (){
        layoutAksi = new GridLayout(3,1,8,0);
        layoutMenu = new FlowLayout();
        //layoutUtama = new GridLayout(1,1);
        panelMenu = new JPanel();
        tombolPanel = new JPanel();
        tombolSimpan = new JButton("Makanan");
        tombolEdit = new JButton("Minuman");
        tombolHapus = new JButton("Camilan");
        menuKantin = new JLabel("MENU KANTIN");

        panelMenu.add(menuKantin);
        //tombolPanel.add(menuKantin);
        tombolPanel.add(tombolSimpan);
        tombolPanel.add(tombolEdit);
        tombolPanel.add(tombolHapus);

        //setLayout(layoutUtama);
        panelMenu.setLayout(layoutMenu);
        tombolPanel.setLayout(layoutAksi);
        add(panelMenu);
        add(tombolPanel);
        setSize(520,520);

    }
    public static void main(String[] args) {
        Kantin a = new Kantin();
        a.setVisible(true);
        
    }
}
