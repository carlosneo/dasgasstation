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
	private Bomba bomba;
	private Abastecimento abastecimento;
	
	public Venda() {
		status = NAO_INICIADA;
	}
	
	public Venda(Date data, int codigoCartao, int bomba) {
		this();
		this.data = data;
		this.codigoCartao = codigoCartao;
		this.bomba = Bomba.obterBomba(bomba);
	}

	public int alteraStatus(int status) {
		int resposta = -1; 
		switch (this.status) {
		case NAO_INICIADA: 
			if (status == INICIADA) { 
				this.status = INICIADA;
				resposta = this.status;
			}
			else
				resposta = -1;
		break;
		
		case INICIADA: 
			if (status == NAO_INICIADA){
				this.status = NAO_INICIADA;
				resposta = this.status;
			}
			else if (status == ABASTECENDO){
				this.status = ABASTECENDO;
				resposta = this.status;
			} else 
				resposta = -1; 
		break;
		
		case ABASTECENDO: 
			if (status == FINALIZADO){
				this.status = FINALIZADO;
				resposta = FINALIZADO;
			} else
				resposta = -1; 
		break;
		
		case FINALIZADO: 
			if (status == PAGO) {
				this.status = PAGO;
				resposta = PAGO;
			} else 
				resposta = -1; 
		break;
		
		case PAGO: 
			resposta = PAGO;
		break;
		}
		
		return resposta;
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
	
	public Bomba getBomba(){
		return this.bomba;
	}

	public Abastecimento getAbastecimento() {
		return abastecimento;
	}

	public void setAbastecimento(Abastecimento abastecimento) {
		this.abastecimento = abastecimento;
	}


}
