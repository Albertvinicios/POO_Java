package Aula13;

public abstract class Animal {
    //Atributos
    protected float peso;
    protected int idade;
    protected int membros;
    //Construtores
    public Animal(){
        this.peso = 0.0f;
        this.idade = 0;
        this.membros = 0;
    }
    public Animal(float p,int i,int m){
        this.peso = p;
        this.idade = i;
        this.membros = m;
    }
    //Getters and Setters
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
    //Métodos Funções abstract
    public abstract void emitirSom();
}
