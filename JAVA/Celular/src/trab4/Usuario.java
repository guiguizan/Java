package Celular;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	private String nome;
	private ArrayList<Contato> contatos;
	
	public Usuario(String nome) {
		this.nome = nome;
		this.contatos = new ArrayList<Contato>();
	}
	
	public void conversar() {
		boolean fim = false;
		int opt;
		String entrada, msg;
		Scanner leitor = new Scanner(System.in);
		
		while(!fim) {
			System.out.println("------------------------");
			System.out.println("          Menu");
			System.out.println("------------------------");
			System.out.println("1) Adicionar contato");
			System.out.println("2) Enviar msg para contato");
			System.out.println("3) Receber msg de contato");
			System.out.println("4) Imprimir conversas");
			System.out.println("5) Fim.");
			System.out.println("Digite a opcao desejada: ");
			opt = leitor.nextInt();
			leitor.nextLine();
			switch (opt) {
			case 1:
				System.out.println("1) Adicionar contato");
				System.out.println("Digite o nome do contato: ");
				entrada = leitor.next();
				this.contatos.add(new Contato(entrada));
				System.out.println("Operacao realizada com sucesso");
				System.out.println("Tecle algo para continuar");
				leitor.next();
				break;
			case 2:
				System.out.println("2) Enviar msg para contato");
				System.out.println("Digite o nome do contato: ");
				entrada = leitor.next();
				System.out.println("Digite a msg para [" + entrada + "]: ");
				msg = leitor.next();
				this.enviarMensagem(entrada, msg);
				System.out.println("Tecle algo para continuar");
				leitor.nextLine();
				System.out.flush();
				break;
			case 3:
				System.out.println("3) Receber msg de contato");
				System.out.println("Digite o nome do contato: ");
				entrada = leitor.next();
				
				break;
			case 4:
				System.out.println("4) Imprimir conversas");
				System.out.println("Conversas de [" + this.nome + "]");
				for(Contato c: this.contatos) {
					System.out.println("Contato [" + c.getNome() + "] tem [" + c.getMensagens().size() + "] mensagens");
					c.imprimirMensagens();	
				}
				System.out.println("Tecle algo para continuar");
				leitor.nextLine();
				System.out.flush();
				break;
			case 5:
				System.out.println("5) Fim.");
				fim = true;
				leitor.close();
				System.out.println("Programa encerrado.");
				break;
			default:
				System.out.println("Opcao incorreta. Tente novamente");
				System.out.println("Tecle algo para continuar: ");
				leitor.nextLine();
			}
			this.cls();
		}
	}
	
	private void enviarMensagem(String nome, String msg) {
		Contato contato = this.encontraContato(nome);
		if (contato != null) {
			contato.getMensagens().add(new Mensagem(msg));
			System.out.println("Operacao realizada com sucesso");
		}else
			System.out.println("Contato [" + nome + "] inexistente");
	}
	
	private void receberMensagem(String nome, String msg) {
		Contato contato = this.encontraContato(nome);
		if (contato != null) {
			contato.getMensagens().add(new Mensagem("[RECEBER]" + msg));
			System.out.println("Operacao realizada com sucesso");
		}else
			System.out.println("Contato [" + nome + "] inexistente");
	}
	
	public Contato encontraContato(String nome) {
		for (Contato c: this.contatos) {
			if (c.getNome().equals(nome))
				return c;
		}
		return null;
	}
	
	public void cls() {
		System.out.println("\n\n");
	}

	public static void main(String[] args) {
		Usuario jose = new Usuario("Jose da Silva");
		jose.conversar();
	}

}