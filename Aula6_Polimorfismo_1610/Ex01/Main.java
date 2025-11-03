package POO.Aula6_Polimorfismo_1610.Ex01;

public class Main{
    public static void main(String [] args){
        Operavel op1 = new Saque(100, 3);
        op1.executarOperacao();
        ((Operacao)op1).resumo(); //DownCasting
        Operavel op2 = new Deposito(150);
        op2.executarOperacao();
        Operavel op3 = new Transferencia(250, "Enzo Banin");
        op3.executarOperacao();
    }
}