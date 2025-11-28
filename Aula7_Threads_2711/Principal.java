public class Principal{
    public static void main(String[] args) throws InterruptedException {
        Recurso recurso = new Recurso(10);

        MinhaThread t1 = new MinhaThread("T1", recurso, 2);
        MinhaThread t2 = new MinhaThread("T2", recurso,3);
        MinhaThread t3 = new MinhaThread("T3", recurso, 1);
        MinhaThread t4 = new MinhaThread("T4", recurso, 5);

        System.out.println("T1: " + t1.getState());
        System.out.println("T2: " + t2.getState());
        System.out.println("T3: " + t3.getState());
        System.out.println("T4: " + t4.getState());
        
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        
        System.out.println("Finalizado");
        // System.out.println("T1: " + t1.getState());
        // System.out.println("T2: " + t2.getState());
        // System.out.println("T3: " + t3.getState());
        // System.out.println("T4: " + t4.getState());

        System.out.println("Valor final: " + recurso.getValor());
    }
}
