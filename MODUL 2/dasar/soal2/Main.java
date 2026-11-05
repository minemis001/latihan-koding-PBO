package dasar.soal2;

public class Main {
    public static void main(String[] args){
        BisaDinyalakan a = new Lampu(true);
        BisaDinyalakan b = new Kipas(true);

        a.nyalakan();
        b.nyalakan();
    }
}
