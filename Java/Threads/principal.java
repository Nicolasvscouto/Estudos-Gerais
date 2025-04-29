package Threads;



public class principal {  
    public static void main(String[] args) {

        Threadsubclasse novaT = new Threadsubclasse(200);

        //utilizando o metodo start, inicializamos a thread que extende a classe Thread, podemos ate ver que no Terminal aparece Runnable
        novaT.start();
        System.out.println("Status da Thread: " + novaT.getState());


        //agora vamos inicializar a thread que implementa interface

        ThreadInterface novaT2= new ThreadInterface(200);
        new Thread(novaT2).start();

        System.out.println("Status da Thread: " + novaT2);
    }


    
}


//teste inicial utilizando heranca para inicilizar uma thread
class Threadsubclasse extends Thread{
    long numero;
    public Threadsubclasse(long numero){
        this.numero = numero;
    }
    @Override
    public void run() {
        super.run();
    }
}


//agora vamos testar a inicializacao de threads implementando a interface runnable
class ThreadInterface implements Runnable{
    long numero;
    public ThreadInterface(long numero){
        this.numero = numero;
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    }
}