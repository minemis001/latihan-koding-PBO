public class Direktur extends Karyawan {
    private double biayaSewaMobil;

    public Direktur(String nama, String idKaryawan, int lamaDinas, double biayaTransport, double biayaSewaMobil, boolean luarKota){
        super(nama, idKaryawan, "Direktur", lamaDinas, biayaTransport, luarKota);
        this.biayaSewaMobil = biayaSewaMobil;
    }

    public double getBiayaSewaMobil(){
        return biayaSewaMobil;
    }

    public void setBiayaSewaMobil(double biayaSewaMobil){
        this.biayaSewaMobil = biayaSewaMobil;
    }

    @Override
    public double hitungBiayaTransport(){
       return super.hitungBiayaTransport(this.biayaSewaMobil);
    }

    @Override 
    public double hitungUangSaku(){
        return getLamaDinas() * 500000;
    }

    @Override 
    public double hitungPenginapan(){
        if(isLuarKota() && getLamaDinas() > 1){
            return (getLamaDinas() - 1) *1200000;
        }
        return 0;
    }

    @Override 
    public String getLabelTransport (){
        return "Transport + Sewa Mobil";
    }
}
