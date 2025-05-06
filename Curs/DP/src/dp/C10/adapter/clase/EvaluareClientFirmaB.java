package dp.C10.adapter.clase;

public class EvaluareClientFirmaB implements IEvaluareClientFirmaB{
    @Override
    public void analizaClientFirmaB(Client client) {
        System.out.println("Tehnica evaluare firma B");
        System.out.println("S-a oferit discout de 10%");
    }
}
