package S06.prototype.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractJucator implements  Cloneable{

    protected String nume;
    protected List<String> listaMedicamente;
    protected TipSport tipSport;
    public abstract List<String> getListaAntrenamente();
    public abstract void addMedicament(String medicament);
    public abstract void addAntrenament(String antrenament);
    public abstract void joaca();

    public AbstractJucator(TipSport tipSport) {
        this.tipSport = tipSport;
        this.listaMedicamente = new ArrayList<>();
    }

    @Override
    protected AbstractJucator clone() throws CloneNotSupportedException {
        return (AbstractJucator) super.clone();
    }
}
