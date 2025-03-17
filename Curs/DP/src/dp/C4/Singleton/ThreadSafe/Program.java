package dp.C4.Singleton.ThreadSafe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Program {
    public static void main(String[] args) {
        int noThreads = 5;
        ExecutorService executor = Executors.newFixedThreadPool(noThreads);

        for(int i=0;i<noThreads;i++){
            executor.execute(()->{
                SingletonThreadSafe instance = SingletonThreadSafe.getInstance();
                System.out.println("Thread: " + Thread.currentThread().getName()+ "+ instance: " + instance);
            });
        }

        executor.shutdown();

    }
}
