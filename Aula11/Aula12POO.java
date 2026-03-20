public class Aula12POO {
    public static void main(String[] args){
        Mamifero m = new Mamifero(); //instanciando um objeto do tipo Mamifero
        //que é uma subclasse de Animal
        Reptil r = new Reptil();
        Ave a = new Ave();
        Peixe p = new Peixe();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        
        m.alimentar(); //método alimentar é um método abstrato da classe Animal
        //que foi implementado na classe Mamifero
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
