package dp.C5.builder.v1;

import dp.C5.builder.v1.clase.Petrecere;
import dp.C5.builder.v1.clase.PetrecereBuilder;

public class Program {

	public static void main(String[] args) {
		PetrecereBuilder builder = new PetrecereBuilder();
		Petrecere petrecere = builder.setAreArtificii(true)
				.setNrPersoane(20)
				.setAreTort(true).build();
		
		System.out.println(petrecere);
	}

}
