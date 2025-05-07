package S10.decorator.clase;

public class DecoratorFebruarie extends ADecorator{

    public DecoratorFebruarie(IBon bon) {
        super(bon);
    }

    @Override
    public void printare() {
        float suma=super.getSuma();
        int nrInimioare= (int) (suma/100);
        for(int i=0;i<nrInimioare;i++){
            System.out.println("\n inimioara ");
        }
        super.printare();
    }

    @Override
    public float getSuma() {
        return super.getSuma();
    }

}
