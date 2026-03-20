	public class ControleRemoto implements Controlador{ 
	//a classe ControleRemoto implementa a interface Controlador
	//ou seja, ela é obrigada a implementar os métodos abstratos da interface.
		// atributos
		private int volume;
		private boolean ligado;
		private boolean tocando;

		//construtor
		public ControleRemoto(){//método construtor, onde os atributos são inicializados.
			this.volume = 50; //estado inicial
			this.ligado = false;
			this.tocando = false;
		}

		// metodos especiais
		private int getVolume(){ //método get para o volume, para acessar o valor do volume.
			return volume;
		}

		private void setVolume(int volume){
			this.volume = volume;
		}

		private boolean getLigado(){
			return ligado;
		}

		private void setLigado(boolean ligado){
			this.ligado = ligado;
		}

		private boolean getTocando(){
			return tocando;
		}

		private void setTocando(boolean tocando){
			this.tocando = tocando;
		}

		//metodos abstratos override sobrescrito, sem o abstract.
		public void ligar(){
			this.setLigado(true);
		}

		public void desligar(){
			this.setLigado(false);
		}
		//funcionalidades do controle remoto, implementando os métodos da interface.
		public void abrirMenu(){
			System.out.println("---Abrindo Menu---------------");
			System.out.println("está ligado? "+ this.getLigado());
			System.out.println("está tocando? "+ this.getTocando());
			System.out.println("está em qual volume? "+ this.getVolume());
			for(int i = 0; i <= getVolume(); i += 10){ ///se o volume for 50
			//o sistema imprime 5 barras para representar o volume.
				System.out.print("|");
			}
			System.out.println("");
			System.out.println("------------------------------");
		}

		public void fecharMenu(){ //método para fechar o menu, apenas imprime uma mensagem de fechamento.
			System.out.println("Fechando menu ------");
		}

		public void maisVolume(){ //método para aumentar o volume
		//verifica se o aparelho está ligado antes de aumentar o volume.
			if(this.getLigado() == true){
				this.setVolume(this.getVolume() + 5);
			}
		}

		public void menosVolume(){ //método para diminuir o volume
			if (this.getLigado() == true){
				this.setVolume(this.getVolume() - 5);
			}
		}

		public void ligarMudo(){ //método para ligar o modo mudo, ou seja, colocar o volume em zero.
			if(this.getLigado() == true && this.getVolume() > 0){
				this.setVolume(0);
			}
		}

		public void desligarMudo(){ //método para desligar o modo mudo
		//ou seja, restaurar o volume para um valor padrão.
			if(this.getLigado() == true && this.getVolume() == 0){
				this.setVolume(50);
			}
		}

		public void play(){ //método para ligar a função play, ou seja, começar a tocar.
			if(this.getLigado() == true && this.getTocando() == false){
				this.setTocando(true);
			}
		}

		public void pause(){ //método para pausar a função play, ou seja, parar de tocar.
			if(this.getLigado() == true && this.getTocando() == true){
				this.setTocando(false);
			}
		}
	}	