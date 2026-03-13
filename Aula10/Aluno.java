public class Aluno extends Pessoa {

    // Atributos
    private int matr;
    private String curso;

    //Métodos Construtores

    public Aluno(int matricula, String curs){
        this.matr = matricula;
        this.curso = curs;
    }
    public Aluno(){
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
