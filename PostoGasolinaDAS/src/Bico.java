
public class Bico {
	
	private int numero; 
	private String combustivel;
	private int litrosIniciais, 
	            litrosFinais,
	            qtdeLitrosVendidos;
	
	public Bico() {
		litrosIniciais = 0;
		litrosFinais = 0;
		qtdeLitrosVendidos = 0;
		combustivel = "";
	}
	
	public Bico(int numero) {
		this();
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
}
