package preasis;
import javax.swing.*;
import java.awt.*;

public class Hari extends JFrame{
    GridLayout layoutAksi;
    GridLayout layoutUtama;
    FlowLayout layoutMenu;
    JPanel panelMenu;
    JPanel tombolPanel;
    JButton tombolSenin;
    JButton tombolSelasa;
    JButton tombolRabu;
    JButton tombolKamis;
    JButton tombolJumat;
    JButton tombolSabtu;
    JLabel labelJudul;

    public Hari(){
        layoutAksi = new GridLayout(2,3,8,8);
        layoutMenu = new FlowLayout(FlowLayout.CENTER);
        layoutUtama = new GridLayout(2,1);
        panelMenu = new JPanel();
        tombolPanel = new JPanel();
        tombolSenin = new JButton("Senin");
        tombolSelasa = new JButton("Selasa");
        tombolRabu = new JButton("Rabu");
        tombolKamis = new JButton("Kamis");
        tombolJumat = new JButton("Jumat");
        tombolSabtu = new JButton("Sabtu");
        labelJudul = new JLabel("PILIH HARI");

        setLayout(layoutUtama);
        panelMenu.add(labelJudul);
        tombolPanel.add(tombolSenin);
        tombolPanel.add(tombolSelasa);
        tombolPanel.add(tombolRabu);
        tombolPanel.add(tombolKamis);
        tombolPanel.add(tombolJumat);
        tombolPanel.add(tombolSabtu);

        panelMenu.setLayout(layoutMenu);
        tombolPanel.setLayout(layoutAksi);
        add(panelMenu);
        add(tombolPanel);
        setSize(520,520);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new Hari().setVisible(true);
    }
}
