public class Caneta4{
	private String modelo;
	private String cor;
	private float ponta;
	private boolean tampada;

	public Caneta4(String c,String m,float p) {	// este é o método construtor
		this.cor = c;
		this.modelo = m;
		this.ponta = p;
		this.tampar();		
	}
	public String getCor(){
		return this.cor;
	}
	public void setCor(String c){
		this.cor = c;
	}
	public String getModelo(){
		return this.modelo;
	}
	public void setModelo(String m){
		this.modelo = m;
	}
	public float getPonta(){
		return this.ponta;
	}
	public void setPonta(float p){
		this.ponta = p;
	}
	public void tampar(){
		this.tampada = true;
	}
	public void destampar(){
		this.tampada = false;
	}
	public void status(){
		System.out.println("sobre a caneta!");
		System.out.println("modelo : "+ this.modelo);
		System.out.println("ponta : "+ this.ponta);
		System.out.println("cor = "+ this.cor);
		System.out.println("tampada = "+ this.tampada);
	}
}