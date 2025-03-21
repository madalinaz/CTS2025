package dp.C4.Singleton.Serializare.V2;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Program {
    public static void main(String[] args) {
        SingletonSerializare s1 = SingletonSerializare.getInstance();
        s1.setState("stare 1");

        try {
            FileOutputStream fos = new FileOutputStream("singleton.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            FileInputStream fis = new FileInputStream("singleton.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            //serializare
            oos.writeObject(s1);

            //deserializare
            SingletonSerializare s2 = (SingletonSerializare) ois.readObject();

            //verificare stare obj
            if(s1.getState().equals(s2.getState()))
                System.out.println("Aceeasi informatie in stare");

            //verificare instante unice
            if(s1==s2)
                System.out.println("Instante identice dupa serializare");
            else
                System.out.println("Instantele nu sunt identice");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
