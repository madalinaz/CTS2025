package dp.C8.memento.clase;

//clasa Originator din diagrama GoF
public class Contract {
	private String clauzeContractuale;
	private String numeClient;
	
	public Contract(String numeClient) {
		this.numeClient = numeClient;
		this.clauzeContractuale = "";
	}
	
	public void adaugaClauzeContractuale(String clauza){
		this.clauzeContractuale += ", " + clauza;
	}
	
	@Override
	public String toString() {
		return "Contract [clauzeContractuale=" + clauzeContractuale
				+ ", numeClient=" + numeClient + "]";
	}

	//reface obj this in functie de un Memento primit ca param
	public void restoreFromMemento(VersiuneContract versiuneContract){
		this.clauzeContractuale = versiuneContract.getClauzeContractuale();
	}

	//salvare stare curenta intr-un Memento
	public VersiuneContract saveToMemento(){
		System.out.println("Salvare versiune contract");
		return new VersiuneContract(clauzeContractuale);
	}
}
