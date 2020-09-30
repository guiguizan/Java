package ContaBanco;

public class Banco {

	public static void main(String[] args) {
		Cliente maria = new Cliente ("Maria" , 321);
		Cliente jose = new Cliente ("Jose", 123);
		Cliente guizao = new Cliente ("guizao julietada", 666);
		
		
		maria.operar();
		jose.operar();
		guizao.operar();
		
	}
}
