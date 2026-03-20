import java.util.Random; //classe lutar, tem que importar a classe random para gerar o resultado da luta
public class Luta{

	// Atributos
	private Lutador desafiado; 
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;

	// metodos especiais
	public Lutador getDesafiado(){
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado){
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante(){
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante){
		this.desafiante = desafiante;
	}

	public int getRounds(){
		return rounds;
	}

	public void setRounds(int rounds){
		this.rounds = rounds;
	}

	public boolean getAprovada(){
		return aprovada;
	}

	public void setAprovada(boolean aprovada){
		this.aprovada = aprovada;
	}

	// métodos funções
	public void marcarLuta(Lutador desafiado, Lutador desafiante){ //método para marcar a luta
	//tem que passar os dois lutadores como parametro
		setDesafiado(desafiado);
		setDesafiante(desafiante);
		if(getDesafiado() != getDesafiante() && 
		getDesafiado().getCategoria() == getDesafiante().getCategoria()){ //verificar se os lutadores são diferentes
		//e se estão na mesma categoria
			setAprovada(true);
			System.out.println("Luta marcada com sucesso!!");
			System.out.println("a luta vai ser entre "+ desafiado.getNome()+ " x "+ desafiante.getNome());
			
		}else{ //se os lutadores forem iguais ou se não estiverem na mesma categoria
		//a luta não pode ser marcada
			System.out.println("Luta não pode ser Marcada!");
			setAprovada(false);
		}
		}


	public void lutar(Lutador desafiado, Lutador desafiante){ //método para lutar
	//tem que passar os dois lutadores como parametro.
		if(getAprovada() == true){ //verificar se a luta foi aprovada
			desafiado.apresentar();
			desafiante.apresentar();
			Random aleatorio = new Random(); //gerar um número aleatório para determinar o vencedor da luta
			int vencedor = aleatorio.nextInt(3); //gerar um número aleatório entre
			//0 e 2, onde 0 é empate, 1 é vitória do desafiado e 2 é vitória do desafiante
			if(vencedor == 0){
				desafiado.setEmpates(desafiado.getEmpates()+1);
				desafiante.setEmpates(desafiante.getEmpates()+1);
				System.out.println("Luta Empatada!!, iitss timeeee!!");
			}else if(vencedor == 1){
				desafiado.setVitorias(desafiado.getVitorias()+1);
				desafiante.setDerrotas(desafiante.getDerrotas()+1);
				System.out.println("O vencedor é: "+ desafiado.getNome());
			}else if(vencedor == 2){
				desafiante.setVitorias(desafiante.getVitorias()+1);
				desafiado.setDerrotas(desafiado.getDerrotas()+1);
				System.out.println("O vencedor é: "+ desafiante.getNome());
			}else{
			}
		}else{ //se a luta não foi aprovada, não pode acontecer
			System.out.println("A Luta não Pode acontecer");
		}
		}
	}