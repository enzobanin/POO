import model.Pessoa;
import service.CadastroService;
public class Main{
    public static void main(String[]args){
        CadastroService service = new CadastroService();
        Pessoa p1 = service.cadastrarPessoa("enzo",21);
        System.out.println(service.mostrarPessoa(p1));
        // Pessoa p1 = new Pessoa("enzo", 21);
        // System.out.println(p1.mostrarPessoa());
    }
}