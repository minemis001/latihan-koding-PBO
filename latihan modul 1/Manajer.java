public class Manajer extends Karyawan{
    public Manajer(String nama, String idKaryawan, int lamaDinas, double biayaTransport, boolean luarKota){
        super(nama, idKaryawan, "Manajer", lamaDinas, biayaTransport, luarKota);
    }

    @Override 
    public double hitungUangSaku(){
        return getLamaDinas() * 350000;
    }

    @Override 
    public double hitungPenginapan(){
        if(isLuarKota() && getLamaDinas() > 1){
            return (getLamaDinas() - 1) * 800000;
        }
        return 0;
    }
}
