package excecao;

import java.util.ArrayList;
import java.util.List;

public class excecaoArray {
public static void main(String[] args) throws ErroValidacao{
    OperacaoArray calc = new OperacaoArray ();
    char[] op1 = null;
    char[] op2 = null;
    try {
        op1 = new char [Short.MAX_VALUE];
        op2 = new char [Short.MAX_VALUE];
    } catch ( OutOfMemoryError e ) {
        Runtime runtime = Runtime.getRuntime ();
        System.out.println ( "Memoria insuficiente!" );
        System.out.println ( "A memória total da MVJ eh " + runtime.totalMemory() + " e o máximo eh " + runtime.maxMemory () );
        System.out.println ( "Reconfigure a MVJ usando o parametro -Xmx<size>. Você precisa de " + 16*Short.MAX_VALUE + " soh para os vetores."); 
        System.exit ( -1 );
    }        
    try{
        char[] resultado = calc.concatenarArray(op1, op2);
        System.out.println("Resultado esta aqui: " + resultado);
    }catch(ErroValidacao e){
        System.out.println("Erro:" + e.getMessage());
    }

    } 
}
