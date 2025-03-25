package TesteHeranca;
import java.util.Calendar;

public class Aluno extends Pessoa{

    private String matricula;

    public Aluno(String nome, Calendar data_nascimento, long CPF, Endereco endereco){
        super(nome, CPF, data_nascimento, endereco);
    }


}
