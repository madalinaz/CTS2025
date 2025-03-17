package dp.C4.Singleton.ThreadSafe;


public class SingletonThreadSafe {
    private static volatile SingletonThreadSafe instance;

    private SingletonThreadSafe() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static synchronized SingletonThreadSafe getInstance(){
        if(instance==null){
            instance=new SingletonThreadSafe();
        }
        return instance;
    }
}
