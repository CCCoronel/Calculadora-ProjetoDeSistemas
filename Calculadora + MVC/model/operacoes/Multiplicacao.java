package model.operacoes;

public class Multiplicacao implements IOperacao {

    @Override
    public double calcular(double x, double y) {
        return x * y;
    }

}
