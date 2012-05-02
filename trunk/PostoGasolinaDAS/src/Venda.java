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
		setStatus(NAO_INICIADA); 
	}
	
	public Venda(Date data, int codigoCartao) {
		this();
		this.data = data;
		this.codigoCartao = codigoCartao;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	
}
