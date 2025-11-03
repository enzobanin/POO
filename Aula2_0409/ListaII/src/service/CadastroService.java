package service;
import model.Pessoa;
public class CadastroService{
    private Pessoa pessoa;

    // public Pessoa CadastroService(
    //     private Pessoa pessoa;
    // ){
    //     this.pessoa = pessoa;
    // }

    public void cadastrarPessoa(String nome,
    int idade){
        new Pessoa(nome,idade);
        // this.pessoa.nome = nome;
        // this.pessoa.idade = idade;
    }
    public void mostrarPessoa(Pessoa pessoa){
        pessoa.exibirDados();
    }
}
