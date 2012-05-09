
public class Bico {
	
	public static final int DESLIGADO = 0;
	public static final int ABASTECENDO = 1;
	public static final int TRAVADO = 2;
	
	private int numero; 
	private int status;
	private String combustivel;
	private int litrosIniciais, 
	            litrosFinais,
	            qtdeLitrosVendidos;
	
	public Bico() {
		litrosIniciais = 0;
		litrosFinais = 0;
		qtdeLitrosVendidos = 0;
		combustivel = "";
		status = DESLIGADO;
	}
	
	public Bico(int numero) {
		this();
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	
	public int alterarStatus (int status) {
		switch (this.status) {
		
		case DESLIGADO:
			if (status == DESLIGADO)
				this.status = DESLIGADO;
			else if (status == ABASTECENDO)
				this.status = ABASTECENDO;
			else return -1; //estado inalcancavel
		break;
		
		case ABASTECENDO:
			if (status == DESLIGADO)
				this.status = DESLIGADO;
			else if (status == TRAVADO)
				this.status = TRAVADO;
		break; 
		
		case TRAVADO:
			if (status != TRAVADO)
				return -1; //estado inalcancavel
		break;
		}
		
		return this.status;
	}
	
	public int getStatus(){
		return this.status;
	}
	
}
