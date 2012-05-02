
public class Bico {
	public final int ABASTECENDO = 0;
	public final int DESLIGADO = 1;
	public final int TRAVADO = 2;
	
	public static final int GASOLINA_COMUM = 0;
	public static final int GASOLINA_ADITIVADA = 1;
	public static final int ALCOOL = 2;
	public static final int DIESEL = 3;
	
	private int status; 
	private int numero;
	private int combustivel;
	private int litrosIniciais, 
	            litrosFinais,
	            qtdeLitrosVendidos;
	
	public Bico() {
		litrosIniciais = 0;
		litrosFinais = 0;
		qtdeLitrosVendidos = 0;
	}
	
	public Bico(int numero, int combustivel) {
		this();
		this.numero = numero;
		this.combustivel = combustivel;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
}
