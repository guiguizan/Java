package Fazendinha;


public class ClinicaVeterinaria {

	public static void main(String[] args) {
		Veterinario jose = new Veterinario();
		
		Animal ani = new Animal();
		Mamifero mam = new Mamifero();
		
		Cao cao = new Cao();
		Gato gato = new Gato();
		Cavalo cavalo = new Cavalo();
		
		jose.examinarAnimal(ani);
		jose.examinarMamifero(mam);
		jose.examinarAnimal(cao);
		jose.examinarAnimal(gato);
		jose.examinarAnimal(cavalo);
	}
}

