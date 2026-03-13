import java.util.Scanner;
	public class Aula5POO{
		static Scanner entrada = new Scanner(System.in);
		static Contabanco c1 = new Contabanco();		
		public static void main(String[] args){
			sistema();
		}
		public static void sistema(){
			while(true){
			System.out.println("-------------------------------------");
			System.out.println("Olá, bem vindo ao banco Vinicash!\n ");
			System.out.println("para abrir sua conta digite 1");
			System.out.println("para consultar informações 2");
			System.out.println("depositar valor digite 3");
			System.out.println("sacar valor digite 4");
			System.out.println("pagar mensalidade da conta 5");
			System.out.println("fechar conta digite 6");
			System.out.println("encerrar serviço digite 7\n ---------");
			int movimento = entrada.nextInt();
			if (movimento == 1){
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
				System.out.println("sua conta foi fechada!");
				break;
			}else{
				System.out.println("por favor digite o número novamente!!");
			}
		} 
	}	
}