package dp.C12.command.clase;

public class Bucatar {
	private String numeBucatar;

	public Bucatar(String numeBucatar) {
		super();
		this.numeBucatar = numeBucatar;
	}
	
	public void preparaPizza(String pizza, String tipBlat) {
		System.out.println("Bucatarul " + this.numeBucatar + 
				" a pregatit pizza: " +pizza + " cu blat: " + tipBlat);
	}
	
	public void preparaPaste(String paste) {
		System.out.println("Bucatarul " + this.numeBucatar + 
				" a pregatit paste: " +paste);
	}
}
