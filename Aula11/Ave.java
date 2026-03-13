public class Ave extends Animal {
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
