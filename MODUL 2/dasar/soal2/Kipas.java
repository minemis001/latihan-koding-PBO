package dasar.soal2;

public class Kipas implements BisaDinyalakan{
    private bool status;
    Kipas(bool status){
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
