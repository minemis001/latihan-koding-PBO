public class Staf extends Karyawan {
    public Staf(String nama, String idKaryawan, int lamaDinas, double biayaTransport, boolean luarKota){
        super(nama, idKaryawan, "Staf", lamaDinas, biayaTransport, luarKota);
    }

    @Override 
    public double hitungUangSaku(){
        return getLamaDinas() * 200000;
    }

    @Override 
    public double hitungPenginapan(){
        if(isLuarKota() && getLamaDinas() > 1){
            return (getLamaDinas() - 1) * 400000;
        }
        return 0;
    }
}
