import java.util.Enumeration;
import java.util.Vector;


public class Bomba {

	public static Vector<Bomba> bombas = new Vector<Bomba>();
	
	
	private int numero;
	private String status; 
	private Vector<Bico> bicos = new Vector<Bico>();
	
	
	public Bomba() {
		this.status = "Desligada"; 
		for (int i=1; i<=4; i++) {
			bicos.add(new Bico(i));
		}
	}
	
	
	public Bomba(int numero) {
		this();
		this.numero = numero;
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
	
	public String getStatus(){
		return status;
	}
	
}
