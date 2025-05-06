package S09.Proxy.clase;

public class Autentificare implements IAutentificare{

    @Override
    public boolean autentificare(String username, String password) {
        if(username.equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}
