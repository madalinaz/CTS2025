package dp.C10.strategy.program;


import dp.C10.strategy.clase.MeniuRestaurant;
import dp.C10.strategy.clase.OfertaMeniu;
import dp.C10.strategy.clase.StrategieCaloriiMinim;
import dp.C10.strategy.clase.StrategieCarbohidratiMinim;

public class Program {

	public static void main(String[] args) {
		MeniuRestaurant meniuRestaurant = new MeniuRestaurant();
		
		//adaugare meniuri in meniu restaurant
		OfertaMeniu meniu1 = new OfertaMeniu("Meniu1", 750, 70);
		OfertaMeniu meniu2 = new OfertaMeniu("Meniu2", 500, 80);
		OfertaMeniu meniu3 = new OfertaMeniu("Meniu3", 650, 20);
		OfertaMeniu meniu4 = new OfertaMeniu("Meniu4", 800, 90);
		
		meniuRestaurant.addOfertaMeniu(meniu1);
		meniuRestaurant.addOfertaMeniu(meniu2);
		meniuRestaurant.addOfertaMeniu(meniu3);
		meniuRestaurant.addOfertaMeniu(meniu4);
		
		//alegere meniu nr calorii minim
		meniuRestaurant.setStrategieAlegere(new StrategieCaloriiMinim());
		System.out.println("Meniu cu minim calorii " + meniuRestaurant.alegereOferta());
	
		//alegere meniu nr carbohidrati minim
		meniuRestaurant.setStrategieAlegere(new StrategieCarbohidratiMinim());
		System.out.println("Meniu cu minim carbohidrati " + meniuRestaurant.alegereOferta());

	}

}
