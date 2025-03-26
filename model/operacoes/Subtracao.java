package model.operacoes;

public class Subtracao implements IOperacao {
    @Override
    public double calcular(double x, double y) {
        return x - y;
    }
}
