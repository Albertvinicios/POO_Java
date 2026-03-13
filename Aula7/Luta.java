import java.util.Random;
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

	public void marcarLuta(Lutador desafiado, Lutador desafiante){
		setDesafiado(desafiado);
		setDesafiante(desafiante);
		if(getDesafiado() != getDesafiante() && 
		getDesafiado().getCategoria() == getDesafiante().getCategoria()){
			setAprovada(true);
			System.out.println("Luta marcada com sucesso!!");
			System.out.println("a luta vai ser entre "+ desafiado.getNome()+ " x "+ desafiante.getNome());
			
		}else{
			System.out.println("Luta não pode ser Marcada!");
			setAprovada(false);
		}
		}


	public void lutar(Lutador desafiado, Lutador desafiante){
		if(getAprovada() == true){
			desafiado.apresentar();
			desafiante.apresentar();
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
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
		}else{
			System.out.println("A Luta não Pode acontecer");
		}
		}
	}