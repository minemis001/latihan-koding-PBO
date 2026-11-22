package preasis2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HalamanDua extends JPanel implements ActionListener {
    private Main mainFrame;
    private GridLayout layoutHalaman;
    private JLabel labelJudul;
    private JButton tombolKembali;

    public HalamanDua(Main mainFrame) {
        this.mainFrame = mainFrame;

        layoutHalaman = new GridLayout(2, 1, 10, 10);
        setLayout(layoutHalaman);
        setBorder(BorderFactory.createEmptyBorder(40, 60, 40, 60));
        setBackground(Theme.TERANG_LATAR);

        labelJudul = new JLabel("Ini Halaman Dua", SwingConstants.CENTER);
        labelJudul.setFont(Theme.FONT_UTAMA.deriveFont(Font.BOLD, 22f));
        labelJudul.setForeground(Theme.TERANG_TEKS);

        tombolKembali = new JButton("Kembali");
        tombolKembali.setFont(Theme.FONT_UTAMA);
        tombolKembali.setBackground(Theme.TERANG_TOMBOL_BG);
        tombolKembali.setForeground(Theme.TERANG_TOMBOL_TEKS);
        tombolKembali.setOpaque(true);
        tombolKembali.setBorderPainted(false);
        tombolKembali.setFocusPainted(false);
        tombolKembali.addActionListener(this);

        add(labelJudul);
        add(tombolKembali);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tombolKembali) {
            mainFrame.bukaHalaman1();
        }
    }
}