package Aula6_Polimorfismo_1610.Lista;

public class Taxi extends VeiculoTransporte implements Abastecivel{
    
    
    public Taxi(int capacidade, String identificador){
        super(capacidade, identificador);
    }


    @Override
    public void mover(){
        System.out.println("levando passageiro ao destino");
    }
    
    @Override
    public void abastecer(){
        System.out.println("abastecendo com gasolina");
    }
}
