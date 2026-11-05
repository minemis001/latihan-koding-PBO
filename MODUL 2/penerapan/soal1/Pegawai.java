package penerapan.soal1;

public abstract class Pegawai{
    private String nama;
    private Double gajiPokok;

    Pegawai(String nama, Double gajiPokok){
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public abstract hitungGaji();
}