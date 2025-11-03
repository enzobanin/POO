package Aula6_Polimorfismo_1610.Lista;

public abstract class VeiculoTransporte{
    int capacidade;
    String identificador;

    public VeiculoTransporte(int capacidade, String identificador){
        this.capacidade = capacidade;
        this.identificador = identificador;
    }

    public abstract void mover();

    public void mostrarInfo(){
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Identificador: " + identificador);
    }
}