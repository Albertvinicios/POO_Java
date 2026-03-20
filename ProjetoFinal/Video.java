package ProjetoFinal;

public class Video implements AcoesVideo { //implementação da interface AcoesVideo
//ou seja, a classe Video é obrigada a implementar os métodos da interface AcoesVideo.
  
    // Atributos
    private String titulo;
    private int avaliacao;;
    private float views;
    private int curtidas;
    private boolean reproduzindo;

    //Construtores
    public Video(String titulo, int avaliacao, float views, int curtidas) {
        this.titulo = titulo;
        this.avaliacao = avaliacao;
        this.views = views;
        this.curtidas = curtidas;
    }
    public Video(){
        this.titulo = " ";
        this.avaliacao = 0;
        this.views = 0.0f;
        this.curtidas = 0;
    }
    //Getters and Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    public float getViews() {
        return views;
    }
    public void setViews(float views) {
        this.views = views;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public boolean getReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    public void like() {
        this.curtidas = getCurtidas()+1;   
    }
    public void pause() {
        this.reproduzindo = false;
        
    }
    public void play() {
        this.reproduzindo = true;
        this.views = getViews()+1;
    }
    @Override
    public String toString() {
        return "Titulo do vídeo: " + titulo + "\navaliacao: " + avaliacao + 
        "\nviews: " + views + "\ncurtidas: " + curtidas
        + "\nestá reproduzindo: " + reproduzindo;
    }
}