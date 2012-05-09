import static org.junit.Assert.*;

import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;


public class VendaTest {

	Bomba b2 = new Bomba(2);
	
	int codigoVenda = 1;
	int bomba = 2 ; 
	Venda v = new Venda(new Date(2012,05,02), codigoVenda, bomba); 
	
	@Test
	public void testeCriacaoVenda() {
		Assert.assertEquals(Venda.NAO_INICIADA, v.getStatus());
	}
	
	@Test 
	public void testeCodigoCartao() {
		Assert.assertEquals(codigoVenda, v.getCodigoCartao());
	}
	
	@Test
	public void atribuirBomba() {
		Assert.assertEquals(Bomba.obterBomba(2).getNumero(), v.getBomba().getNumero());
	}
	
	@Test
	public void alterarStatus() {
		Assert.assertEquals(Venda.NAO_INICIADA, v.getStatus());
		
		v.alteraStatus(Venda.INICIADA);
		Assert.assertEquals(Venda.INICIADA, v.getStatus());
		
		v.alteraStatus(Venda.NAO_INICIADA);
		Assert.assertEquals(Venda.NAO_INICIADA, v.getStatus());
		Assert.assertEquals(-1, v.alteraStatus(Venda.ABASTECENDO));
		Assert.assertEquals(-1, v.alteraStatus(Venda.FINALIZADO));
		Assert.assertEquals(-1, v.alteraStatus(Venda.PAGO));
		Assert.assertEquals(Venda.NAO_INICIADA, v.getStatus());
		
		v.alteraStatus(Venda.INICIADA);
		Assert.assertEquals(Venda.INICIADA, v.getStatus());
		Assert.assertEquals(-1, v.alteraStatus(Venda.FINALIZADO));
		Assert.assertEquals(-1, v.alteraStatus(Venda.PAGO));
		
		
	}
}
