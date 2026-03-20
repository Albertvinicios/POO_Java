import java.util.Scanner;
	public class Aula5POO{ //método principal com menu
		static Scanner entrada = new Scanner(System.in); //abertura de Scanner statico, aplica-se
		//a toda a classe, não precisa ser instanciado para ser utilizado.
		static Contabanco c1 = new Contabanco(); //instanciação do objeto c1 da classe Contabanco
		//utilizando o método construtor vazio.
		public static void main(String[] args){//método principal
			sistema(); //chamada do método sistema
			//onde se encontra o menu de opções para o usuário.
		}
		public static void sistema(){ //método sistema, onde se encontra o menu de opções para o usuário.
			while(true){ //enquanto o usuário não digitar a opção de encerrar serviço
			//o menu continuará aparecendo.
			System.out.println("-------------------------------------");
			System.out.println("Olá,"+c1.getDonoconta()+" bem vindo ao banco Vinicash!\n ");
			System.out.println("para abrir sua conta digite 1");
			System.out.println("para consultar informações 2");
			System.out.println("depositar valor digite 3");
			System.out.println("sacar valor digite 4");
			System.out.println("pagar mensalidade da conta 5");
			System.out.println("fechar conta digite 6");
			System.out.println("encerrar serviço digite 7\n ---------");
			int movimento = entrada.nextInt();
			if (movimento == 1){ //cada se, ativa a função correspondente a opção escolhida pelo usuário.
				c1.abrirconta();
			}else if(movimento == 2){
				c1.informaconta();
			}else if(movimento == 3){
				c1.depositaconta();
			}else if(movimento == 4){
				c1.sacarconta();
			}else if(movimento == 5){
				c1.mensaconta();
			}else if(movimento == 6){
				c1.fecharconta();
			}else if(movimento == 7){
				System.out.println("sua conta foi fechada!"); //ao final
				break; //do menu, o sistema é encerrado.
			}else{ //caso o usuário digite um número diferente das opções, o sistema avisa e retorna ao menu.
				System.out.println("por favor digite o número novamente!!");
			}
		} 
	}	
}