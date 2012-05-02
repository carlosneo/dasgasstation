import java.util.Enumeration;
import java.util.Vector;


public class Bomba {
	
	public static final int DESLIGADA = 0;
	public static final int ATIVADA = 1;
	public static final int DESATIVADA = 2;

	public static Vector<Bomba> bombas = new Vector<Bomba>();
	private Vector<Bico> bicos = new Vector<Bico>();
	private Vector<Reservatorio> reservatorios = new Vector<Reservatorio>();
	
	private int numero;
	private int status;

	public Bomba() {
		int i;
		this.status = DESLIGADA; 
		
		for (i=1; i<=2; i++) 
			bicos.add(new Bico(i, reservatorios.get(1).getCombustivel()));
		for (i=3; i<=4; i++) 
			bicos.add(new Bico(i, reservatorios.get(2).getCombustivel()));
	}
	
	public Bomba(int numero, Vector<Reservatorio> reservatorios) {
		this();
		this.numero = numero;
		this.reservatorios = reservatorios;
		bombas.add(this);
	}
	
	public static Bomba obterBomba(int numero){
		Enumeration<Bomba> i = bombas.elements();
		boolean encontrou = false;
		Bomba resposta = null; 
		while (i.hasMoreElements() && !encontrou) {
			Bomba temp = i.nextElement();
			if (temp.getNumero() == numero){
				resposta = temp;
				encontrou = true;
			}
		}
		
		return resposta;
	}
	
	public Bico obterBico(int numero) {
		Enumeration<Bico> i = bicos.elements();
		boolean encontrou = false; 
		Bico resposta = null; 
		while (i.hasMoreElements() && !encontrou) {
			Bico temp = i.nextElement();
			if (temp.getNumero() == numero){
				resposta = temp;
				encontrou = true;
			}
		}
		
		return resposta;
	}
	
	
	public int getNumero() {
		return numero;
	}
	
	public int getStatus(){
		return status;
	}
	
}
