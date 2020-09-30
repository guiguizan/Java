package Fazendinha;

public class Gato extends Mamifero {

	public Gato() {
		nome = "Gato";
	}
	
	public void soar() {
		miados();
	}
	
	public void miados() {
		System.out.println("Faz miados.");
	}
}