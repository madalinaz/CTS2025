package dp.C4.Singleton.LazyInitialization;

public class SingletonLazy {
    private static SingletonLazy instance;

    private SingletonLazy(){

    }

    public static SingletonLazy getInstance(){
        if(instance==null){
            instance = new SingletonLazy();
        }
        return instance;
    }

    //singleton Methods+Operations
}
