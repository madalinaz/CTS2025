package DP.Structurale.Adapter.RestaurantB;

public class Client {
	private String numeClient;
	private int nrEvenimente;
	private int[] costEvenimente;

	public Client(String numeClient, int nrEvenimente, 
			int[] costEvenimente) {
		this.numeClient = numeClient;
		this.nrEvenimente = nrEvenimente;
		this.costEvenimente = costEvenimente;
	}

	public String getNumeClient() {
		return numeClient;
	}

	public int getNrEvenimente() {
		return nrEvenimente;
	}

	public int[] getCostEvenimente() {
		return costEvenimente;
	}

}
