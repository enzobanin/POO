import java.time.LocalTime;

public class MinhaThread extends Thread{
    private Recurso recurso;
    private int valor;

    public MinhaThread(String name, Recurso recurso, int valor){
        this.recurso = recurso;
        this.valor = valor;
        setName(name);
        start();
    }

    
    @Override
    public void run(){
        // for (int i=1;i<=10;i++) {
        //     System.out.println("Minha Thread " + Thread.currentThread().getName() + " - " + i
        //     + " " + LocalTime.now());
        //     try {
        //         sleep(1000);
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        // }
        try {
            recurso.alterarRecurso(valor);
            System.out.println(Thread.currentThread().getName() + " - " + recurso.getValor());
        } catch (InterruptedException e) {
            e.printStackTrace();    
        }

    }
}