package dasar.soal2;

public class Lampu implements BisaDinyalakan{
    private boolean status;
    Lampu(boolean status){
        this.status = status;
    }

    @Override 
    public bool nyalakan(){
        return true;
    }

    @Override 
    public bool matikan(){
        return false;
    }

}
