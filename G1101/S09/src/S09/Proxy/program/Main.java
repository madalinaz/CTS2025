package S09.Proxy.program;


import S09.Proxy.clase.Autentificare;
import S09.Proxy.clase.AutentificareProxy;
import S09.Proxy.clase.IAutentificare;

public class Main {
    //daca utilizatorul greseste parola de mai mult de 3 ori, acesta intra in timpul de asteptare,
    //inainte de proxy utilizatorul putea sa greseasca parola de un numar nelimitat
    public static void functie(IAutentificare sistem, String username, String password) {
        boolean rezultat = sistem.autentificare(username, password);
        if(rezultat) {
            System.out.println("S-a permis accesul pentru " + username + "!");
        } else {
            System.out.println("Nu s-a permis accesul pentru " + username + "!");
        }
    }

    public static void main(String[] args) {
        IAutentificare sistem = new AutentificareProxy(new Autentificare());
        functie(sistem, "Alex", "parolaAlex");
        functie(sistem, "Alex", "parolaAlex");
        functie(sistem, "Alex", "parolaAlex");
        functie(sistem, "Alex", "parolaAlex");
        functie(sistem, "Alex", "Alex");
    }
}