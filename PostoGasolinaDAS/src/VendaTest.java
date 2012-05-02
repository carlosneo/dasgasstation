import java.util.Date;

import junit.framework.Assert;

import org.junit.Test;


public class VendaTest {

	Venda v = new Venda(new Date(2012,05,02), 1); 
	
	@Test
	public void testeCriacaoVenda() {
		Assert.assertEquals("Não iniciada", v.getStatus());	
	}

	@Test
	public void atribuirBomba() {
		
	}
}
