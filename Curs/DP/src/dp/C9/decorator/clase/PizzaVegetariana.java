package dp.C9.decorator.clase;

public class PizzaVegetariana extends APizza{

	@Override
	public String getComponente() {
		return "blat, sos rosii, ciuperci, ceapa";
	}

	@Override
	public int getPret() {
		return 27;
	}

}
