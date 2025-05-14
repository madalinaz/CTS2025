package DP.Structurale.Adapter.RestaurantB;

public class EvaluareClientFirmaB implements IEvaluareClientFirmaB{
    @Override
    public void analizaClientFirmaB(Client client) {
        System.out.println("Metoda analiza client Firma B");
        //aici vine logica de acordare discount in functie de client
        System.out.println("S-a oferit discount de 15% pentru client");
    }
}
