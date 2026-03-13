public class Cachorro extends Mamifero {

    @Override
    public void alimentar() {
        System.out.println("Comendo!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Latido!!");
    }

    @Override
    public void locomover() {
        System.out.println("Andar");
    }
    
}
