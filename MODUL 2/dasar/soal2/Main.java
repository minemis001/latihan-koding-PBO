package dasar.soal2;

public class Main {
    public static void main(String[] args){
        BisaDinyalakan a = new Lampu(true);
        BisaDinyalakan b = new Kipas(true);

        System.out.println("Hasil = "+ a.nyalakan());
        System.out.println("Hasil = "+ b.nyalakan());
    }
}
