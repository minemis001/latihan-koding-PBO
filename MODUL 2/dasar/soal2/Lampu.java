package dasar.soal2;

public class Lampu implements BisaDinyalakan{
    private boolean status;
    Lampu(boolean status){
        this.status = status;
    }

    @Override 
    public void nyalakan(){
        status = true;
        System.out.println("Lampu menyala");
    }

    @Override 
    public void matikan(){
        status = true;
        System.out.println("Lampu mati");
    }

}
