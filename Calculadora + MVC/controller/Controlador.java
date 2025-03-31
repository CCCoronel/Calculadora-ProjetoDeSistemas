package controller;
import model.operacoes.*;;
public final class Controlador{
    public static double calcular(String operacao, double x, double y){
        IOperacao op = null;
        switch(operacao){
            case "soma":
                op = new Soma();
                break;
            case "subtracao":
                op = new Subtracao();
                break;
            case "multiplicacao":
                op = new Multiplicacao();
                break;
            case "divisao":
                op = new Divisao();
                break;
        }
        return op.calcular(x, y);
    }
}
