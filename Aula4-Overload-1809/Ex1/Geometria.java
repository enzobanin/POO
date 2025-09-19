public class Geometria{
    public double area(double lado){
        return lado * lado;
    }
    public double area(double base, double altura){
        return base * altura;
    }
    public double area(double raio, boolean circulo){
        double pi = 3.14;
        if(circulo){
            return raio * pi;
        } 
        else{
            return -1;
        }
    }

    public static void main(String[]args){
        Geometria g = new Geometria();
        System.out.println(g.area(3.8));
        System.out.println(g.area(3.5,6.8));
        System.out.println(g.area(3, false));
    }
}