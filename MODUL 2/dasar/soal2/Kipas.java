package dasar.soal2;

public class Kipas implements BisaDinyalakan{
    private boolean status;
    Kipas(boolean status){
        this.status = status;
    }

    @Override 
    public void nyalakan(){
        if (status == false){
            System.out.println("Kipas menyala");
        }else{
            System.out.println("Kipas mati");
        }
    }

    @Override 
    public void matikan(){
        if (status == false){
            System.out.println("Kipas mati");
        }else{
            System.out.println("Kipas menyala");
        }
    }
}
