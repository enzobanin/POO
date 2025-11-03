package POO.Aula6_Polimorfismo_1610.Ex01;

public class Transferencia extends Operacao implements Operavel{
    public String contaDestino;

    Transferencia(double valor, String contaDestino){
        super(valor);
        this.contaDestino = contaDestino;
    }

    @Override
    public void executarOperacao() {
        System.out.println("Executando a transferência para " + contaDestino);
    }
}
