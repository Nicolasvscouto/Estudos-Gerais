package heranca;


import java.util.UUID;


//Aluno eh a subclasse de pessoa ja que ele "Aluno eh um tipo de Pessoa" ou seja, ele estende todos atributos e metodos de pessoa
public class Aluno extends Pessoa{

    private String matricula;
    private String identificador;


    //no construtor, precisamos detalhar quais sao os atributos da superclasse utilizando a funcao super() e, caso haja novos atributos, so adiciona-los abaixo
    public Aluno(String nome, String nacionalidade, String naturalidade){
        super(nome, nacionalidade, naturalidade);
        identificador = UUID.randomUUID().toString();
    }

    public String getMatricula(){
        return this.matricula;
    }

    //especializacao do metodo equals da classe Object para poder comparar diferentes objetos da mesma classe
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        return obj !=null && nome != null && 
        nome.equalsIgnoreCase(((Aluno)obj).nome) && identificador == (((Aluno)obj).identificador);

    }


    
    
}
