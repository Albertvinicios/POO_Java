	public class ControleRemoto implements Controlador{

		// atributos
		
		private int volume;
		private boolean ligado;
		private boolean tocando;

		//construtor
		public ControleRemoto(){
			this.volume = 50;
			this.ligado = false;
			this.tocando = false;
		}

		// metodos especiais

		private int getVolume(){
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

		public void abrirMenu(){
			System.out.println("---Abrindo Menu---------------");
			System.out.println("está ligado? "+ this.getLigado());
			System.out.println("está tocando? "+ this.getTocando());
			System.out.println("está em qual volume? "+ this.getVolume());
			for(int i = 0; i <= getVolume(); i += 10){
				System.out.print("|");
			}
			System.out.println("");
			System.out.println("------------------------------");
		}

		public void fecharMenu(){
			System.out.println("Fechando menu ------");
		}

		public void maisVolume(){
			if(this.getLigado() == true){
				this.setVolume(this.getVolume() + 5);
			}
		}

		public void menosVolume(){
			if (this.getLigado() == true){
				this.setVolume(this.getVolume() - 5);
			}
		}

		public void ligarMudo(){
			if(this.getLigado() == true && this.getVolume() > 0){
				this.setVolume(0);
			}
		}

		public void desligarMudo(){
			if(this.getLigado() == true && this.getVolume() == 0){
				this.setVolume(50);
			}
		}

		public void play(){
			if(this.getLigado() == true && this.getTocando() == false){
				this.setTocando(true);
			}
		}

		public void pause(){
			if(this.getLigado() == true && this.getTocando() == true){
				this.setTocando(false);
			}
		}
	}	