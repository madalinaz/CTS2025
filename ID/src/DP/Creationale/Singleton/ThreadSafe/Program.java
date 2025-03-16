package DP.Creationale.Singleton.ThreadSafe;

public class Program {

	public static void main(String[] args) {
	SingletonThreadSafe s1;
	SingletonThreadSafe s2;
	s1=SingletonThreadSafe.getInstance();
	s2=SingletonThreadSafe.getInstance();
	
	if(s1==s2)
		System.out.println("Instante identice");
	else
		System.out.println("Instantele nu sunt identice");
}
	
}
