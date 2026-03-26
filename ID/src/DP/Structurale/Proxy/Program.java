package DP.Structurale.Proxy;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		ArrayList<String> listaInvitati = new ArrayList<>();
		listaInvitati.add("Mos Craciun");
		listaInvitati.add("Renul Rudolf");

		Client cl1 = new Client("Gigel", 20);
		Client cl2 = new Client("Costel", 12);
		Client cl3 = new Client("Marcel", 20);
		Client cl4 = new Client("Ionela", 12);
		
		IPetrecere petrecere = new Petrecere("24.12.2022", listaInvitati);
		petrecere.adaugaParticipant(cl1);
		
		//aici vin restrictii
		IPetrecere petrecereProxy = new PetrecereProxy(petrecere);
		petrecereProxy.adaugaParticipant(cl3);
		petrecereProxy.adaugaParticipant(cl4);

		//TO DO
		//1. Lista de asteptare. La o pestera, se permite accesul doar atunci cand se strang 5 persoane la rand. Apoi, vine un responsabil si ghideaza cele 5 persoane.
		//Astfel, nu trebuie un ghid pentru fiecare 1 persoana care plateste bilet si asteapta sa intre in pestera.

		//2. Intr-un spital, un vizitator era acceptat doar in intervalul orar 18:00-20:00. Odata cu inmultirea cazurilor de boli...., s-a restrictionat accesul in spital a doar 1 vizitator per pacient per zi.
	}

}
