package Exercicios;

public class Fibonacci {
    private static int conta_chamada = 0;


    public double calculcarFibonacci(double num){
        conta_chamada++;
        System.out.println("Chamada Recursiva Numero:" + conta_chamada);
        if(num != 2 && num != 1){
            return calculcarFibonacci(num - 1) + calculcarFibonacci(num - 2);
        }else{
            return 1;
        }
    }

    
}
