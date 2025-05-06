package S09.proxy.program;


import S09.proxy.clase.ISistem;
import S09.proxy.clase.ProxySistem;
import S09.proxy.clase.Sistem;

public class Main {
    public static void functie(ISistem sistem, String username, String password) {
        if (sistem.autentificare(username,password)){
            System.out.println(username+" s-a autentificat");
        }else{
            System.out.println("autentificare esuata");
        }
    }

    public static void main(String[] args) {
//        ISistem sistem = new Sistem();
        ISistem sistem=new ProxySistem(new Sistem());
        functie(sistem,"gigel","marcel");
        functie(sistem,"gigel","marcel");
        functie(sistem,"gigel","marcel");
        functie(sistem,"gigel","marcel");
        functie(sistem,"gigel","marcel");
        functie(sistem,"gigel","marcel");
        functie(sistem,"gigel","gigel");
        sistem.resetareParola("gigel","1234");
        functie(sistem,"gigel","gigel");

    }
}