package S09.proxy.clase;

public class Sistem implements ISistem {


    @Override
    public boolean autentificare(String username, String password) {
        if(username.equals(password)){
            return true;
        }
        return false;
    }

    @Override
    public boolean resetareParola(String user, String resetCode) {
        if(resetCode.length()%2==0){
            return true;
        }
        return false;
    }
}
