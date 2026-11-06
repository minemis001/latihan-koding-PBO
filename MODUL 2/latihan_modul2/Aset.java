package latihan_modul2;

public abstract class Aset{
    protected String idAset;
    protected String pemilik;
    protected double jumlah;
    protected double hargaPasar;
    private static int idCounter = 1;

    public Aset(String pemilik, double jumlah, double hargaPasar){
        this.idAset = "AST- " + idCounter++;
        this.pemilik = pemilik;
        this.jumlah = jumlah;
        this.hargaPasar = hargaPasar;
    }

    public String getIdAset(){
        return idAset;
    }

    public void tampilkanInfo(){
        System.out.println("Id Aset         : " + idAset);
        System.out.println("Pemilik         : " + pemilik);
        System.out.println("Harga Pasar     : " + hargaPasar);
    };

    public abstract double hitungNilaiTotal();
}