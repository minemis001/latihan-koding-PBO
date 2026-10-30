public class Karyawan {
    private String nama;
    private String idKaryawan;
    private String jabatan;
    private int lamaDinas;
    private double biayaTransport;
    private boolean luarKota;

    public Karyawan(String nama, String idKaryawan, String jabatan, int lamaDinas, double biayaTransport, boolean luarKota){
        this.nama = nama;
        this.idKaryawan = idKaryawan;
        this.jabatan = jabatan;
        this.lamaDinas = lamaDinas;
        this.biayaTransport = biayaTransport;
        this.luarKota = luarKota;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getIdKaryawan(){
        return idKaryawan;
    }

    public void setIdKaryawan(String idKaryawan){
        this.idKaryawan = idKaryawan;
    }

    public String getJabatan(){
        return jabatan;
    }

    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }

    public int getLamaDinas(){
        return lamaDinas;
    }

    public void setLamaDinas(int lamaDinas){
        this.lamaDinas = lamaDinas;
    }

    public double getBiayaTransport(){
        return biayaTransport;
    }

    public void setBiayaTransport(double biayaTransport){
        this.biayaTransport = biayaTransport;
    }

    public boolean isLuarKota(){
        return luarKota;
    }

    public void setLuarKota(boolean luarKota){  
        this.luarKota = luarKota;
    }

    public double hitungUangSaku(){
        return 0;
    }
    
    public double hitungBiayaTransport(){
        return biayaTransport;
    }

    public double hitungBiayaTransport(double biayaSewaMobil){
        return biayaSewaMobil + biayaTransport;
    }

    public double hitungPenginapan (){
        return 0;
    }

    public String getLabelTransport (){
        return "Biaya Transport";
    }

    public double hitungTotalBiaya (boolean luarKota){
        hitungUangSaku() + hitungBiayaTransport() + (luarKota ? hitungPenginapan() : 0);
    }
}