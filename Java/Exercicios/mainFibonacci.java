package Exercicios;

import java.util.Scanner;

public class mainFibonacci {
    private static Fibonacci Fib;
    private static Scanner scan;

    public static void main(String[] args) {
        double num = 0;
        scan = new Scanner(System.in);
        Fib = new Fibonacci();
        do{
            System.out.println("Entre com um numero nao negativo ou \"-1\" para sair");
            num = scan.nextDouble();
            if(num == -1)
                System.exit(0);
                System.out.println("0" + num + "-esimo termo de fibonacci eh" + Fib.calculcarFibonacci(num));
        }while(num >= 0);
    }
}
