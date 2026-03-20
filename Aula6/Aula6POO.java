public class Aula6POO{
	public static void main(String[] args){
		ControleRemoto c = new ControleRemoto();
		c.ligar(); //por sua vez a classe principal, onde o método main é declarado
		//instancia um objeto c da classe ControleRemoto.
		c.maisVolume();
		c.abrirMenu();
		c.ligarMudo();
		c.play();
		c.abrirMenu();
	}
}