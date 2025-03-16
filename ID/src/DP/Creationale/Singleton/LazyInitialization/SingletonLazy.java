package DP.Creationale.Singleton.LazyInitialization;

public class SingletonLazy {
	private static SingletonLazy instance;
	//mese
	
	private SingletonLazy() {
		
	}
	
	public static SingletonLazy getInstance() {
		if(instance == null)
			instance = new SingletonLazy();
		return instance;
	}
	
	//meth de prelucrare mese
}
