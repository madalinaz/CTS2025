package S10.flyweight.program;


import S10.flyweight.clase.FlyweightFactory;
import S10.flyweight.clase.TipImagine;

public class Main {
    public static void main(String[] args) {
        //optimizare pe spatiu
        FlyweightFactory.getImage(TipImagine.CERC).desenare(10, 10);
    }
}
