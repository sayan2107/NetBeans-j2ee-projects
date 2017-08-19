package basic.programs;

interface phone{
    void call();
    void media();
    void camera();
}

abstract class samsung implements phone{
    @Override
    public void call(){
        System.out.println("calling");
    }
}

class iphone extends samsung implements phone{
    @Override
    public void media(){
        System.out.println("media");
    }
    
    @Override
    public void camera(){
        System.out.println("camera on");
    }
}

public class BasicPrograms {
    public static void main(String[] args) {
        phone p=new iphone();
        p.call();
        p.camera();
        p.media();
     
    }
    
}
