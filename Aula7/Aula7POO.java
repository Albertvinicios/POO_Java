public class Aula7POO{
	public static void main(String[] args){
	Lutador[] vetL = new Lutador[6]; // vetor de objetos do tipo Lutador
	vetL[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 3, 1);
	vetL[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
	vetL[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
	vetL[3] = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.6f, 13, 0, 2);
	vetL[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
	vetL[5] = new Lutador("Nerdaard", "Eua",30, 1.80f, 105.7f, 12, 2, 4);
	//vetL[0].apresentar();
	//vetL[1].apresentar();
	//vetL[2].apresentar();
	//vetL[3].apresentar();
	//vetL[4].apresentar();
	//vetL[5].apresentar();
	//vetL[0].ganharLuta();
	//vetL[0].perderLuta();
	//vetL[0].empatarLuta(); //possibilidades
	vetL[3].status(); ///status do lutador
	vetL[2].status();
	
	System.out.println("Análise da luta"); //analise da luta

	Luta uec01 = new Luta(); //objeto do tipo luta
	uec01.marcarLuta(vetL[3], vetL[2]); //marcar luta entre os lutadores
	uec01.lutar(vetL[3], vetL[2]); //realizar a luta entre os lutadores
	vetL[3].status(); //status do lutador após a luta
	vetL[2].status(); //status do lutador após a luta
	}
}
