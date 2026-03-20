	public class Caneta{ 
		//primeira Classe cujo resultado é a criação de um objeto do tipo Caneta
		//com suas características e ações
		//as características do objeto por sua vez, são chamados de atributos
		public String modelo; //atributo modelo
		public String cor; //cor
		private float ponta; //ponta que devem ter nível de proteção(encapsulamento)
		protected int carga;//public, private, protected.
		private boolean tampada; //e tipos, int, String e assim por diante.
		//as ações do objeto são chamadas de métodos, que são funções dentro da classe.

		
		public void status() { //Métodos são ações, ou seja, funções dentro da classe.
			//o método status é utilizado para mostrar o estado atual do objeto
			//ou seja, suas características.
			System.out.println("modelo da caneta? " + this.modelo);//this é utilizado para referenciar o objeto atual
			//ou seja, o objeto que chamou o método. 
			System.out.println("cor da caneta? "+ this.cor);
			System.out.println("ponta da caneta? "+ this.ponta);
			System.out.println("está tampada? "+ this.tampada);
			System.out.println(this.carga+ "% de carga");
		}
		public void rabiscar() { //rabiscar é um método que representa a ação de rabiscar com a caneta
			if (this.tampada == true) { //se estiver tampada, não pode rabiscar, então mostra a mensagem de erro
				System.out.println("ERRO! Não posso Rabiscar!");
			}
			else{ 
				System.out.println("Estou Rabiscando!!"); //se estiver destampada
				//pode rabiscar, então mostra a mensagem de sucesso
			}
		}
		protected void tampar(){ //método para tampar a caneta, ou seja, para colocar a tampa
			this.tampada = true;
		}
		protected void destampar(){ //método para destampar a caneta, ou seja, para retirar a tampa
			this.tampada = false;
		}
	}