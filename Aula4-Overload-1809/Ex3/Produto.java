public class Produto{
    private String nome;
    private int preco;
    private int quantidade;

    Produto(){
        this.nome = "Teclado";
        this.preco = 150;
        this.quantidade = 2;
    }
    Produto(String nome, int preco){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 5;
    }
    Produto(String nome, int preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String mostraProduto(){
        return String.format("Nome: %s\nPreço: %d\nQuantidade: %d\n", nome, preco, quantidade);
    }

    public static void main(String[] args){
        Produto p1 = new Produto();
        Produto p2 = new Produto("Mouse", 59);
        Produto p3 = new Produto("Monitor", 1100,3);

        System.out.println(p1.mostraProduto());
        System.out.println(p2.mostraProduto());
        System.out.println(p3.mostraProduto());
    }
}