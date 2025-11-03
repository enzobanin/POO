package POO.Aula6_Polimorfismo_1610.Ex01;

public class Saque extends Operacao implements Operavel{
    public double taxa;

    Saque(double valor, double taxa){
        super(valor);
        this.taxa = taxa;
    }
    @Override
    public void executarOperacao() {
        System.out.println("Executando Saque com a taxa: " + taxa);
    }
}
