public class Mamifero extends Animal {
    //Atributos

    private String corpelo;

    //Construtor 
    public Mamifero(){
        this.corpelo = "Nenhuma";
    }

    public Mamifero(String corpelo){
        this.corpelo = corpelo;
    }

    //Getter and Setters
    public String getCorpelo() {
        return corpelo;
    }

    public void setCorpelo(String corpelo) {
        this.corpelo = corpelo;
    } 
    //Métodos Funções, herdadas de abstract

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }
}