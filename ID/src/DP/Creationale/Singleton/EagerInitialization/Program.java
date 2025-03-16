package DP.Creationale.Singleton.EagerInitialization;

public class Program {

	public static void main(String[] args) {
		SingletonEager s1;
		SingletonEager s2;
		s1=SingletonEager.getInstance();
		s2=SingletonEager.getInstance();
		if(s1==s2)
			System.out.println("Instante identice");
		else
			System.out.println("Instantele nu sunt identice");

	}

}
