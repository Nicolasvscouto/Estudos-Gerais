package heranca;

import java.util.UUID;



//classe generalizada (superclasse) que vai ter os principais atributos e metodos que serao usados pelos alunos
public class Pessoa {
    //atributos (alias, eles devem ser privados para que apenas a classe possa modifica-los)
    protected String nome, nacionalidade, naturalidade;
    private String identificador;

    
    //construtor 
    public Pessoa(String nome, String nacionalidade, String naturalidade){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
        identificador = UUID.randomUUID().toString();
    }

    //metodos (deixar eles no protected para que todas as subclasses (mesmo de pacotes diferentes) e todas classes do pacote heranca possam usar os metodos

    protected void setNome(String nome){
        this.nome = nome;
    }

    protected String getNome(){
        return this.nome;
    }

    protected String getNacionalidade(){
        return this.nacionalidade;
    }

    protected String getNaturalidaade(){
        return this.naturalidade;
    }


    //polimorfismo com ToString e equals para especializa-lo e mostrar informacoes adicionais quando chamado
    @Override
    public String toString() {
        return "Objeto: " + "\n\t- Classe:" + getClass().getName()
        + "\n\t- Hash:" + Integer.toHexString((hashCode())) +
        "\n\t-  Nome:" + nome + "\n\t- Identificador: " + identificador;

    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        return obj !=null && nome != null && 
        nome.equalsIgnoreCase(((Pessoa)obj).nome) && identificador == (((Pessoa)obj).identificador);

    }




}
