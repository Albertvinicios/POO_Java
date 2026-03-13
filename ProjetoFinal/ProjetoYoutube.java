package ProjetoFinal;

public class ProjetoYoutube {
    public static void main(String[] args){
        Video v[] = new Video[2];

        v[0] = new Video();
        v[1] = new Video("Cozinhando meu Ovo", 4, 1.0f, 23);

        Gafanhoto g[] = new Gafanhoto[2];
        
        g[0] = new Gafanhoto("Jumento", 12,"Homi", 0 );

        Vizualizacao vis[] = new Vizualizacao[4];
        vis[0] = new Vizualizacao(g[0], v[1]);
        vis[1] = new Vizualizacao(g[0], v[0]);
        System.out.println(vis[0]);
        System.out.println(vis[1]);
    }   
}
