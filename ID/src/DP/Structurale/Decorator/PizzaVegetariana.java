package DP.Structurale.Decorator;

public class PizzaVegetariana extends APizza{

	@Override
	String getComponente() {
		return "blat, sos rosii, ciuperci, ceapa";
	}

	@Override
	int getPret() {
		return 27;
	}

}
