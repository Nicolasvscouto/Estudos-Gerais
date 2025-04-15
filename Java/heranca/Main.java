package heranca;


public class Main {

    //criacao de objetos da classe Pessoa e Aluno (SubClasse de Pessoa)
    private static Pessoa P1;
    private static Aluno P2, P3;


    public static void main(String[] args) {
       
        //instanciacao dos objetos
       P1 = new Pessoa("Nicolas", "Brasileiro", "Brasil"); 
       P2 = new Aluno("Nicolas", "Brasileiro", "Brasil");
       P3 = new Aluno("Nicolas", "Brasileiro", "Brasil");


       //utilizacao de uma estrutura de decisao e, para uso didatico e aprender o polimorfismo, usamos o metodo que foi especializado na classe Pessoa
       if(P1.equals(P2)){ 
        System.out.println("P1 eh igual P2");
       }else if(P2.equals(P3)){
        System.out.println("P2 eh igual P3");
       }else{
        System.out.println("Nada aconteceu!");
       }

   
    }
}
