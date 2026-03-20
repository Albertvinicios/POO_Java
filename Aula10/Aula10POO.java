public class Aula10POO {
    public static void main(String[] args){

        Pessoa p1 = new Pessoa(); //instanciando um objeto do tipo Pessoa
        //que é a superclasse de Aluno, Professor e Funcionario
        Aluno p2 = new Aluno(); 
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }
}
