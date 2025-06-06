package TiposVariaveis;

public class Principal {
    public static void main(String[] args) {
      //temos dois tipos de variaveis, os primitivos e os referenciados

      //os tipos primitivos sao aqueles que tem seu valor diretamente na memoria, os tipos sao: int, long, short, byte, char, float ,double e o boolean
      //os tipos de referencia sao aqueles que referenciam a um objeto de uma classe 

      //tipos primitivos `z
      int numeroInteiro = 20;
      long numeroInteiroLongo = 200545040;
      short numeeroInteirCurto = 20495;
      double numeroFlutuante = 205.40;
      float numeroFlutuante2 = 15.40F; //para que o float seja reconhecido pelo JVM, voce precisa escrever um F ao lado do numero, se nao o JVM achara que vc quer um double
      byte numeroEmByte = 127;
      char caracterUnicode = 'U';
      boolean ehverdade = true;
      

      //os tipos de referencia eles refereciam sempre um objeto de classe (por isso escrevemos String com S maisculo, pois String eh uma classe ja existente em Java)

      String umaFrase = "Podemos escrever uma frase ";
      //tambem podemos referenciar uma String dessa forma aqui:
      String novaString = new String("Podemos criar uma String como se estivessemos instanciando uma classe");

      System.out.println(novaString);
       

      //uma variavel de referencia tambem pode ser um objeto de uma classe criada pelo proprio programador, vamos testar um exemplo
      
      ClasseTeste variavelDeReferencia = new ClasseTeste("Nicolas", 15, 1.70F);

      //como a classe nao tem mmetodos para exibir os valores de seus atributos, deixaremos apenas assim para mostrar a base

      

    }

    






    
    
}
