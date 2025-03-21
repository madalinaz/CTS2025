package dp.C5.builder.v3;

import dp.C5.builder.v3.clase.Petrecere;

public class Program {

	public static void main(String[] args) {
		Petrecere petrecere = Petrecere.builder().setAreArtificii(true).
				setAreBaloane(true).setNrPersoane(20).build();
		System.out.println(petrecere);
		
		Petrecere petrecere2=new Petrecere.PetrecereBuilder().setAreArtificii(true).build();

	}

}
