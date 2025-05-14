package S11.clase.strategy;


import S11.clase.chainOfResponsability.AHandler;
import java.util.List;

public interface IStrategy {
    List<AHandler> generareFiltre();
}
