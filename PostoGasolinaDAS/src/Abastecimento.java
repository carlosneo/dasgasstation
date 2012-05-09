
public abstract class Abastecimento {
	
	protected float valor; //Valor monetário do abastecimento
	protected float quantidade; //valor em litros do abastecimento
	private Bomba bomba;
	
	public static Abastecimento obterAbastecimento(String tipo, float valor){
		if(tipo.equalsIgnoreCase("Quantia"))
			return new AbsQuantia(valor);
		else if (tipo.equalsIgnoreCase("Litros"))
			return new AbsLitros(valor);
		else
			return new AbsTotal();
	}

	public Bomba getBomba() {
		return bomba;
	}

	public void setBomba(Bomba bomba) {
		this.bomba = bomba;
	}
	
	

}
