public abstract class Animal {

    //Atributos
    protected float peso;
    protected int idade;
    protected int membros;

    //Construtor
    public Animal(float peso, int idade, int membros) {
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }
    public Animal(){
        this.peso = 0.0f;
        this.idade = 0;
        this.membros = 0;
    }

    //Metodos Especiais
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getMembros() {
        return membros;
    }
    public void setMembros(int membros) {
        this.membros = membros;
    }
    //Métodos funções abstratas.

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}
