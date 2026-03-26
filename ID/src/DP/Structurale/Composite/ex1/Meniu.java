package DP.Structurale.Composite.ex1;


public class Meniu{
	//Nu este necesar in diagrama GoF

	private Structura structura; //nodul radacina
	private String numeRestaurant;
	
	public Meniu(Structura structura, String numeRestaurant){
		this.structura = structura;
		this.numeRestaurant = numeRestaurant;
	}

	public String getNumeRestaurant() {
		return numeRestaurant;
	}

	public void setNumeRestaurant(String numeRestaurant) {
		this.numeRestaurant = numeRestaurant;
	}

}
