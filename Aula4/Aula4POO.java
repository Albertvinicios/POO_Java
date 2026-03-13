	public class Aula4POO{
		public static void main(String[] args){
			Caneta4 c1 = new Caneta4("Amarela","NIC", 0.4f);
			Caneta4 c2 = new Caneta4("Preto", "Mybigegg", 10.0f);
			c2.status();
			c1.status();
			c1.setModelo("BIC");
			c1.setPonta(0.5f);
			c1.status();
			c1.setModelo("Crystal");
			c1.setPonta(0.7f);
			c1.setCor("Verde");
			c1.destampar();
			c1.status();
			System.out.println("caneta modelo: "+ c1.getModelo()+"\nponta: "+ c1.getPonta());
		}
	}