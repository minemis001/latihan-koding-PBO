package 1;

public class Lingkaran extends Bangun{
    private int jarijari; 
    Lingkaran(int jarijari){
        this.jarijari = jarijari;
    }

    @Override 
    public int hitungLuas(int jarijari){
        return (24/7) * jarijari * jarijari;
    }
}
