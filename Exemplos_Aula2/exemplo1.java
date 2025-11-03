package Exemplos_Aula2;
import java.util.Scanner;

public class exemplo1{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a altura da sua pirâmide de '1': ");
        int q = scanner.nextInt();

        // for(int i = 0;i<q ; i++){
        //     System.out.println("");
        //     for(int j = 0; j<=i; j++){
        //         System.out.print(" 1 ");
        //     }
        // }
        
        for(int i = 0; i <= q; i++){
            if(q - 1 != 1){
                for(int j = q-1; j >1 ; j--){
                    System.out.print(" ");
                }
                System.out.print("1");
            }
            else{
                System.out.print(" ");
                System.out.print("1");
            }
        }
    }
}