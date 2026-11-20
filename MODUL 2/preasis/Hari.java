package preasis;
import javax.swing.*;
import java.awt.*;

public class Hari extends JFrame{
    GridLayout layoutAksi;
    GridLayout layoutUtama;
    FlowLayout layoutMenu;
    JPanel panelMenu;
    JPanel tombolPanel;
    JButton tombolSimpan;
    JButton tombolEdit;
    JButton tombolHapus;
    JButton tombolKamis;
    JButton tombolJumat;
    JButton tombolSabtu;
    JLabel menuKantin;

    public Hari (){
        layoutAksi = new GridLayout(2,3,8,0);
        layoutMenu = new FlowLayout(FlowLayout.CENTER);
        layoutUtama = new GridLayout(1,1);
        panelMenu = new JPanel();
        tombolPanel = new JPanel();
        tombolSimpan = new JButton("Senin");
        tombolEdit = new JButton("Selasa");
        tombolHapus = new JButton("Rabu");
        tombolKamis = new JButton("Kamis");
        tombolJumat = new JButton("Jumat");
        tombolSabtu = new JButton("Sabtu");
        menuKantin = new JLabel("PILIH HARI");

        panelMenu.add(menuKantin);
        panelMenu.add(menuKantin);
        tombolPanel.add(tombolSimpan);
        tombolPanel.add(tombolEdit);
        tombolPanel.add(tombolHapus);
        tombolPanel.add(tombolKamis);
        tombolPanel.add(tombolJumat);
        tombolPanel.add(tombolSabtu);

        setLayout(layoutUtama);
        panelMenu.setLayout(layoutMenu);
        tombolPanel.setLayout(layoutAksi);
        add(panelMenu);
        add(tombolPanel);
        setSize(520,520);
    }
    public static void main(String[] args) {
        Hari a = new Hari();
        a.setVisible(true);
        
    }
}
