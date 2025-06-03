package projetos.appBanco;

public class Operacoes {
    int saldo = 5000;
    String tipoConta = "Premium";

     

    protected void getSaldo(){
        System.out.println("Esse é o seu saldo " + saldo);
    }

    protected void Transferir(int saldoTransferencia){
        if(saldoTransferencia > saldo){
          System.out.println("Infelizmente, voce nao possui saldo suficiente para realizar a transação!");
          System.out.println("Seu saldo: " + saldo);
        }else{
            saldo -= saldoTransferencia;
            System.out.println("Transação realizada com sucesso!");
            System.out.println("Seu saldo atualizado: " + saldo);
        }
    }


    protected void adicionarSaldo(int saldoAdicionar){
        saldo += saldoAdicionar;
        System.out.println("Seu saldo atualizado: " + saldo);
    }
    
}
