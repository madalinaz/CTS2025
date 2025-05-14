package DP.Comportamentale.ChainOfResponsability.Banca;

public class VerificareDatorii extends AHandler{
    @Override
    public boolean verificareConditiiCreditare(Client client) {
        if(!client.isAreDatorii()){
            if(this.nextHandler!=null){
                return this.nextHandler.verificareConditiiCreditare(client);
            } else{
                return true;
            }
        } else{
            //nu a indeplinit conditiile handler-ului curent
            return false;
        }
    }
}
