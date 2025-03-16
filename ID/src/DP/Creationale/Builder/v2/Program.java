package DP.Creationale.Builder.v2;

public class Program {

	public static void main(String[] args) {
		PetrecereBuilder builder = new PetrecereBuilder();
		Petrecere petrecere = builder.setAreArtificii(true).setNrPersoane(200).build();
		//de aici nu mai se poate modif petrecere
		System.out.println(petrecere);

	}

}
