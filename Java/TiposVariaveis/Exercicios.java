package TiposVariaveis;

import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        Scanner pegarNota = new Scanner(System.in);
        //Declarar 4 variaveis com 4 tipos diferentes

        String nome = "Maria";
        int idade = 25;
        float altura = 1.68f;
        boolean estudante = true;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Eh estudante: " + estudante);


        //fazer um casting de double para int, como double eh um valor que suporta um maior valor que int, iremos usar o casting explicito para tornar ele possivel


        double valorDouble = 19.5;
        int valorFinal = (int) valorDouble;

        System.out.println("Valor do Double: " + valorDouble);
        System.out.println("Valor do Int: " + valorFinal);

        //Calcular a media de 3 notas usando variaveis float ou double, usar scanner para obter info do usuario
        float nota1;
        float nota2;
        float nota3;

        System.out.println("Digite a primeira nota: ");
        nota1 = pegarNota.nextFloat();

        System.out.println("Digite a segunda nota: ");
        nota2 = pegarNota.nextFloat();

        System.out.println("Digite a terceira nota: ");
        nota3 = pegarNota.nextFloat();

        float mediaTotal = (nota1 + nota2 + nota3) / 3;

        System.out.println("A media final do aluno eh: " + mediaTotal);
        pegarNota.close();


        //converter celsius (int) para fahrenheit (float)
        int celsius = 20;

        float conversaoFahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("A temperatura em Celsius: " + celsius + "°C");
        System.out.println("A temperatura em Fahrenheit: " + conversaoFahrenheit + "°F");

        //realizar cadastro de livro

        String titulo = "O Pequeno Príncipe";
        String autor = "Antoine de Saint-Exupéry";
        int paginas = 96;
        double preco = 39.90;
        char categoria = 'F';

        String categoriaDescricao = "";

        if(categoria == 'F'){
            categoriaDescricao = "Ficcao";
        }else if(categoria == 'N'){
            categoriaDescricao = "Nao-Ficcao";
        }else if(categoria == 'T'){
            categoriaDescricao = "Tecnologia";
        }else if(categoria == 'H'){
            categoriaDescricao = "Historia";
        }else{
            System.out.println("Escolha um genero disponivel!");
        }
        
        System.out.printf("Livro cadastrado: %s, de %s. Ele possui %d paginas, custa R$%.2f e pertence a categoria: %s \n", titulo, autor, paginas, preco, categoriaDescricao);

        //classificao por categoria

        double precoCategoria = 150.0;
        String categoriaAviao = "";

        if(precoCategoria > 200){
            categoriaAviao = "Premium";
        }else if(precoCategoria > 50.01 && precoCategoria <= 200.00){
            categoriaAviao = "Intermediario";
        }else{
            categoriaAviao = "Economico";
        }

        System.out.println("Categoria do produto: " + categoriaAviao);
        



    }
    
}
