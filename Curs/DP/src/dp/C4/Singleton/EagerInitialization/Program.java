package dp.C4.Singleton.EagerInitialization;

public class Program {

	public static void main(String[] args) {
		SingletonEager s1;
		SingletonEager s2;
		s1=SingletonEager.getInstance();
		s2=SingletonEager.getInstance();
		if(s1==s2)
			System.out.println("Instante identice eager");
		else
			System.out.println("Instantele nu sunt identice");

		//reflection
		//Constructor<SingletonEager> constructor = SingletonEager.class.getDeclaredConstructors();
		//de discutat
	}


}
