package dp.C7.proxy.clase;

public class PetrecereProxy implements IPetrecere {
	private Petrecere petrecere;

	public PetrecereProxy(Petrecere petrecere) {
		super();
		this.petrecere = petrecere;
	}

	@Override
	public void adaugaParticipant(Client cl) {
		if(cl.getVarsta()>=18)
			petrecere.adaugaParticipant(cl);
		else
			System.out.println("Clientul "+cl.getNume() + " nu are varsta minima de 18 ani");

	}

	@Override
	public void afisareProgram() {
		this.petrecere.afisareProgram();
	}
}
