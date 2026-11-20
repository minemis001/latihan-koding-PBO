import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HalamanSatu extends JPanel implements ActionListener {
    private Main mainFrame;
    private GridLayout layoutHalaman;
    private FlowLayout layoutTombol;
    private JLabel labelStatus;
    private JCheckBox checkAktif;
    private JPanel panelTombol;
    private JButton tombolUbah;
    private JButton tombolPindah;

    public HalamanSatu(Main mainFrame) {
        this.mainFrame = mainFrame;

        layoutHalaman = new GridLayout(3, 1, 10, 10);
        layoutTombol = new FlowLayout(FlowLayout.CENTER, 15, 10);
        setLayout(layoutHalaman);
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        labelStatus = new JLabel("Status: NONAKTIF", SwingConstants.CENTER);
        checkAktif = new JCheckBox("Aktifkan mode gelap", false);
        checkAktif.setHorizontalAlignment(SwingConstants.CENTER);

        panelTombol = new JPanel(layoutTombol);
        tombolUbah = new JButton("Ubah Status");
        tombolPindah = new JButton("Ke Halaman 2");
        tombolUbah.addActionListener(this);
        tombolPindah.addActionListener(this);
        panelTombol.add(tombolUbah);
        panelTombol.add(tombolPindah);

        add(labelStatus);
        add(checkAktif);
        add(panelTombol);

        terapkanTema(false);
    }

    public void ubahStatus() {
        boolean aktif = checkAktif.isSelected();
        labelStatus.setText(aktif ? "Status: AKTIF" : "Status: NONAKTIF");
        terapkanTema(aktif);
    }

    private void terapkanTema(boolean gelap) {
        Color latar = gelap ? Theme.GELAP_LATAR : Theme.TERANG_LATAR;
        Color teks = gelap ? Theme.GELAP_TEKS : Theme.TERANG_TEKS;
        Color tombolBg = gelap ? Theme.GELAP_TOMBOL_BG : Theme.TERANG_TOMBOL_BG;
        Color tombolTeks = gelap ? Theme.GELAP_TOMBOL_TEKS : Theme.TERANG_TOMBOL_TEKS;

        setBackground(latar);
        panelTombol.setBackground(latar);
        labelStatus.setForeground(teks);
        labelStatus.setFont(Theme.FONT_UTAMA);
        checkAktif.setBackground(latar);
        checkAktif.setForeground(teks);
        checkAktif.setFont(Theme.FONT_UTAMA);

        for (JButton b : new JButton[]{tombolUbah, tombolPindah}) {
            b.setBackground(tombolBg);
            b.setForeground(tombolTeks);
            b.setFont(Theme.FONT_UTAMA);
            b.setOpaque(true);
            b.setBorderPainted(false);
            b.setFocusPainted(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tombolUbah) {
            ubahStatus();
        } else if (e.getSource() == tombolPindah) {
            mainFrame.bukaHalaman2();
        }
    }
}