package preasis1;
import javax.swing.*;
import java.awt.*;

public class Test extends JFrame{
    GridLayout layoutAksi;
    GridLayout layoutUtama;
    JPanel tombolPanel;
    JButton tombolSimpan;
    JButton tombolEdit;
    JButton tombolHapus;

    public Test (){
        layoutAksi = new GridLayout(1,3,8,0);
        layoutUtama = new GridLayout(3,1);
        tombolPanel = new JPanel();
        tombolSimpan = new JButton("Simpan");
        tombolEdit = new JButton("Edit");
        tombolHapus = new JButton("Hapus");

        tombolPanel.add(tombolSimpan);
        tombolPanel.add(tombolEdit);
        tombolPanel.add(tombolHapus);

        tombolPanel.setLayout(layoutAksi);
        add(tombolPanel);
        setLayout(layoutUtama);
        setSize(520,520);

    }
    public static void main(String[] args) {
        Test a = new Test();
        a.setVisible(true);
        
    }
    
}