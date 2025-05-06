package S09.proxy.clase;

import java.util.HashMap;
import java.util.Map;

public class ProxySistem implements ISistem {
    private Sistem sistem;
    private Map<String,Integer> mapaIncercari;

    public ProxySistem(Sistem sistem) {
        this.sistem = sistem;
        mapaIncercari = new HashMap<>();
    }

    @Override
    public boolean autentificare(String username, String password) {
        if(mapaIncercari.getOrDefault(username,0)>=5){
            System.out.println("Reseteaza parola-contul este blocat");
            return false;
        }
        if(!sistem.autentificare(username,password)){
            mapaIncercari.put(username,mapaIncercari.getOrDefault(username,0)+1);
            return false;
        }
        return true;
    }

    @Override
    public boolean resetareParola(String user, String resetCode) {
        if((sistem.resetareParola(user,resetCode))){
            mapaIncercari.put(user,0);
            return true;
        }
        return false;
    }
}
