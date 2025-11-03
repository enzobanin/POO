package Aula6_Polimorfismo_1610.Lista;

public class Onibus extends VeiculoTransporte implements Abastecivel{
    
    public Onibus(int capacidade, String identificador){
        super(capacidade, identificador);
    }

    @Override
    public void mover(){
        System.out.println("seguindo rota urbana");
    }

    
    @Override
    public void abastecer(){
        System.out.println("abastecendo com diesel");
    }
}
