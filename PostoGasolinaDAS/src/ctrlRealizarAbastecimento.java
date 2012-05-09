import java.util.Date;
import java.util.Vector;


public class ctrlRealizarAbastecimento {

	
	private static Vector <Venda> vendas = new Vector<Venda>();
	private static Vector <Bomba> bombas = new Vector<Bomba>();

	private Venda v;
	private Bomba b;
	private Bico bi;
	
	public Bomba getBomba(){
		return this.b;
	}
	
	public Bico getBico(){
		return this.bi;
	}
	
	
	/**
	 * Contrato de operação:
	 * ok - Uma instancia v de Venda tem que ser criada.
	 * ok - O atributo v.codigoCartao torna-se o valor lido pela leitora de código de barras
	 * ok - Uma instancia b de bomba tem que ser obtida a partir da correspondencia com o valor da bomba informado
	 * ok - Uma instancia bi de bico tem que ser obtida a partir da correspondencia com o valor do bico informado
	 * ok - O atributo bi.status torna-se "Abastecendo"
	 * ok - O atributo b.status torna-se "Ativo"
	 * ok - A instancia b de bomba é vinculada à instância v de Venda
	 * ok -  O atributo v.status torna-se "Iniciada"
	 * 
	 */
	public void iniciarNovaVenda(int bomba, int bico, int codigoCartao, Date data) {
		v = new Venda(data, codigoCartao, bomba);
		b = v.getBomba();
		b.obterBico(bico).alterarStatus(Bico.ABASTECENDO);
		bi = b.obterBico(bico);
		b.alterarStatus(Bomba.ATIVADA);
		v.alteraStatus(Venda.INICIADA);

	}
	
	public void definirAbastecimento(String tipo, float valor) {
		
	}
	
	public void iniciarAbastecimento() {
		
	}
	
	public void finalizarAbastecimento() {
		
	}
	
	public Venda getVenda() {
		return this.v;
	}
}
