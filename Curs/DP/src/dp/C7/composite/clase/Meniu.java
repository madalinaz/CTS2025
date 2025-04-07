package dp.C7.composite.clase;


public class Meniu{

	Structura structura;
	String numeRestaurant;
	
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
