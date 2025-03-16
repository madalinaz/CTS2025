package DP.Creationale.Singleton.InnerStaticHelper;

public class Program {

	public static void main(String[] args) {
		SingletonInnerStaticHelper s1;
		SingletonInnerStaticHelper s2;
		
		s1=SingletonInnerStaticHelper.getInstance();
		s2=SingletonInnerStaticHelper.getInstance();

		if(s1==s2)
			System.out.println("Instante identice");
		else
			System.out.println("Instantele nu sunt identice");
	}

}
