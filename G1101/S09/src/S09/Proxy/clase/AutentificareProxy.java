package S09.Proxy.clase;

import java.util.HashMap;
import java.util.Map;

public class AutentificareProxy implements IAutentificare{
    private Autentificare sistem;
    private static Map<String, Integer> mapUtilizatori = new HashMap<>();

    public AutentificareProxy(Autentificare sistem) {
        this.sistem = sistem;
    }

    @Override
    public boolean autentificare(String username, String password) {
        if(!mapUtilizatori.containsKey(username)) {
            mapUtilizatori.put(username, 0);
        }
        if(mapUtilizatori.get(username) >= 3) {
            System.out.println("Utilizatorul este in timeout!");
        } else {
            boolean rezultat =  sistem.autentificare(username, password);

            if(!rezultat) {
               mapUtilizatori.put(username, mapUtilizatori.get(username)+1);
            }
            return rezultat;
        }
        return false;
    }
}
