public abstract class Pessoa{ //clase abstrata é uma classe que não pode ser instanciada
//ou seja, não pode criar objetos do tipo Pessoa, mas pode criar objetos de suas subclasses
//como Aluno, Professor e Funcionario.
//porém nesse caso, como a classe Pessoa é a superclasse de Aluno
//Professor e Funcionario, ela pode ser instanciada, ou seja, pode criar objetos do tipo Pessoa.
//e essas pessoas, podem ser alunos, funcionários e etc...
    
    //atributos
    private String nome;
    private int idade;
    private String sexo;

    //Métodos Construtores
    public Pessoa(){
        this.nome = " ";
        this.idade = 0;
        this.sexo = " ";
    }
    public Pessoa(String n, int i, String s){
        this.nome = n;
        this.idade = i;
        this.sexo = s; 
    }

    //Métodos especiais
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nom){
        this.nome = nom;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int ida){
        this.idade = ida;
    }
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String sex){
        this.sexo = sex;
    }

    // Métodos Funções
    public void fazerAniversario(){
        System.out.println("Parabéns Você fez aniversário");
        this.idade = getIdade()+1;
    }
    @Override
    public String toString() {
        return "Nome= " + nome + ", idade= " + idade 
        + ", sexo= " + sexo + " \n";
    }
}   
