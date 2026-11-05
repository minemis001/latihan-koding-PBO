package dasar.soal1;

public class Main {
    public static void main(String[] args){
        Bangun b1 = new Persegi(4);
        Bangun b2 = new Lingkaran(7);

        System.out.println("Hasil hitung persegi: " + b1.hitungLuas());
        System.out.println("Hasil hitung lingkaran: " + b2.hitungLuas());
    }
}
