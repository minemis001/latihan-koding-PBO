package latihan_modul2;

public class Perak extends Aset implements Investasi{
    private String produsen;

    public Perak(String pemilik, double jumlah, String produsen){
        super(pemilik, jumlah, 28639);
        this.produsen = produsen;
    }

    @Override 
    public double hitungNilaiTotal(){
        double nilaiDasar = jumlah * hargaPasar;
       return nilaiDasar + (nilaiDasar*165/100) + hitungDividen() - hitungPajak() - hitungBiayaPenyimpanan();
    }


    @Override 
    public double hitungDividen(){
        double nilaiDasar = jumlah * hargaPasar;
        return nilaiDasar * 2.5/100;
    }

    @Override
    public double hitungPajak(){
        double nilaiDasar = jumlah * hargaPasar;
        return nilaiDasar * 1.5/100;
    }

    @Override 
    public double hitungBiayaPenyimpanan(){
        double nilaiDasar = jumlah * hargaPasar;
        return nilaiDasar * 0.5/100;
    }

    @Override 
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Produsen        : " + produsen);
        System.out.println("Jumlah          : " + jumlah);
        System.out.println("Dividen         : " + hitungDividen());
        System.out.println("Pajak           : " + hitungPajak());
        System.out.println("Biaya Simpan    : " + hitungBiayaPenyimpanan());
        System.out.println("Total Valuasi Rp: " + hitungNilaiTotal());
    }
}
