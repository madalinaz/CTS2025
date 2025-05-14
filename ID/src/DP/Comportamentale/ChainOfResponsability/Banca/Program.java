package DP.Comportamentale.ChainOfResponsability.Banca;

public class Program {
    public static void main(String[] args) {
        AHandler handler1 = new VerificareDatorii();
        AHandler handler2 = new VerificareNrPersoaneIntretinere();
        AHandler handler3 = new VerificareSalariu();

        //creare lant
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        //trimitere cerere in lant
        Client client1 = new Client("Gigel1",true,20000,3);
        Client client2 = new Client("Gigel2",false,200,3);
        Client client3 = new Client("Gigel3",false,20000,6);
        Client client4 = new Client("Gigel4",false,20000,3);
        System.out.println(handler1.verificareConditiiCreditare(client1));
        System.out.println(handler1.verificareConditiiCreditare(client2));
        System.out.println(handler1.verificareConditiiCreditare(client3));
        System.out.println(handler1.verificareConditiiCreditare(client4));
    }
}
