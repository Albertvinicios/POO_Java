public class Bolsista extends Aluno { //objeto bolsista é um aluno
//ou seja, herda os atributos e métodos da classe Aluno
//e por consequência da classe Pessoa.
  
    //Atributo
    private int bolsa;

    //Construtores
    public Bolsista(){
        this.bolsa = 0;
    }
    public Bolsista(int a){
        this.bolsa = a;
    }

    //Métodos Especiais
    public int getBolsa() {
        return bolsa;
    }
    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    //Métodos Funções
    public void renovarBolsa(int valor){
        valor = valor + getBolsa();
        this.bolsa = valor;
    }
      @Override
    public void pagarMensalidade() {
       System.out.println(getNome()+ "pagou mensalidade");
    }
}