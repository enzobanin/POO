package Aula6_Polimorfismo_1610.Ex01;

public abstract class Operacao {
    private double valor;

    Operacao(double valor){
        this.valor = valor;
    }
    public void resumo(){
        System.out.println("O valor da operação é: " + valor );
    }
}
