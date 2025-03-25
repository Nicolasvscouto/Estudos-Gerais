package TesteHeranca;
import java.util.Calendar;

public class Empregado extends Pessoa{
    protected String matricula;
    private Calendar data_admissao, data_demissao;

    public Empregado(String nome, Long CPF, Calendar data_nascimento, Endereco endereco){
        super(nome, CPF, data_nascimento, endereco);
        this.matricula = matricula;
        data_admissao = Calendar.getInstance();
    }

    public void demitirEmpregado(){
        data_admissao = Calendar.getInstance();
    }

    protected void gerarMatricula(){
        this.matricula = "Matricula nao definida";
    }

    protected void alterarMatricula(){
        gerarMatricula();
    }

    protected String recuperarMatricula(){
        return this.matricula;
    }
}
