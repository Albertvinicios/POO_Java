public class Caneta4{ //modelo semelhante a aula 2, porém
//com a utilização de construtores e métodos getters e setters para acessar os atributos privados
	private String modelo;
	private String cor;
	private float ponta;
	private boolean tampada;

	public Caneta4(String c,String m,float p) {	// este é o método construtor
		this.cor = c; //construtor é um método especial que tem o mesmo nome da classe e é
		//utilizado para inicializar os objetos, define como você quer utilizar.
		this.modelo = m;
		this.ponta = p;
		this.tampar();
	}
	public String getCor(){ //método getter para acessar o atributo cor, que é privado
		return this.cor;
	}
	public void setCor(String c){ //método setter para modificar o atributo cor, que é privado
		this.cor = c;
	}
	public String getModelo(){ //método getter para acessar o atributo modelo, que é privado
		return this.modelo;
	}
	public void setModelo(String m){ //método setter para modificar o atributo modelo, que é privado
		this.modelo = m;
	}
	public float getPonta(){ //método getter para acessar o atributo ponta, que é privado
		return this.ponta;
	}
	public void setPonta(float p){ //método setter para modificar o atributo ponta, que é privado
		this.ponta = p;
	}
	public void tampar(){
		this.tampada = true; //se chamar o método ela tampa a caneta, ou seja, coloca a tampa
	}
	public void destampar(){ //destampar é o contrário de tampar, ou seja, para retirar a tampa
		this.tampada = false;
	}
	public void status(){
		System.out.println("sobre a caneta!");
		System.out.println("modelo : "+ this.modelo);
		System.out.println("ponta : "+ this.ponta);
		System.out.println("cor = "+ this.cor);
		System.out.println("tampada = "+ this.tampada);
	}
	//nesses casos  os acessos são feitos através dos métodos getters e setters, ou seja
	//para acessar o atributo cor, que é privado, tem que utilizar o método getCor()
	//e para modificar o atributo cor
	//tem que utilizar o método setCor(String c), e assim por diante para os outros atributos.
}