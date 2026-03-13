package ProjetoFinal;
import java.util.Scanner;
public class Vizualizacao {
    Scanner input = new Scanner(System.in);

    private Gafanhoto espectador;
    private Video filme;

    public Vizualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    public void avaliar(){
        System.out.println("Qual a nota do filme?");
        int avalia = input.nextInt();
        filme.setAvaliacao(avalia);
    }
    public void avaliar(int nota){
        filme.setAvaliacao(nota);
    }
    public void avaliar(Double porc){
        int tot = 0;
        if(porc <= 20){
            tot = 3;
        }else if(porc <= 50){
            tot = 5;
        }else if(porc <= 90){
            tot = 8;
        }else{
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    @Override
    public String toString() {
        return "Vizualizacao espectador= " + espectador + ", filme= " + filme + "]";
    }
}
