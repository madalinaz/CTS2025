package S10.decorator.clase;

public class DecoratorPrimavara extends ADecorator{
    public DecoratorPrimavara(IBon bon) {
        super(bon);
        if (bon.getClient().getGen().equals("F"))
        {
            bon.setTotal(bon.getTotal()/2);
        }
    }

    @Override
    public double getTotal() {
//        if (super.getClient().getGen().equals("F"))
//        {
//            return super.getTotal()/2;
//        }
        return super.getTotal();
    }

    @Override
    public void printare() {
        super.printare();

        if (super.getClient().getGen().equals("F"))
        {
            System.out.println("La multi ani!");
        }
    }

    @Override
    public Client getClient() {
        return super.getClient();
    }
}
