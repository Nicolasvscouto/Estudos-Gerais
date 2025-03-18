package Exercicios;

public class Referencia {
    private Alunos a1, a2;
     public Referencia( ){
         a1 = new Alunos("Nicolas", 16);
         a2 = new Alunos("Sofia", 17);
         System.out.println("Aluno 1: " + a1.recuperarNome() + "\nIdade do Aluno: " + a1.recuperarIdade());
         System.out.println("Aluno 2: " + a2.recuperarNome() + "\nIdade do Aluno: " + a2.recuperarIdade());
         a2 = a1;
         System.out.println("Aluno 2: " + a2.recuperarNome() + "\nIdade do Aluno: " + a2.recuperarIdade());
         manipularDados(a1);
         System.out.println("Aluno 1: " + a1.recuperarNome() + "\nIdade do Aluno: " + a1.recuperarIdade());
     }


    public static void main(String[] args) {
         Referencia r = new Referencia();
         System.out.println("Servico encerrado");

    }

    public void manipularDados(Alunos alunos){
        alunos.definirNome("Marcio");
        alunos.definirIdade(19);
    }

    public class Alunos{
        private String nome;
        private int idade;

        public Alunos(String nome, int idade){
            this.nome = nome;
            this.idade = idade;
        }


        public void definirNome(String nome){
            this.nome = nome;
        }

        public void definirIdade(int idade){
            this.idade = idade;
        }

        public String recuperarNome(){
            return this.nome;
        }

        public int recuperarIdade(){
            return this.idade;
        }
    }
}
