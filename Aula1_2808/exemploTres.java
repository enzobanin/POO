public class exemploTres{
    public static void main(String[] args){
        // String s1 = "algoritmos";
        // String s2 = s1.substring(2,4);
        // System.out.println(s2);
        String s1 = "algoritmos";
        char[]cs = s1.toCharArray();
        for(int i = 0; i<cs.length;i++){
            System.out.print(" "+ cs[i]);
        }
        String s2 = new String(cs);
        System.out.println(" " + s2);
    }
}