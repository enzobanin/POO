//import pacoteA.Endereco;
public class Pessoa{
    private String nome;
    private int idade;
    private String cpf;
    private Contato contato;
    private Endereco endereco;

    public Pessoa(String nome, int idade, String cpf, Contato contato,Endereco endereco){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.contato = contato;
        this.endereco = endereco;
    }

    //NOME
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    //IDADE
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    //CPF
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    //CONTATO
    // public String getContato(){
    //     return contato;
    // }
    // public void setContato(String contato){
    //     this.contato = contato;
    // }
    // //ENDERECO
    // public String getEndereco(){
    //     return endereco;
    // }
    // public void setEndereco(String endereco){
    //     this.endereco = endereco;
    // }

    public String apresentar(){
        return String.format("Nome: %s\nIdade: %d\nCPF: %s\nContato: %s\nEndereco: %s",nome,
        idade,cpf,contato.mostrarContato(),endereco.mostrarEndereco());
    }
}