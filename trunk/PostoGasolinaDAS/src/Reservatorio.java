
public class Reservatorio {

	public static final int GASOLINA_COMUM = 0;
	public static final int GASOLINA_ADITIVADA = 1;
	public static final int ALCOOL = 2;
	public static final int DIESEL = 3;
	
	private int numero;	
	private int combustivel;
	private float volumeAtual;
	private float valorLitro;
	private float capacidade;
	
	
	
	public Reservatorio(int combustivel){
		this.combustivel = combustivel;	
	}
	
	public Reservatorio(int combustivel, float capacidade, float valorLitro, float volumeAtual){
		this.capacidade = capacidade;
		this.combustivel = combustivel;
		this.valorLitro = valorLitro;
		this.volumeAtual = volumeAtual;
	}
	
	public int getCombustivel(){
		return this.combustivel;
	}
}
