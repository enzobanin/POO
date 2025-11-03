package POO.Aula6_Polimorfismo_1610.Ex01;

public class Deposito extends Operacao implements Operavel{
    
    Deposito(double valor){
        super(0);
    }
    @Override
    public void executarOperacao() {
        System.out.println("Executando o depósito");
    }
}
