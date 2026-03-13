public class Lutador{

	//Atributos

	private String nome;
	private String nacionalidade;
	private int idade; 
	private float altura; 
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	//Métodos construtores

	public Lutador(String no,String na,int id,float al,float pe,int vi,int de,int em){
	this.nome = no;
	this.nacionalidade = na;
	this.idade = id;
	this.altura = al;
	this.setPeso(pe);
	this.vitorias = vi;
	this.derrotas = de;
	this.empates = em;	

	}

	//Métodos Especiais

	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNacionalidade(){
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade){
		this.nacionalidade = nacionalidade;
	}
	public int getIdade(){
		return idade;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
	public float getAltura(){
		return altura;
	}
	public void setAltura(float altura){
		this.altura = altura;
	}
	public float getPeso(){
		return peso;
	}
	public void setPeso(float peso){
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria(){
		return categoria;
	}
	public void setCategoria(){
		if(this.getPeso() < 52.2){
			this.categoria = "Invalida";
		}else if(this.getPeso() <= 70.3){
			this.categoria = "Leve";
		}else if(this.getPeso() <= 83.9){
			this.categoria = "Media";
		}else if(this.getPeso() <= 120.2){
			this.categoria = "Peso Pesado";
		}else{
			this.categoria = "invalido";
		}
	}
	public int getVitorias(){
		return vitorias;
	}
	public void setVitorias(int vitorias){
		this.vitorias = vitorias;

	}
	public int getDerrotas(){
		return derrotas;
	}
	public void setDerrotas(int derrotas){
		this.derrotas = derrotas;

	}
	public int getEmpates(){
		return empates;
	}
	public void setEmpates(int empates){
		this.empates = empates;
	}

	//Métodos funções

	public void apresentar(){
		System.out.println("---------UFC---------");
		System.out.println("Lutador: "+ this.getNome());
		System.out.println("Origem: "+ this.getNacionalidade());
		System.out.println("Idade: "+ this.getIdade());
		System.out.println("Altura: "+ this.getAltura());
		System.out.println("Peso: "+ this.getPeso());
		System.out.println("Categoria: "+ this.getCategoria());
		System.out.println("Vitorias: "+ this.getVitorias());
		System.out.println("Derrotas: "+ this.getDerrotas());
		System.out.println("Empates: "+ this.getEmpates());
		System.out.println("---------------------");
	}

	public void status(){
		System.out.println("---Status Atual---");
		System.out.println(this.getNome());
		System.out.println(this.getPeso());
		System.out.println(this.getCategoria());
		System.out.println(this.getVitorias());
		System.out.println(this.getDerrotas());
		System.out.println(this.getEmpates());
		System.out.println("------------------");
	}

	public void ganharLuta(){
		System.out.println("parabéns pela vitoria");
		this.setVitorias(this.getVitorias()+1);
	}

	public void perderLuta(){
		System.out.println("Que triste não foi dessa vez");
		this.setDerrotas(this.getDerrotas()+1);
	}

	public void empatarLuta(){
		System.out.println("Empate técnico!!");
		this.setEmpates(this.getEmpates()+1);
	}
}
