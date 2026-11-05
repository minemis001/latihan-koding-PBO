package soal1;

public class Persegi extends Bangun{
    private double sisi;
    
    Persegi(double sisi){
        this.sisi = sisi;
    }

    @Override 
    public double hitungLuas () {
        return sisi * sisi;
    }

}
