package dasar.soal2;

public class Lampu implements BisaDinyalakan{
    private boolean status;
    Lampu(boolean status){
        this.status = status;
    }

    @Override 
    public void nyalakan(){
        if (status == true){
            System.out.println("Lampu menyala");
        }else {
            System.out.println("Lampu mati");
        }
    }

    @Override 
    public void matikan(){
        if (status == false){
            System.out.println("Lampu mati");
        }else{
            System.out.println("Lampu menyala");
        }
    }

}
