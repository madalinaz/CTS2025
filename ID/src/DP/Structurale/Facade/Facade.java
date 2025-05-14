package DP.Structurale.Facade;

public class Facade {
    private ColectieBucatari colectieBucatari =new ColectieBucatari();
    private ColectieOspatari colectieOspatari =new ColectieOspatari();

    public void addBucatar(Bucatar bucatar){
        colectieBucatari.addBucatar(bucatar);
    }

    public void addOspatar(Ospatar ospatar){
        colectieOspatari.addOspatar(ospatar);
    }

    public boolean verificaDisponibilitateData(String data, int nrPersoane) {
        //pp ca preiau disponibilitatea buc si ospatari dupa data
        int contorBucatari = colectieBucatari.getNumarBucatariLiberiData(data);
        int contorOspatari = colectieOspatari.getNrOspatariData(data);
        if (contorOspatari >= nrPersoane / 5 && contorBucatari >= nrPersoane / 20) {
            return true;
        }
        return false;
    }
}
