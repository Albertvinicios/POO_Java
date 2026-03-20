public interface Controlador{ //interface criada, onde os métodos abstratos são declarados.
	// interface criada
	//nesse caso não se utiliza abstract
	//pois os métodos já são abstratos por serem declarados em uma interface.
	//não se declara interface como public, pois ela já é pública por padrão.

	abstract void ligar(); //método abstrato para ligar o aparelho
	//sem implementação, apenas a assinatura do método.
	//não é necessário colocar public, pois os métodos de uma interface são públicos por padrão.
	//mas é possível colocar public, se desejar.
	public abstract void desligar();//método abstrato para desligar o aparelho

	public abstract void abrirMenu(); //serve como uma interface para o controle remoto
	//onde os métodos abstratos são declarados
	//e depois implementados na classe ControleRemoto, que implementa a interface Controlador

	public abstract void fecharMenu();

	public abstract void maisVolume();

	public abstract void menosVolume();

	public abstract void ligarMudo();

	public abstract void desligarMudo();

	public abstract void play();

	public abstract void pause();
	
}