public class Motor extends Kendaraan{
    private String tipeMotor;
    private int kapasitasMesin;

    public Motor(String idKendaraan, String merk, int tahun, String tipeMotor, int kapasitasMesin){
        super(idKendaraan, merk, tahun);
    }

    public String getTipeMotor(){
        return tipeMotor;

    }

    public int getKapasitasMesin(){
        return kapasitasMesin;
    } 

    public void tampilkanInfo(){
        
    }
}
