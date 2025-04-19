import java.util.Scanner;

public class operacoes {
    private int num1, num2, soma, subtracao, divisao, multiplicacao = 0;
    private Scanner leituradeDados = new Scanner(System.in);

    public void pedirNumero(){
        leituradeDados = new Scanner(System.in);
        System.out.println("Digite o numero que voce deseja realizar a operacao matematica: ");
        this.num1 = leituradeDados.nextInt();
        System.out.println("Digite o proximo numero que voce deseja realizar a operacao matematica: ");
        this.num2 = leituradeDados.nextInt();
    }

    public int somarNumeros(){
        System.out.println("Vamo realizar operacao de soma! \n");
        this.soma = this.num1 + this.num2;
        return this.soma;
    }

    public int subtrairNumero(){
        System.out.println("Vamo realizar operacao de subtracao! \n");
        if(this.num2 > this.num1){
            this.subtracao = this.num2 - this.num1;
        }else{
            this.subtracao = this.num1 - this.num2;
        }
        return this.subtracao;
    }

    public int dividirNumero(){
        try{
            System.out.println("Vamo realizar a operacao de divisao! \n");
            this.divisao = this.num1 / this.num2;
        }catch(ArithmeticException erro){
            System.out.println("Nao eh possivel dividir por zero!");
            System.out.println("Detalhes do erro: " + erro.getMessage());
            this.divisao = 0;
        }
        return this.divisao;
    }

    public int multiplicarNumero(){
        System.out.println("Vamo realizar a operacao de multiplicacao! \n");
        this.multiplicacao = this.num1 * this.num2;
        return this.multiplicacao;
    }

    public void fecharScanner(){
        if(this.leituradeDados != null){
            this.leituradeDados.close();
        }
    }

}
