package TesteHeranca;
import java.util.Calendar;

public class Principal {
    private static Aluno aluno;
    private static Endereco endereco;
    private static Empregado empregado, diretor;

    public static void main(String[] args) {
        //teste de heranca
        Calendar data = Calendar.getInstance();
        data.set(1992, 10, 23);
        endereco = new Endereco();
        endereco.setPais("Brasil");
        endereco.setCidade("Porto Alegre");
        endereco.setUF("RS");
        endereco.setCEP(2028504);
        endereco.setRua("Rua dona Alzira");
        endereco.setComplemento("Casa");

        aluno = new Aluno("Nicolas", data, 2944038, endereco);
        aluno.setIdade();

        //teste de polimorfismo
        Calendar data2 = Calendar.getInstance();
        data2.set(1980, 12, 20);
        empregado = new Empregado("Roberto Carlos", 2028954350L, data2, null);
        empregado.gerarMatricula();
        diretor = new Diretor("Marco Antonio", data2, 29028343440L, null);
        diretor.gerarMatricula();

        System.out.println("Matricula do Diretor: " + diretor.recuperarMatricula());
        System.out.println("Matricula do Empregado: " + empregado.recuperarMatricula());



    }
}
