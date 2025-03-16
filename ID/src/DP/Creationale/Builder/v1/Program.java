package DP.Creationale.Builder.v1;

public class Program {

	public static void main(String[] args) {
		PetrecereBuilder builder = new PetrecereBuilder();
		Petrecere petrecere = builder.setAreArtificii(true)
				.setNrPersoane(20)
				.setAreTort(true).build();
		
		System.out.println(petrecere);
	}

}
