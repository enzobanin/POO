import model.aluno;
public class main{
    public static void main ( String[] args){
        aluno Aluno1 = new aluno("enzo", 21);
        System.out.println(Aluno1.showAluno());
        aluno Aluno2 = new aluno("jorge", 36);
        System.out.println(Aluno2.showAluno());
    }
}