package model.operacoes;

public class Soma implements IOperacao {

    @Override
    public double calcular(double x, double y) {
        return x + y;
    }
    
}
