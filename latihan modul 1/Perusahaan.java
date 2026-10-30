import java.util.ArrayList;

public class Perusahaan extends Karyawan{
    private String namaPerusahaan;
    private ArrayList<Karyawan> daftarKaryawan;

    public Perusahaan(String namaPerusahaan){
        this.namaPerusahaan = namaPerusahaan;
        this.daftarKaryawan = new ArrayList<>();
    }

    public String getNamaPerusahaan(){
        return namaPerusahaan;
    }

    public void tambahKaryawan(Karyawan karyawan){
        daftarKaryawan.add(karyawan);
    }

    private String formatRupiah(double nilai){
        long bulat = Math.round(nilai);
        String digit = String.valueOf(Math.abs(bulat));
        StringBuilder hasil = new StringBuilder();
        for (int i = 0; i < (digit.length()); i++){
            if (i > 0 && (digit.length() - i) % 3 == 0){
                hasil.append('.');
            }
        } 
        hasil.append(digit.charAt(i));
    }
    return (bulat < 0 ? "-Rp " : "Rp ") + hasil;
}
