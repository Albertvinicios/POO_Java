package Aula13;

public class Aula13POO {
    public static void main(String[] args){
        Cachorro k = new Cachorro();
        Lobo l = new Lobo();
        Mamifero m = new Mamifero();

        k.emitirSom();
        l.emitirSom();
        m.emitirSom();

        k.reagir("Olá");
        k.reagir("Vai apanhar");
        k.reagir(11, 45);
        k.reagir(21, 00);
        k.reagir(true);
        k.reagir(false);
        k.reagir(2, 12.5f);
        k.reagir(17, 4.5f);
    }
}
