package dp.C4.Singleton.EagerInitialization;

public class SingletonEager {
	private static final SingletonEager instance = new SingletonEager();
	//to add
	//SingletonData
	private int ct;
	
	private SingletonEager() {
		
	}
	
	public static SingletonEager getInstance() {
		//instance = new SingletonEager();
		return instance;
	}

	//SingletonMethods+Operations on SingletonData
}
