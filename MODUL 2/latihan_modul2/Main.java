package latihan_modul2;

public class Main{
    public static String konversi(double nilai){
        if (nilai < 0){
            return "-" + konversi(-nilai);
        }
    
        String suffix = "";
        double divider = 1;
        if (nilai >= 1000000000000.0){
            divider = 1000000000000.0;
            suffix = "T";
        }else if (nilai >= 1000000000.0){
            divider = 1000000000.0;
            suffix = "M";
        }else if (nilai >= 1000000.0){
            divider = 1000000.0;
            suffix = "jt";
        }else if (nilai >= 1000.0){
            divider = 1000.0;
            suffix = "k";
        }
        double hasil = Math.round((nilai / divider)*100.0)/100.0;
        if (hasil==(long)hasil){
            return (long) hasil + suffix;
        }

        return hasil + suffix;
    }
    
    public static void prosesValuasiPortofolio(Aset[] portofolio) {
      System.out.println("=======================================");
      System.out.println("-----MEMPROSES VALUASI PORTOFOLIO");
      System.out.println("=======================================");

      double totalPortofolio = 0;

      for (Aset aset : portofolio){
        aset.tampilkanInfo();

        double totalValuasi = aset.hitungNilaiTotal();
        System.out.println("Total Valuasi Rp : " + konversi(totalValuasi));
        totalPortofolio = totalPortofolio + totalValuasi;
        System.out.println("-------------------------------");
      }
      System.out.println("TOTAL VALUASI : " + konversi(totalPortofolio));
    }

    public static void main(String[] args){
        System.out.println("Proses Valuasi Portofolio");

        Emas aset1 = new Emas("Budi", 5, "ANTAM");
        Perak aset2 = new Perak("Siti", 100, "BUMI");
        Emas aset3 = new Emas("Budi", 2, "BUMI");
        Perak aset4 = new Perak("Rian", 50, "INDAH");
        Emas aset5 = new Emas("Siti", 10, "ANTAM");
        Perak aset6 = new Perak("Budi", 200, "BUMI");

        Aset[] portofolio = {aset1, aset2, aset3, aset4, aset5, aset6};
        prosesValuasiPortofolio(portofolio);
    }
}