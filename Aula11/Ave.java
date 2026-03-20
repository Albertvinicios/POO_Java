public class Ave extends Animal { //estende animal, ou seja, herda seus atributos e métodos
//e por consequência, é uma subclasse de Animal
    //Atributos
    private String corPena;

    //Construtores
    public Ave(){
        this.corPena = "Nenhuma";
    }
    public Ave(String cor){
        this.corPena = cor;
    }
    //Getters and Setters
    public String getCorPena() {
        return corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    //Métodos Funções Sobrepostas
    //porém ao sobrescrever os métodos da classe Animal
    //é necessário usar a anotação @Override, já que os métodos da classe Animal são abstratos
    //ou seja, não possuem implementação, e cada animal se alimenta, locomove e etc..
    //de formas diferentes.
    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");
    }
    @Override
    public void locomover() {
        System.out.println("Voando");
    }
    //Métodos Funções
    public void fazerNinho(){
        System.out.println("Construiu um Ninho");
    }
}
