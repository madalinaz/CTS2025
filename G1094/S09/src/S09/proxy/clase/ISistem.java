package S09.proxy.clase;

public interface ISistem {
    boolean autentificare(String username,String password);
    boolean resetareParola(String user,String resetCode);
}
