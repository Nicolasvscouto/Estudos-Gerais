package TesteHeranca;
import java.util.Calendar;
import java.util.UUID;

public class Diretor extends Empregado{

    public Diretor(String nome, Calendar data_nascimento, Long CPF, Endereco endereco){
        super(nome, CPF, data_nascimento, endereco);
    }

    protected void gerarMatricula(){
        matricula = "E- " + UUID.randomUUID().toString();
    }

    protected void alterarMatricula(){
        gerarMatricula();
    }

    protected void alterarMatricula(String matricula){
        this.matricula = matricula;
    }
}
