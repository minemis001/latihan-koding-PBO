package dasar.soal1;

public class Lingkaran extends Bangun{
    private double jarijari; 
    Lingkaran(double jarijari){
        this.jarijari = jarijari;
    }

    @Override 
    public double hitungLuas(){
        return Math.PI * jarijari * jarijari;
    }
}
