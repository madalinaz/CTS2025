package S10.flyweight.program;

import S10.flyweight.clase.FlyweightFactory;

public class Main {
    public static void main(String[] args) {
        //flyweight
        //getFlyweight e getFormaGeometrica
        FlyweightFactory.getFlyweight("patrat").desenare(20, 30);
        FlyweightFactory.getFlyweight("cerc").desenare(10, 10);
        FlyweightFactory.getFlyweight("romb").desenare(22, 15);
    }
}
