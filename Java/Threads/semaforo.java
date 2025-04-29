package Threads;

import java.util.concurrent.Semaphore;

public class semaforo{

    static Semaphore semaforo = new Semaphore(1);
    

    public static void main(String[] args) {
        Thread t1 = new Thread(new Tarefa(), "Thread 1");
        Thread t2 = new Thread(new Tarefa(), "Thread 2");

        t1.start();
        t2.start();
    }

   static class Tarefa implements Runnable{
        @Override
        public void run(){
            try{
            System.out.println(Thread.currentThread().getName() + "tentando acessar o recurso...");
            semaforo.acquire();

            System.out.println(Thread.currentThread().getName() + "Acessou o recurso...");

            Thread.sleep(2000);
            
            System.out.println(Thread.currentThread().getName() + "Liberou o acesso...");
            semaforo.release();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}


