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
		public void informaconta(){ //método para mostrar as informações da conta
		//é chamado no menu quando o usuário digita a opção 2.
			System.out.println("--------------------");
			System.out.println("informações da conta");
			System.out.println("status da conta " +this.getStatusconta());
			System.out.println("número da conta: "+ this.getNumconta());
			System.out.println("Tipo da Conta: "+ this.getTipoconta());
			System.out.println("proprietário da conta "+ this.getDonoconta());
			System.out.println("saldo da conta: R$"+ this.getSaldoconta());
		}
		public void abrirconta(){ //método para abrir a conta
		//é chamado no menu quando o usuário digita a opção 1.
			System.out.println("Vamos abrir sua conta");
			System.out.println("Primeiro digite o tipo de conta desejado");
			System.out.println("1 para conta corrente C/C");
			System.out.println("2 para conta poupança C/P");
			int t = input.nextInt();
				if (t == 1){ //se o usuário digitar 1, a conta é do tipo corrente
				//e já tem um valor inicial de R$50,00
					this.setTipoconta("C/C");
					this.setSaldoconta(50.00f);
				}else if (t == 2){ //se não selecionar a opção 1, mas digitar 2, a conta é do tipo poupança
				//e já tem um valor inicial de R$150,00
					this.setTipoconta("C/P");
					this.setSaldoconta(150.00f);
				}else{ //se o usuário digitar um número diferente de 1 ou 2, o sistema avisa e retorna ao menu.
					System.out.println("só é possível colocar essas duas opções");
					return;
			}
			input.nextLine(); //limpeza do buffer do Scanner, para evitar que o próximo input seja pulado.
			System.out.println("certo, agora digite seu nome");
			String nome = input.nextLine();
				this.setDonoconta(nome);
			System.out.println("certo "+ nome +" agora sua conta foi criada com sucesso!!");
			int numeroconta =  10000 + random.nextInt(90000); //geração de um número aleatório de conta
			//entre 10000 e 99999, para definir número da conta do usuário, cuidado com isso
			//mesmo sendo aleatório, pode acontecer de gerar o mesmo número para mais de um usuário
			//o que não é ideal
			//mas para esse exercício é aceitável.
				this.setNumconta(numeroconta);
				this.setStatusconta(true);			
		}

		public void mensaconta(){ //método para pagar a mensalidade da conta
		//é chamado no menu quando o usuário digita a opção 5.
			float saldo = this.getSaldoconta();
			String conta = this.getTipoconta();
			if (conta.equals("C/C") && saldo > 12.00f){
				saldo = (saldo - 12.00f); //se for conta corrente, o valor da mensalidade é R$12,00
				this.setSaldoconta(saldo);
			}else if(conta.equals("C/P") && saldo > 20.00f){
				saldo = (saldo - 20.00f);//se for poupança, o valor da mensalidade é R$20,00
				this.setSaldoconta(saldo);
			}else{
				System.out.println("seu saldo é insuficiente"); //se não tiver saldo suficiente para pagar a mensalidade
				//o sistema avisa e retorna ao menu.
				System.out.println("retornando ao menu!");
			}
		}

		public void sacarconta(){ //método para sacar dinheiro da conta
			float saldo = this.getSaldoconta();//é chamado no menu quando o usuário digita a opção 4.
			System.out.println("seu saldo atual é R$"+ saldo); //mostra o saldo atual para o usuário
			//para que ele saiba quanto tem disponível para sacar.
			if (saldo <= 0.0f){ //se o saldo for menor ou igual a zero
			//o sistema avisa que não tem dinheiro para sacar e retorna ao menu.
				System.out.println("você não tem dinheiro para sacar!");
				return;
			} //se o saldo for maior que zero, o sistema pergunta quanto o usuário deseja sacar.
				System.out.println("quanto deseja sacar?");
				float saque = input.nextFloat(); 
				float valor = (saldo - saque); //o sistema calcula o valor que ficará na conta após o saque
				//para verificar se o usuário tem esse valor disponível para sacar.
				if (valor < 0){ //se o valor após o saque for menor que zero
				//significa que o usuário tentou sacar mais do que tem disponível
					System.out.println("você não tem esse valor disponível");	
				}else{  //se o valor após o saque for maior ou igual a zero, o sistema realiza o saque
					System.out.println("certo, valor sendo retirado");
					System.out.println("seu novo saldo agora é R$"+ valor);
					this.setSaldoconta(valor);
			}
		}
		

		public void depositaconta(){
			float saldo = this.getSaldoconta();//é chamado no menu quando o usuário digita a opção 3.
			System.out.println("seu saldo atual é R$"+saldo);
			System.out.println("quanto deseja depositar?");
			float deposito = input.nextFloat();
			saldo = saldo+deposito; //o sistema calcula o novo saldo após o depósito
			//somando o valor do depósito ao saldo atual.
			System.out.println("seu novo saldo agora é R$"+ saldo);
			this.setSaldoconta(saldo);
		}

		public void fecharconta(){ //método para fechar a conta
		//é chamado no menu quando o usuário digita a opção 6.
			float saldo = this.getSaldoconta();
			if(saldo < 0.0f){ //se o saldo for negativo, o sistema avisa que não é possível fechar a conta
				System.out.println("você não pode fechar a conta");
				System.out.println("seu saldo é negativo");
			}else if(saldo > 0.0f){ //se o saldo for positivo, o sistema avisa que não é possível fechar a conta.
				System.out.println("você ainda tem dinheiro na conta, retire antes de fechar.");
			}else{
				System.out.println("sua conta foi encerrada com sucesso"); //se o saldo for zero, o sistema fecha a conta
				//ou seja, muda o status para false e zera os outros atributos.	
				this.setNumconta(0);
				this.setTipoconta(null);
				this.setDonoconta(null);
				this.setSaldoconta(0.0f);
				this.setStatusconta(false);
			}
		}
	}