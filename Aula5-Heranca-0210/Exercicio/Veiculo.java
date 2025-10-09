package Exercicio;

public class Veiculo {
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private boolean motorLigado = false;

    public Veiculo(String marca,
    String modelo,
    String cor,
    int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }
    public void ligarMotor(){
        motorLigado = true;
        System.out.println("vrum vrum");
    }
    public void desligarMotor(){
        motorLigado = false;
        System.out.println("Motor desligado");
    }
    public void exibirInformacoes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("motorLigado: " + motorLigado);
    }
    public static void main(String[] args){
       Veiculo v1 = new Veiculo("GM", "Vectra", "Prata", 2011);
       v1.ligarMotor();
       v1.exibirInformacoes(); 
       CarroPasseio c1 = new CarroPasseio(v1.marca,v1.modelo,v1.cor,v1.ano, 5);
       c1.buzinar();
       c1.exibirInformacoes();
       Caminhonete c2 = new Caminhonete(v1.marca, v1.modelo, v1.cor, v1.ano, 500, true);
       c2.desligarMotor();
       c2.ligarMotor();
       c2.engatar4x4();
       c2.exibirInformacoes();
    }

}

class CarroPasseio extends Veiculo{
    private int capacidade;
    public CarroPasseio(String marca,
    String modelo,
    String cor,
    int ano, 
    int capacidade){
        super(marca, modelo, cor, ano);
        this.capacidade = capacidade;
    }
    public void buzinar(){
        System.out.println("bibi");
    }
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Capacidade: " + capacidade);
    }
}

class Caminhonete extends Veiculo{
    private double carga;
    private boolean tracao4x4;
    public Caminhonete(String marca,
    String modelo,
    String cor,
    int ano, 
    double carga,
    boolean tracao4x4){
        super(marca, modelo, cor, ano);
        this.carga = carga;
        this.tracao4x4 = tracao4x4;
    }   
    public void engatar4x4(){
        tracao4x4 = true;
        System.out.println("Sistema 4X4 engatado");
    }
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Carga: " + carga);
        System.out.println("4X4: " + tracao4x4);
    }
}
