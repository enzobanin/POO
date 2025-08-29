public class ExUm {
    public static void main(String[] args) {
        int x = 60000;
        if(args.length>0){
            switch(Integer.parseInt(args[0])){
                case 5: 
                    x = x + 1500;
                    
                case 4: 
                    x = x + 5000;
                    
                case 3: 
                    x = x + 2500;
                    
                case 2: 
                    x = x + 4000;
                    
                case 1: 
                    x = x + 7000;
                default:
                    System.out.println("O carro " + args[0] + " é igual a " + x);
                    break;
            }
        }
    }
}
