package DP.Comportamentale.ChainOfResponsability.Banca;

public class VerificareSalariu extends AHandler{
    @Override
    public boolean verificareConditiiCreditare(Client client) {
        if(client.getSalariu()>=5000){
            if(this.nextHandler!=null){
                return this.nextHandler.verificareConditiiCreditare(client);
            } else{
                return true;//eu sunt decidentul final
            }
        } else{
            return false;
        }
    }
}
