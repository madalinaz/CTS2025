package DP.Creationale.Singleton.StaticBlockInitialization;

public class Program {

	public static void main(String[] args) {
		System.out.println("Declarare obj");
		SingletonStaticBlock s1;
		SingletonStaticBlock s2;
		System.out.println("Instantiere obj");
		s1=SingletonStaticBlock.getInstance();
		s2=SingletonStaticBlock.getInstance();
		if(s1==s2)
			System.out.println("Instante identice");
		else
			System.out.println("Instantele nu sunt identice");

	}

}
