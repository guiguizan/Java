package ContaBanco;

public class ContaCorrente {
	private int numero;
	private double saldo;
	private Cliente cliente;
	private double valor;
	
	public ContaCorrente(int numero) {
		this.numero = numero;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
		
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
		
	}
	
	public void depositar(double valor){
		this.valor = valor;

		
	}
	
	
	public void retirar(double valor) {
		
	}
	
	public void imprimir() {
		System.out.println("***   Dados da conta corrente   ****");
		//TODO
		System.out.println("nome do cliente" + this.cliente.getNome()) ; //cliente
		//numero da conta
		//saldo da conta
	}
	
}