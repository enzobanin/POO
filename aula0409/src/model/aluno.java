package model;
public class aluno{
    private String nome;
    private int idade;

    public aluno(){}

    public aluno(String nome,
    int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String showAluno(){
        String mensagem = "Nome: "+ getNome() + ", idade: " + getIdade();
        return mensagem; 
    }
}