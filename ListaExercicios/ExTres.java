import java.util.Scanner;

public class ExTres{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro lado: ");
        int a = scanner.nextInt();

        System.out.println("Digite o segundo lado: ");
        int b = scanner.nextInt();

        System.out.println("Digite o terceiro lado: ");
        int c = scanner.nextInt();

        if(a + b > c && a + c > b && b + c > a){
            if(a == b && a == c && b == c){
                System.out.println("Esse triângulo é equilátero");
            }
            else if(a == b || a == c || b == c){
                System.out.println("Esse triângulo é isósceles");
            }
            else{
                System.out.println("Esse triângulo é escaleno");
            }
        }
        else{
            System.out.println("Isso não é um triângulo");
        }
        scanner.close();
    }
}