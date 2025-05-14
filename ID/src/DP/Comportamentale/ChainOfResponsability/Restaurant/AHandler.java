package DP.Comportamentale.ChainOfResponsability.Restaurant;

public abstract class AHandler {
	private AHandler nextHandler;
	
	public AHandler getNextHandler(){
		return this.nextHandler;
	}

	public void setNextHandler(AHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	abstract void procesareComanda(Comanda comanda);
}
