package Exercicios;

import java.util.Random;

public class Pessoa {
    //aprender a usar metodo construtor para instanciacao de objetos
    private String nome;
    private int idade;
    private Random aleatorio;
    private double codigo_identificador;


    public Pessoa(String nome){
        aleatorio = new Random();
        this.setNome(nome);
        this.codigo_identificador = aleatorio.nextDouble();
    }

    private void setNome(String nome){
        this.nome = nome;
    }


    public String getNome(){
        return this.nome;
    }

    public double getCodigo_identificador(){
        return this.codigo_identificador;
    }


    public static void main(String[] args) {
        Pessoa a1 = new Pessoa("Teste A1");
        Pessoa a2 = new Pessoa("Teste A2");

        System.out.println("Pessoa 1: "+ a1.getNome() + "\nCodigo Identificador: " + a1.getCodigo_identificador());
        System.out.println("Pessoa 2: "+ a2.getNome() + "\nCodigo Identificador: " + a2.getCodigo_identificador());




    }
}
