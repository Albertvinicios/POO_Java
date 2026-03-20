public interface Publicacao { //interface é um contrato
//ou seja, um conjunto de métodos que devem ser implementados por uma classe que a implemente
    
    public void abrir(); 
    public void fechar();
    public void folhear();
    public void avancarPag();
    public void voltarPag();
}