package projetos.controleCartaoCredito;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {

    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoDeCredito(double limite){
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();

    }


    public boolean lancarCompra(Compra compra){
        if(this.saldo > compra.getValor()){
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }


    public double getLimite(){
        return limite;
    }

    public double getSaldo(){
        return saldo;
    }

    public List<Compra> getListaCompras(){
        return compras;
    }

    
}
