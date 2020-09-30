package Especialista;
import javax.swing.JOptionPane;

import Matematica.Retangulo;

public class EngenheiroCivil {
	
	private static String nome = "Guizaooooo";
	private static int idade = 97;

	public static void exibir_dados_pessoais() {
		System.out.println( nome );
		System.out.println( idade + "anos");		
	}	
				
	
	public static void main(String[] args){
		
		
		
		exibir_dados_pessoais();
	
		
		Retangulo.definirLados(4.7f, 8.2f);
		
		System.out.println("Tamanho dos lados: " + Retangulo.getLadoH() + " e... " +  Retangulo.getLadoV());
		
		System.out.println("Area do retangulo: " + Retangulo.area() );
		
		System.out.println("Perimetro do retangulo: " + Retangulo.perimetro());
		
		
				
	}
}


