public class FiguraGeometrica{
    static double PI = 3.14159;
    public static void saudacao(){
        System.out.println("Boas vindas");
    }
    public double calcularArea(double paramUnico){
        return 0.0;
    }
    public double calcularArea(double base, double altura){
        return 0.0;
    }
    public static void main(String[]args){
        Circulo f1 = new Circulo();
        Retangulo f2 = new Retangulo();
        Triangulo f3 = new Triangulo();
        FiguraGeometrica.saudacao();
        System.out.println(f1.calcularArea(5));
        System.out.println(f2.calcularArea(5,2));
        System.out.println(f3.calcularArea(10,5));
    }   
}

class Circulo extends FiguraGeometrica{
    @Override
    public double calcularArea(double raio){
        return PI * (raio*raio);
    }
}

class Retangulo extends FiguraGeometrica{
    @Override
    public double calcularArea(double largura, double altura){
        return largura * altura;
    }
}

class Triangulo extends FiguraGeometrica{
    @Override
    public double calcularArea(double base, double altura){
        return (base * altura)/2;
    }
}

