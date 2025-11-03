import java.util.Scanner;

public class scanner {
    public static void main( String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite alguma coisa: ");
        while(scanner.hasNext()){
            String value = scanner.next();
            if(value.equals("exit")){
                break;
            }
            System.out.println(value);
        }
        scanner.close();
    }
}
