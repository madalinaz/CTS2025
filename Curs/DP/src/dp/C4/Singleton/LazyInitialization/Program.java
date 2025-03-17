package dp.C4.Singleton.LazyInitialization;

public class Program {

    public static void main(String[] args) {
        SingletonLazy s1;
        SingletonLazy s2;
        s1 = SingletonLazy.getInstance();
        s2 = SingletonLazy.getInstance();

        if(s1==s2)
            System.out.println("Instante identice versiune lazy");
        else
            System.out.println("Instantele nu sunt identice");
    }
}
