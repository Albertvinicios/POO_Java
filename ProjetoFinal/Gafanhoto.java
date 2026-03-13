package ProjetoFinal;

public class Gafanhoto extends Pessoa{
    //Atributos
    private boolean login;
    private int totAssistido;

    //Construtores
    
    public Gafanhoto(boolean login, int totAssistido) {
        this.login = login;
        this.totAssistido = totAssistido;
    }
    public Gafanhoto(String nome, int idade, String sexo, int experiencia) {
        super(nome, idade, sexo, experiencia);
    }
    public Gafanhoto(){
        this.login = false;
        this.totAssistido = 0;
    }

    public boolean getLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    public void viuMaisUm(){
        if(getLogin()){
            this.totAssistido = getTotAssistido()+1;
        }else{
            System.out.println("Você não está Logado!");
        }
    }
    @Override
    public void ganharExp(int xp) {
       System.out.println("Gafanhoto ganhou "+xp+" de xp Parabéns!!");
    }
    @Override
    public String toString() {
        return "Gafanhoto login= " + login + "\n totAssistido= " + totAssistido + "\n "+super.toString();
    }
}
