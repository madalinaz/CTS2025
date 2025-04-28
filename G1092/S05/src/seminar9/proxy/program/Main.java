package seminar9.proxy.program;

import seminar9.proxy.clase.Pestera;
import seminar9.proxy.clase.ProxyPestera;

public class Main {
    public static void main(String[] args) {
        Pestera pestera = new Pestera();
        pestera.adaugaPersoana("l");
        pestera.adaugaPersoana("a");
        pestera.adaugaPersoana("m");
        pestera.adaugaPersoana("b");

        System.out.println(pestera.getNrVizitatori());

        //proxy
        ProxyPestera proxyPestera = new ProxyPestera(pestera);
        proxyPestera.adaugaPersoana("m");
        proxyPestera.adaugaPersoana("e");
        proxyPestera.adaugaPersoana("s");
        proxyPestera.adaugaPersoana("s");
        proxyPestera.adaugaPersoana("i");
        proxyPestera.adaugaPersoana("i");
        System.out.println(proxyPestera.getNrVizitatori());
    }
}
