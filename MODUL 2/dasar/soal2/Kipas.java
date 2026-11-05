package dasar.soal2;

public class Kipas implements BisaDinyalakan{
    private boolean status;
    Kipas(boolean status){
        this.status = status;
    }

    @Override 
    public void nyalakan(){
        status = true;
        System.out.println("Kipas menyala");
    }

    @Override 
    public void matikan(){
        status = false;
        System.out.println("Kipas mati");
    }
}
