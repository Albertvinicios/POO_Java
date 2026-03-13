public class Funcionario extends Pessoa {
    
    //Atributos
    private String setor;
    private boolean trabalhando;

    //Construtores
    public Funcionario(String setor, boolean trabalhando) {
        this.setor = setor;
        this.trabalhando = trabalhando;
    }
    public Funcionario(){
        this.setor = " ";
        this.trabalhando = false;
    }

    //Métodos Especiais
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public boolean getTrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    //Métodos Funções
    public void mudarTrabalho(){
        if(getTrabalhando() == true){
            setTrabalhando(false);
        }else{
            System.out.println("O Funcionario já está desempregado");
        }
    }
}
