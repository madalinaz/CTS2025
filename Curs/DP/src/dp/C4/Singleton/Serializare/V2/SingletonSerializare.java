package dp.C4.Singleton.Serializare.V2;

import java.io.Serializable;

public class SingletonSerializare implements Serializable {
    private static SingletonSerializare instance;
    private String state = "stare 0";

    private SingletonSerializare() {

    }
    private static class SingletonHelper {
        private static final SingletonSerializare instance
                = new SingletonSerializare();
    }

    public static SingletonSerializare getInstance() {
        return SingletonHelper.instance;
    }

    protected Object readResolve() {
        return getInstance();
    }


    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state=state;
    }
}
