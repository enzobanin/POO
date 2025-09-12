//import PacoteA.Endereco;
import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
        // Contato contato1 = new Contato("marcelinho@gmail.com","4002-8922");
        // //System.out.println(contato1); //mostra na memoria
        // System.out.println(contato1.mostrarContato());
        // contato1.setEmail("mcmarcelinho@gmail.com");
        // System.out.println(contato1.mostrarContato());

        // Endereco endereco1 = new Endereco("Corinthians", "Boituva");
        // System.out.println(endereco1.mostrarEndereco());
        // Endereco endereco2 = new Endereco("Timao","Porto Feliz");
        // //Endereco endereco3 = new Endereco(endereco2.getRua(),endereco2.getCidade()); -- para atribuir
        // //System.out.println(endereco3.mostrarEndereco());

        // Pessoa pessoa1 = new Pessoa("Enzo", 21, "535682972",contato1, endereco1);
        // System.out.println(pessoa1.apresentar());
        Scanner scanner = new Scanner(System.in);
        System.out.println("===SISTEMA DE CADASTRO===");
        System.out.println("1-Cadastrar nova Pessoa");
        System.out.println("2-Sair");
        System.out.print("Opção: ");
        int op = scanner.NextInt();
        while(op.hasNext()){
            switch(op){
                case 1:
                    System.out.print("\nDigite seu nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("\nDigite sua idade: ");
                    int idade = scanner.nextInt();

                    System.out.print("\nDigite seu cpf: ");
                    String cpf = scanner.nextLine();

                    System.out.print("\nDigite seu email: ");
                    String email = scanner.nextLine();

                    System.out.print("\nDigite seu telefone: ");
                    int telefone = scanner.nextInt();

                    System.out.print("\nDigite sua rua: ");
                    String rua = scanner.nextLine();

                    System.out.print("\nDigite o número: ");
                    int numero = scanner.nextInt();

                    System.out.print("\nCasa: ");
                    String casa = scanner.nextLine();

                    System.out.print("\nDigite seu complemento: ");
                    String complemento = scanner.nextLine();

                    System.out.print("\nDigite seu bairro: ");
                    String bairro = scanner.nextLine();

                    System.out.print("\nDigite sua cidade: ");
                    String cidade = scanner.nextLine();

                    System.out.print("\nDigite seu estado: ");
                    String estado = scanner.nextLine();

                    System.out.print("\nDigite seu cep: ");
                    String cep = scanner.nextLine();

                    Endereco endereco1 = new Endereco(rua, numero,casa, complemento,bairro,cidade,estado,cep);

                    Contato contato1 = new Contato(email,telefone);

                    Pessoa p1  = new Pessoa(nome,idade,cpf,contato1,endereco1);
                    
                    break;
                case 2:
                    System.out.println("Sistema encerrado. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        
    }
}