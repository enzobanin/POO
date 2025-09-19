public class Logger{
    public String log(String msg){
        return msg;
    }
    public String log(String msg, int nivel){
        return String.format("Mensagem: %s\nNível: %d\n",msg, nivel);
    }
    public String log(String msg, String nivel){
        return String.format("Mensagem: %s\nNível: %s\n",msg, nivel);
    }
    public String log(String msg, String... args){
        String combo = "";

        for(String i : args){
            combo += i + "\n";
        }
        return String.format("Mensagem: %s\nArgs: %s", msg, combo);
    }
    public static void main(String[] args){
        Logger l1 = new Logger();
        System.out.println(l1.log("Olá"));
        System.out.println(l1.log("Olá mundo",9));
        System.out.println(l1.log("Olá mundo","Nove"));
        System.out.println(l1.log("Olá mundo","Meu nome","é Enzo","Prazer"));
    }
}