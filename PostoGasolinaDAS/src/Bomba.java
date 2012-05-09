import java.util.Enumeration;
import java.util.Vector;


public class Bomba {

	public static final int DESLIGADA = 0; 
	public static final int ATIVADA = 1;
	public static final int DESATIVADA = 2;
	
	public static Vector<Bomba> bombas = new Vector<Bomba>();
	
	
	private int numero;
	private int status; 
	private Vector<Bico> bicos = new Vector<Bico>();
	
	
	public Bomba() {
		this.status = DESLIGADA; 
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
		
		if (encontrou == false) {
			resposta = new Bomba(numero);
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
	
	
	public int alterarStatus(int status) {
		switch (this.status) {
		case DESLIGADA: 
			if (status == DESLIGADA)
				this.status = DESLIGADA;
			else if (status == ATIVADA)
				this.status = ATIVADA;
			else return -1;
		break;
		
		case ATIVADA:
			if (status == ATIVADA)
				this.status = ATIVADA;
			else if (status == DESATIVADA)
				this.status = DESATIVADA;
			else return -1;
		break;
		
		case DESATIVADA:
			if (status == DESATIVADA)
				this.status = DESATIVADA;
			else return -1;
		break;
		}
		
		return this.status;
	}
	
	
	
	
	
	
	
	
	public int getNumero() {
		return numero;
	}
	
	public int getStatus(){
		return status;
	}
	
	public static Vector<Bomba> obterBombas(){
		return bombas;
	}
	
}
