package model.operacoes;

public class Divisao implements IOperacao {

    @Override
    public double calcular(double x, double y) {
        return x / y;
    }
    
}
