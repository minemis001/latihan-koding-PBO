package respon;

public class Kendaraan{
    private String merk;
    private int tahun;

    public Kendaraan(String merk, int tahun){
        this.merk = merk;
        this.tahun = tahun;
    }

    public String getMerk(){
        return merk;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public int getTahun(){
        return tahun;
    }

    public void tahun (int tahun){
        this.tahun = tahun;
    }
}