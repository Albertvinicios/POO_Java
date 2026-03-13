public class Peixe extends Animal{
    
    //Atributos
    private String corEscama;

    //Construtores
    public Peixe(){
        this.corEscama = "Nenhuma";
    }
    public Peixe(String cor){
        this.corEscama = cor;
    }
    //Métodos Especiais
    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo Substâncias");
        
    }
    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
        
    }
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }
    public void soltarBolha(){
        System.out.println("Soltou uma Bolha");
    }
}
