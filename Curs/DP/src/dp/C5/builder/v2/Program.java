package dp.C5.builder.v2;

import dp.C5.builder.v2.clase.Petrecere;
import dp.C5.builder.v2.clase.PetrecereBuilder;

public class Program {

	public static void main(String[] args) {
		PetrecereBuilder builder = new PetrecereBuilder();
		Petrecere petrecere = builder.setAreArtificii(true).setNrPersoane(200).build();
		//de aici nu mai se poate modif petrecere
		System.out.println(petrecere);
	}

}
