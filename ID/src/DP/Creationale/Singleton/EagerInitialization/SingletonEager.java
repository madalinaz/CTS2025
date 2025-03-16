package DP.Creationale.Singleton.EagerInitialization;

public class SingletonEager {
	private static final SingletonEager instance 
	= new SingletonEager();
	//info despre mese
	
	private SingletonEager() {
		
	}
	
	public static SingletonEager getInstance() {
		//instance = new SingletonEager();
		return instance;
	}
	//meth care gestioneaza info centralizat
}
