public class exemploDois{
    public static void main(String[]args){
        if(args.length>0){
            int nota = Integer.parseInt(args[0]);
            if(nota >=90){
                System.out.println("A");
            }
            else if(nota >=80){
                System.out.println("B");
            }
            else if(nota >=70){
                System.out.println("C");
            }
            else if(nota >=60){
                System.out.println("D");
            }
            else{
                System.out.println("F");
            }
        }
    }
}