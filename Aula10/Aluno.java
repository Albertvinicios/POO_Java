public class Aluno extends Pessoa { //extends significa que a classe Aluno herda os atributos e métodos da classe Pessoa
//ou seja, Aluno é uma subclasse de Pessoa, e Pessoa é a superclasse de Aluno.
//sendo assim todos os atributos nome, altura, idade, tudo que aluno tem, pessoa também tem, ou seja, aluno é uma pessoa
//mas tem mais coisas que uma pessoa não tem, como matrícula e curso.

    // Atributos
    private int matr;
    private String curso;

    //Métodos Construtores
    public Aluno(int matricula, String curs){
        this.matr = matricula;
        this.curso = curs;
    }
    public Aluno(){ //construtor vazio
        this.matr = 0;
        this.curso = " ";
    }
    //Métodos Especiais
    
    public int getMatr() {
        return matr;
    }
    public void setMatr(int matr) {
        this.matr = matr;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    //Método Função
    public void pagarMensalidade(){
        System.out.println("O valor da Mensalidade é"+getNome());
        System.out.println("Pagamento realizado com sucesso");
    }
}
