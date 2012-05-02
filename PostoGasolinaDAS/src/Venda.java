import java.util.Date;


public class Venda {
	public static final int NAO_INICIADA = 0;
	public static final int INICIADA = 1;
	public static final int ABASTECENDO = 2;
	public static final int FINALIZADO = 3;
	public static final int PAGO = 4;

	private Date data; 
	private int status;
	private int codigoCartao;
	private float qtdeLitrosAbastecidos;
	private String combustivel;
	private float valorTotal;
	
	public Venda() {
		status = NAO_INICIADA; 
	}
	
	public Venda(Date data, int codigoCartao) {
		this();
		this.data = data;
		this.codigoCartao = codigoCartao;
	}

	public int getStatus() {
		return status;
	}
	
	public Date getData(){
		return data;
	}
	
	public int getCodigoCartao(){
		return codigoCartao;
	}
	
	public void setCodigoCartao (int codigoCartao){
		this.codigoCartao = codigoCartao;
	}

	public float getQtdeLitrosAbastecidos() {
		return qtdeLitrosAbastecidos;
	}

	public void setQtdeLitrosAbastecidos(float qtdeLitrosAbastecidos) {
		this.qtdeLitrosAbastecidos = qtdeLitrosAbastecidos;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
}
