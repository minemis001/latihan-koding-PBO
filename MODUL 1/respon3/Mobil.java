public class Mobil extends Kendaraan{
    private int jumlahPintu;
    private String jenisTransmisi;

    public Mobil (String idKendaraan, String merk, int tahun, int jumlahPintu){
        super(idKendaraan, merk, tahun);
    }

    public int getJumlahPintu(){
        return jumlahPintu;
    }

    public String getJenisTransmisi(){
        return jenisTransmisi;
    }

    public void tampilkaInfo(){
        
    }
}
