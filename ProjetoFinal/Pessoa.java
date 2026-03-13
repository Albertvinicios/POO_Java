package ProjetoFinal;

public class Pessoa {
    //Atributos
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experiencia;

    //Construtores
    public Pessoa(String nome, int idade, String sexo, int experiencia) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = experiencia;
    }
    public Pessoa(){
        this.nome = "Nenhum";
        this.idade = 0;
        this.sexo = "Indefinido";
        this.experiencia = 0;
    }
    //Getters and Setters especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    //Método função!
    public void ganharExp(int xp){
        System.out.println("você recebeu "+ xp +" de Experiência");
        this.experiencia = getExperiencia() + xp;
    }
    @Override
    public String toString() {
        return "Nome= " + nome + "\nIdade= " + idade + "\nSexo= " + sexo + "\nexperiencia= " + experiencia;
    }
}