package dp.C11.observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements ISubiect{
	private String numeRestaurant;
	private List<IObserver> listaObservatori;
	
	public Restaurant(String numeRestaurant) {
		super();
		this.numeRestaurant = numeRestaurant;
		this.listaObservatori = new ArrayList<>();
	}

	@Override
	public void addObserver(IObserver observer) {
		this.listaObservatori.add(observer);
		
	}

	@Override
	public void removeObserver(IObserver observer) {
		this.listaObservatori.remove(observer);
	}

	@Override
	public void notifyAll(String mesaj) {
		for(IObserver observer: listaObservatori)
			observer.getMesaj(mesaj);
	}
	
	public void addMeniu(String meniu) {
		//to do
		//se adauga meniul in lista de meniuri a restaurantului
		this.notifyAll("A fost adaugat un nou meniu. Va rugam verificati noul meniu");
	}
	
	public void reducerePretMeniu(String meniu, float reducere) {
		//to do
		//se faca modificari in meniu
		this.notifyAll("A fost redus un meniu. Va rugam verificati noile preturi din meniu");
	}

}
