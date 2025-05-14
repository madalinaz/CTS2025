package DP.Comportamentale.ChainOfResponsability.Banca;

public class VerificareNrPersoaneIntretinere extends AHandler{
    @Override
    public boolean verificareConditiiCreditare(Client client) {
        if(client.getNrPersoaneIntretinere()<=4) {
            if (this.nextHandler != null) {
                return this.nextHandler.verificareConditiiCreditare(client);
            } else {
                //daca eu sunt ultimul decident
                return true;
            }
        } else {
            return false;
        }
    }
}
