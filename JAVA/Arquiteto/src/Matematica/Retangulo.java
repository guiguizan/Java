package Matematica;

import javax.swing.JOptionPane;

public class Retangulo {
	private String nome;
	
	
	
	private static float LadoH, LadoV;
	
	public static void definirLados (float a, float b) {
		assert(a>0): "erro: lado A nao pode ser negativo neeee";
		assert(b>0): "erro: lado B nao pode ser negativo neeee";
		LadoH= a;
		LadoV= b;		
	}
	
	public static float area() {
		
		return LadoH * LadoV;
	}
	
	public static float perimetro() {
		
		return (LadoH * 2) + (LadoV * 2);
	}
	
	
	public static float getLadoH() {
		
		return LadoH;
	}
	
	public static float getLadoV() {
		
		return LadoV;
	}
	
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
}
