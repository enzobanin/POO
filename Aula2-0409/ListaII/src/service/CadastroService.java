package service;
public class CadastroService{
    private Pessoa pessoa;

    // public Pessoa CadastroService(
    //     private Pessoa pessoa;
    // ){
    //     this.pessoa = pessoa;
    // }

    public Pessoa cadastrarPessoa(String nome,
    int idade){
        return new Pessoa(nome,idade);
        // this.pessoa.nome = nome;
        // this.pessoa.idade = idade;
    }
    public String mostrarPessoa(Pessoa pessoa){
        return pessoa.exibirDados();
    }
}