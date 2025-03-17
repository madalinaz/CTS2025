package dp.C4.Singleton.StaticBlockInitialization;


public class SingletonStaticBlock {
	private static SingletonStaticBlock instance;
	
	private SingletonStaticBlock() {
		
	}
	
	static {
			instance=new SingletonStaticBlock();
	}
	
	public static SingletonStaticBlock getInstance() {
		return instance;
	}
}
