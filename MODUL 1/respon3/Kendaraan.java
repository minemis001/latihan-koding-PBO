package respon3;

public class Kendaraan{
    private String idKendaraan;
    private String merk;
    private int tahun;

    public Kendaraan(String idKendaraan, String merk, int tahun){
        this.idKendaraan = idKendaraan;
        this.merk = merk;
        this.tahun = tahun;
    }

    public String getIdKendaraan(){
        return idKendaraan;
    }

    public String getMerk(){
        return merk;
    }

    public int getTahun(){
        return tahun;
    }

    public void tampilkanInfo(){
        
    }
}