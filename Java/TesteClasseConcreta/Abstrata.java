package TesteClasseConcreta;

public abstract class Abstrata {
    public abstract void emitirSom();

    public void dormir(){
        System.out.println("ZZZ....");
    }


    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.emitirSom();
        gato.emitirSom();
    }
}
