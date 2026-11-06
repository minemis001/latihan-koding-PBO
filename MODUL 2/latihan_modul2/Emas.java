package latihan_modul2;

public class Emas extends Aset implements Investasi{
    private String produsen;

    public Emas(String pemilik, double jumlah, String produsen){
        super(pemilik, jumlah);
        this.produsen = produsen;
    }

    @Override 
    public double hitungNilaiTotal(){
        double nilaiDasar = jumlah * 2546000;
        return nilaiDasar + (nilaiDasar*10/100) + hitungDividen() - hitungPajak() - hitungBiayaPenyimpanan();
    }

    @Override 
    public double hitungDividen(){
        double nilaiDasar = jumlah * 2546000;
        return nilaiDasar * 1.5/100;
    }

    @Override 
    public double hitungPajak(){
        double nilaiDasar = jumlah * 2546000;
        return nilaiDasar * 0.5/100; 
    }

    @Override 
    public double hitungBiayaPenyimpanan(){
        double nilaiDasar = jumlah * 2546000;
        return nilaiDasar * 0.2/100;
    }

    @Override 
    public void tampilkanInfo(){
        System.out.println("Produsen        : " + produsen);
        System.out.println("Jumlah          : " + jumlah);
        System.out.println("Dividen         : " + hitungDividen());
        System.out.println("Pajak           : " + hitungPajak());
        System.out.println("Biaya Simpan    : " + hitungBiayaPenyimpanan());
        System.out.println("Total Valuasi Rp: " + hitungNilaiTotal());
    }
}
