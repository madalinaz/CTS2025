package DP.Comportamentale.Strategy;

public class OfertaMeniu {
	private String denumireMeniu;
	private int nrCalorii;
	private int nrCarbohidrati;
	
	public OfertaMeniu(String denumireMeniu, int nrCalorii, int nrCarbohidrati) {
		this.denumireMeniu = denumireMeniu;
		this.nrCalorii = nrCalorii;
		this.nrCarbohidrati = nrCarbohidrati;
	}

	public String getDenumireMeniu() {
		return denumireMeniu;
	}

	public int getNrCalorii() {
		return nrCalorii;
	}

	public int getNrCarbohidrati() {
		return nrCarbohidrati;
	}

	@Override
	public String toString() {
		return "OfertaMeniu [denumireMeniu=" + denumireMeniu + ", nrCalorii="
				+ nrCalorii + ", nrCarbohidrati=" + nrCarbohidrati + "]";
	}
}
