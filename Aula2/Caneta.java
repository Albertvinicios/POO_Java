	public class Caneta{
		public String modelo;
		public String cor;
		private float ponta;
		protected int carga;
		private boolean tampada;

		
		public void status() {
			System.out.println("modelo da caneta? " + this.modelo);
			System.out.println("cor da caneta? "+ this.cor);
			System.out.println("ponta da caneta? "+ this.ponta);
			System.out.println("está tampada? "+ this.tampada);
			System.out.println(this.carga+ "% de carga");
		}
		public void rabiscar() {
			if (this.tampada == true) {
				System.out.println("ERRO! Não posso Rabiscar!");
			}
			else{ 
				System.out.println("Estou Rabiscando!!");
			}
		}
		protected void tampar(){
			this.tampada = true;
		}
		protected void destampar(){
			this.tampada = false;
		}
	}