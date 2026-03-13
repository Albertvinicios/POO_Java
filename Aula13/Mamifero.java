package Aula13;

public class Mamifero extends Animal{
    //Atributos
    protected String corPelo;
    //Construtores
    public Mamifero(){
        this.corPelo = "Nenhuma";
    }
    public Mamifero(String ma){
        this.corPelo = ma;
    }
    //Getters and Setters
    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    //Método Função
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");   
    }
}
