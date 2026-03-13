import java.util.Scanner;
public class Livro implements Publicacao{
    Scanner input = new Scanner(System.in);
    //atributos

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Métodos Construtores

    public Livro(){
        this.titulo = " ";
        this.autor = " ";
        this.totPaginas = 0;
        this.pagAtual = 0;
        this.aberto = false;
    }

    public Livro(String t, String a, int tot, Pessoa pes) {
        this.titulo = t;
        this.autor = a;
        this.totPaginas = tot;
        this.leitor = pes;
    }
    //Métodos Especiais, get set
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getTotPaginas() {
        return totPaginas;
    }
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int paga) {
        if(paga <= getTotPaginas() && paga >= 0){
            this.pagAtual = paga;
            setAberto(true);
        }else{
        }
    }
    public boolean getAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    // Métodos Funções

    @Override
    public void abrir() {
        if(getAberto()){
            System.out.println("O livro já está aberto");
        }else{
            System.out.println("Abrindo Livro");
            this.aberto = true;
            this.pagAtual = 0;
        }             
    }

    @Override
    public void avancarPag() {
        if(getAberto() && getPagAtual() < getTotPaginas()){
            this.pagAtual = getPagAtual()+1;
        }else{
            System.out.println("Livro fechado ou final do Livro");
        }
    }

    @Override
    public void fechar() {
        if(getAberto()){
            System.out.println("Fechando Livro");
            this.aberto = false;
            this.pagAtual = 0;
        }else{
            System.out.println("O livro já está fechado");
        }
    }

    @Override
    public void folhear() {
        if(getAberto()){
            System.out.println("Você está na página"+getPagAtual());
            System.out.println("Para Qual página deseja ir");
            int pag = input.nextInt();
            if(pag < getTotPaginas() && pag > 0){
                this.pagAtual = pag;
            }else{
                System.out.println("Pagina não existe");
            }
        }else{
            System.out.println("Livro fechado, abra primeiro");
        }       
    }

    @Override
    public void voltarPag() {
        if(getAberto() && getPagAtual() > 1){
            this.pagAtual = getPagAtual()-1;
        }else{
            System.out.println("Livro Fechado ou começo do Livro!");
        }
    }
    @Override
    public String toString(){
        return  "------------------------------------\n"
                +"Titulo do Livro: " + titulo +". \n"
                +"Autor Do Livro: "+ autor + ". \n"
                +"Quantidade de Paginas: "+ totPaginas+ ". \n"
                +"Status do Livro: "+ aberto + ". \n"
                +"Página aberta: "+ pagAtual+ ". \n"
                +"Nome do Leitor: "+ leitor.getNome() + ". \n"
                +"Idade do Leitor: "+ leitor.getIdade() + ". \n"
                +"Sexo do Leitor: " + leitor.getSexo() + ". \n"
                +"-------------------------------------\n";
    }
}
