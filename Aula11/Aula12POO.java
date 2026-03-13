public class Aula12POO {
    public static void main(String[] args){
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Ave a = new Ave();
        Peixe p = new Peixe();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        
        m.alimentar();
        m.locomover();
        m.emitirSom();

        c.locomover();
        c.emitirSom();
        c.usarBolsa();

        k.emitirSom();
        c.emitirSom();
        r.emitirSom();
        a.emitirSom();
        p.emitirSom();
    }
}
