public class Reptil extends Animal {
    //Atributos

    private String corEscama;
    
    //Costrutores
    public Reptil(){
        this.corEscama = "Nenhuma";
    }
    public Reptil(String cor){
        this.corEscama = cor;
    }
    //Getter and Setters Especial
    public String getCorEscama(){
        return this.corEscama;
    }
    public void setCorEscama(String cor){
        this.corEscama = cor;
    }
    //Métodos Sobrepostos funções
    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de Reptil");
    }
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }
}
