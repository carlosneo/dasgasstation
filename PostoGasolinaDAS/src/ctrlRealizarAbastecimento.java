import java.util.Vector;


public class ctrlRealizarAbastecimento {

	private static Vector <Venda> vendas = new Vector<Venda>();
	private static Vector <Bomba> bombas = new Vector<Bomba>();
	
	/**
	 * Contrato de operação:
	 * ok - Uma instancia v de Venda tem que ser criada.
	 * O atributo v.codigoCartao torna-se o valor lido pela leitora de código de barras
	 * ok - Uma instancia b de bomba tem que ser obtida a partir da correspondencia com o valor da bomba informado
	 * Uma instancia bi de bico tem que ser obtida a partir da correspondencia com o valor do bico informado
	 * O atributo bi.status torna-se "Abastecendo"
	 * O atributo b.status torna-se "Ativo"
	 * A instancia b de bomba é vinculada à instância v de Venda
	 * O atributo v.status torna-se "Aberta"
	 * 
	 */
	public void iniciarNovaVenda(int bomba, int bico, int codigoCartao) {
		
	}
	
	public void definirAbastecimento(String tipo, float valor) {
		
	}
	
	public void iniciarAbastecimento() {
		
	}
	
	public void finalizarAbastecimento() {
		
	}
	
}
