package TesteHeranca;
import java.time.Month;
import java.util.Calendar;

public class Pessoa {
    private String nome;
    private int idade;
    private long CPF;
    private Calendar data_nascimeto;
    private Endereco endereco;

    //Construtor

    public Pessoa(String nome, long CPF, Calendar data_nascimeto, Endereco endereco){
        this.nome = nome;
        this.CPF = CPF;
        this.data_nascimeto = data_nascimeto;
        this.endereco = endereco;
        atualizarIdade();

    }

    protected void SetNome(String Nome){
        this.nome = nome;
    }

    protected String getNome(){
        return this.nome;
    }

    protected void setIdade(){
        this.idade = atualizarIdade();
    }

    protected int getIdade(){
        return this.idade;
    }

    protected void setCPF(long CPF){
        this.CPF = CPF;
    }

    protected long getCPF(){
        return this.CPF;
    }

    protected void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    protected Endereco getEndereco(){
        return this.endereco;
    }

    private int atualizarIdade(){
        int lapso;
        Calendar Hoje = Calendar.getInstance();
        lapso = Hoje.get(Calendar.YEAR) - data_nascimeto.get(Calendar.YEAR);
        if((data_nascimeto.get(Calendar.MONTH)) > Hoje.get(Calendar.MONTH) ||
            data_nascimeto.get(Calendar.MONTH) == Hoje.get(Calendar.MONTH) &&
            data_nascimeto.get(Calendar.DATE) > Hoje.get(Calendar.DATE))
             lapso--;

        return lapso;
    }
}
