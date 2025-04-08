package dp.C7.proxy.program;

import dp.C7.proxy.clase.Client;
import dp.C7.proxy.clase.IPetrecere;
import dp.C7.proxy.clase.Petrecere;
import dp.C7.proxy.clase.PetrecereProxy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //inainte de restrictii prin proxy
        List<String> listaInvitati = new ArrayList<>();
        listaInvitati.add("Mos Craciun");
        listaInvitati.add("Renul Rudolf");

        Client cl1 = new Client("Gigel", 20);
        Client cl2 = new Client("Costel", 12);
        Petrecere petrecere = new Petrecere("24.12.2022", listaInvitati);
        petrecere.adaugaParticipant(cl2);

        System.out.println("Afisare dupa proxy");
        Client cl3 = new Client("Marcel", 20);
        Client cl4 = new Client("Ionela", 12);
        IPetrecere petrecereProxy = new PetrecereProxy(petrecere);
        petrecere.adaugaParticipant(cl3);
        //petrecereProxy.adaugaParticipant(cl3);
        petrecereProxy.adaugaParticipant(cl4);
    }
}
