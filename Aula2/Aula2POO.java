	public class Aula2POO{
		public static void main(String[] args){
		Caneta c1 = new Caneta(); //instanciação do objeto criado na classe Caneta
		c1.cor = "Azul"; //utilização do objeto para definição da cor da canete
		c1.modelo = "Bic Crystal"; //modelo
		//c1.ponta = 0.5f; //ponta, que é do tipo float, então tem que colocar o f no final
		//para indicar que é um número decimal, porém, por ser do tipo private, não pode ser acessado diretamente
		//então tem que criar um método para isso, chamado construtores
		c1.carga = 90;
		c1.destampar();  //chamada dos métodos para destampar a caneta, ou seja, para retirar a tampa
		c1.status();
		c1.rabiscar();
	}
}