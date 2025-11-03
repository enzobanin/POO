public class exemploUm{
    public static void main(String[] args){
        if(args.length > 0){
          char letra = args[0].charAt(0);
          if(letra >='A' && letra<='Z' ){
            System.out.println("maiúscula " + Character.toLowerCase(letra));
          } 
          else{
            System.out.println("minuscula " + Character.toUpperCase(letra));
          }
        }
    }
}