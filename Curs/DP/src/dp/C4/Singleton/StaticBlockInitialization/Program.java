package dp.C4.Singleton.StaticBlockInitialization;

public class Program {

	public static void main(String[] args) {
		SingletonStaticBlock s1;
		SingletonStaticBlock s2;
		s1=SingletonStaticBlock.getInstance();
		s2=SingletonStaticBlock.getInstance();
		if(s1==s2)
			System.out.println("Instante identice versiune static block");
		else
			System.out.println("Instantele nu sunt identice");
	}


}
