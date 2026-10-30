import java.util.ArrayList;

public class Perusahaan{
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
             hasil.append(digit.charAt(i));
        } 
        return (bulat < 0 ? "-Rp " : "Rp ") + hasil;
    }
    
    private void cetak(String label, String isi){
        System.out.printf("%-15s: %s%n",label,isi);
    }

    public void hitungSemuaBiaya(){
        double totalSemua = 0;
        System.out.println("=======================================");
        System.out.println("LAPORAN REIMBURSEMENT PERJALANAN DINAS");
        System.out.println("=======================================");
        for (int i = 0; i < daftarKaryawan.size(); i++){
            Karyawan k = daftarKaryawan.get(i);
            double total = k.hitungTotalBiaya(k.isLuarKota());
            totalSemua += total;
            cetak("Nama Karyawan", k.getNama());
            cetak("ID", k.getIdKaryawan());
            cetak("Jabatan", k.getJabatan());
            cetak("Lama Dinas", k.getLamaDinas()+"hari");
            cetak("Tujuan", k.isLuarKota()?"Luar Kota" : "Dalam Kota");
            cetak("Uang Saku", formatRupiah(k.hitungUangSaku()));
            if (k.isLuarKota()){
                cetak("Penginapan", formatRupiah(k.hitungPenginapan()));
            }else{
                cetak("Penginapan", "Rp 0 (tidak menginap)");
            }
            cetak(k.getLabelTransport(), formatRupiah(k.hitungBiayaTransport()));
            cetak("Total Reimbursement", formatRupiah(total));
            if (i<daftarKaryawan.size()-1){
                System.out.println("---------------------------------------");
            }
        }
        System.out.println("=======================================");
        cetak("TOTAL SELURUHNYA", formatRupiah(totalSemua));
    }
}
