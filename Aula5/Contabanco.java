import java.util.Scanner;
import java.util.Random;
	public class Contabanco{
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		// Atributos
		public  int numconta;
		protected String tipoconta;
		private String donoconta;
		private float saldoconta;
		private boolean statusconta;
		// métodos personalizados
		public Contabanco(){
			this.statusconta = false;
			this.saldoconta = 0.0f;
		}
		// métodos especiais
		public int getNumconta(){
			return this.numconta; 
		}
		public void setNumconta(int n){
			this.numconta = n;
		}
		public String getTipoconta(){
			return this.tipoconta;
		}
		public void setTipoconta(String t){
			this.tipoconta = t;
		}
		public String getDonoconta(){
			return this.donoconta;
		}
		public void setDonoconta(String d){
			this.donoconta = d;
		}
		public float getSaldoconta(){
			return this.saldoconta;
		}
		public void setSaldoconta(float s){
			this.saldoconta = s;
		}
		public boolean getStatusconta(){
			return this.statusconta;
		}
		public void setStatusconta(boolean u){
			this.statusconta = u;
		}
		// métodos função! personalizado
		public void informaconta(){
			System.out.println("--------------------");
			System.out.println("informações da conta");
			System.out.println("status da conta " +this.getStatusconta());
			System.out.println("número da conta: "+ this.getNumconta());
			System.out.println("Tipo da Conta: "+ this.getTipoconta());
			System.out.println("proprietário da conta "+ this.getDonoconta());
			System.out.println("saldo da conta: R$"+ this.getSaldoconta());
		}
		public void abrirconta(){
			System.out.println("Vamos abrir sua conta");
			System.out.println("Primeiro digite o tipo de conta desejado");
			System.out.println("1 para conta corrente C/C");
			System.out.println("2 para conta poupança C/P");
			int t = input.nextInt();
				if (t == 1){
					this.setTipoconta("C/C");
					this.setSaldoconta(50.00f);
				}else if (t == 2){
					this.setTipoconta("C/P");
					this.setSaldoconta(150.00f);
				}else{ 
					System.out.println("só é possível colocar essas duas opções");
					return;
			}
			input.nextLine();
			System.out.println("certo, agora digite seu nome");
			String nome = input.nextLine();
				this.setDonoconta(nome);
			System.out.println("certo "+ nome +" agora sua conta foi criada com sucesso!!");
			int numeroconta =  10000 + random.nextInt(90000);
				this.setNumconta(numeroconta);
				this.setStatusconta(true);			
		}

		public void mensaconta(){
			float saldo = this.getSaldoconta();
			String conta = this.getTipoconta();
			if (conta.equals("C/C") && saldo > 12.00f){
				saldo = (saldo - 12.00f);
				this.setSaldoconta(saldo);
			}else if(conta.equals("C/P") && saldo > 20.00f){
				saldo = (saldo - 20.00f);
				this.setSaldoconta(saldo);
			}else{
				System.out.println("seu saldo é insuficiente");
				System.out.println("retornando ao menu!");
			}
		}

		public void sacarconta(){ 
			float saldo = this.getSaldoconta();
			System.out.println("seu saldo atual é R$"+ saldo);
			if (saldo <= 0.0f){
				System.out.println("você não tem dinheiro para sacar!");
				return;
			}
				System.out.println("quanto deseja sacar?");
				float saque = input.nextFloat();
				float valor = (saldo - saque);
				if (valor < 0){
					System.out.println("você não tem esse valor disponível");	
				}else{
					System.out.println("certo, valor sendo retirado");
					System.out.println("seu novo saldo agora é R$"+ valor);
					this.setSaldoconta(valor);
			}
		}
		

		public void depositaconta(){
			float saldo = this.getSaldoconta();
			System.out.println("seu saldo atual é R$"+saldo);
			System.out.println("quanto deseja depositar?");
			float deposito = input.nextFloat();
			saldo = saldo+deposito;
			System.out.println("seu novo saldo agora é R$"+ saldo);
			this.setSaldoconta(saldo);
		}

		public void fecharconta(){
			float saldo = this.getSaldoconta();
			if(saldo < 0.0f){
				System.out.println("você não pode fechar a conta");
				System.out.println("seu saldo é negativo");
			}else if(saldo > 0.0f){
				System.out.println("você ainda tem dinheiro na conta, retire antes de fechar.");
			}else{
				System.out.println("sua conta foi encerrada com sucesso");	
				this.setNumconta(0);
				this.setTipoconta(null);
				this.setDonoconta(null);
				this.setSaldoconta(0.0f);
				this.setStatusconta(false);
			}
		}
	}