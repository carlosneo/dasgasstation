import java.util.Date;


public class Venda {

	private Date data; 
	private String status;
	private int codigoCartao;
	
	public Venda() {
		status = "Não iniciada"; 
	}
	
	public Venda(Date data, int codigoCartao) {
		this();
		this.data = data;
		this.codigoCartao = codigoCartao;
	}

	public String getStatus() {
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
	
	
}
