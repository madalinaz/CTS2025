package S10_Adapter.clase;

public class CalculReducereEmag implements ICalculReducere {
    @Override
    public double getReducere(Client client) {
        System.out.println("Evaluare discount de catre Emag");
        if (client.getTotalAchizitie() > 1000) {
            return 0.2;
        }
        return 0.1;
    }
}
