public class Professor extends Pessoa {
    //Atributos
    private String especialidade;
    private Double salario;

    //Métodos Construtores
    public Professor(){
        this.especialidade = " ";
        this.salario = 0.0;
    }
    public Professor(String esp, Double sal){
        this.especialidade = esp;
        this.salario = sal;
    }

    //Métodos especiais
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    //Método Função
    public void receberAum(Double aumento){
        aumento = aumento + getSalario();
        setSalario(aumento);
    }
}
