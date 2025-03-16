package DP.Creationale.Builder.Magazin;

public class Program {

	public static void main(String[] args) {
		BuilderMagazin builder = new BuilderMagazin(150, 2, "Zara");
		Magazin m1 = builder.build();
		System.out.println(m1);
		IDecoratiuni d = new Decoratiune(ETipMaterial.METAL, "Candelabru");
		Magazin m2 = builder.addDecoratiune(d)
				.setPodea(new PodeaLemn(1.5f)).build();
		System.out.println(m2);
	}

}
