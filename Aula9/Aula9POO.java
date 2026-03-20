public class Aula9POO {
    public static void main(String[] args){

        Pessoa[] p = new Pessoa[2]; //instanciando um vetor de objetos do tipo Pessoa
        //para representar os leitores dos livros
        Livro[] l = new Livro[3]; //instanciando um vetor de objetos do tipo Livro

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25,"F");

        l[0] = new Livro("Aprendendo Java", "José Da Silva", 300, p[0]);
        l[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avançado","Maria Candido", 800, p[0]);

        l[0].setPagAtual(299);
        System.out.println(l[0]);
        System.out.println(l[1]);
    }
}
