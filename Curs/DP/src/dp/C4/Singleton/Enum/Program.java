package dp.C4.Singleton.Enum;

public class Program {

    public static void main(String[] args) {
        SingletonEnum s1;
        SingletonEnum s2;

        s1=SingletonEnum.INSTANCE;
        s2=SingletonEnum.INSTANCE;

        if(s1==s2)
            System.out.println("Instante identice Enum");
        else
            System.out.println("Instantele nu sunt identice");

    }
}
