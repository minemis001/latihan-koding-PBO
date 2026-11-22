package Latihan_Pre_Asist.Latihan_Pre_Asist;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class HalamanSatu extends JPanel implements ActionListener {
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

        layoutHalaman = new GridLayout(3, 1, 12, 0);
        layoutTombol = new FlowLayout(FlowLayout.CENTER, 16, 10);

        labelStatus = new JLabel("Status: OFFLINE", SwingConstants.CENTER);
        labelStatus.setFont(Theme.FONT_UTAMA);
        labelStatus.setForeground(Theme.TERANG_TEKS);

        checkAktif = new JCheckBox("Aktifkan Mode Online");
        checkAktif.setHorizontalAlignment(SwingConstants.CENTER);
        checkAktif.setFont(Theme.FONT_UTAMA);
        checkAktif.setBackground(Theme.TERANG_LATAR);
        checkAktif.setForeground(Theme.TERANG_TEKS);

        panelTombol = new JPanel();
        panelTombol.setLayout(layoutTombol);
        panelTombol.setBackground(Theme.TERANG_LATAR);

        tombolUbah = new JButton("Ubah Status");
        tombolUbah.setFont(Theme.FONT_UTAMA);
        tombolUbah.setBackground(Theme.TERANG_TOMBOL_BG);
        tombolUbah.setForeground(Theme.TERANG_TOMBOL_TEKS);
        tombolUbah.addActionListener(this);

        tombolPindah = new JButton("Ke Info >>");
        tombolPindah.setFont(Theme.FONT_UTAMA);
        tombolPindah.setBackground(Theme.TERANG_TOMBOL_BG);
        tombolPindah.setForeground(Theme.TERANG_TOMBOL_TEKS);
        tombolPindah.addActionListener(this);

        panelTombol.add(tombolUbah);
        panelTombol.add(tombolPindah);

        setLayout(layoutHalaman);
        setBackground(Theme.TERANG_LATAR);

        add(labelStatus);
        add(checkAktif);
        add(panelTombol);
    }

    public void ubahStatus() {
        if (checkAktif.isSelected()) {
            labelStatus.setText("Status: ONLINE");
        } else {
            labelStatus.setText("Status: OFFLINE");
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