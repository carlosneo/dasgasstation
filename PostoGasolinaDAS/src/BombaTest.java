import static org.junit.Assert.*;

import java.util.Enumeration;
import java.util.Vector;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class BombaTest {

	Bomba b1, b2, b3, b4, b5, b6;
	
	@After
	public void tearDown(){
		
		Bomba.bombas.clear();
		
	}
	
	
	Bico bi1 = new Bico(1), 
		 bi2 = new Bico(2), 
		 bi3 = new Bico(3), 
		 bi4 = new Bico(4);
	
	
	@Before
	public void setUP() {
		b1 = new Bomba(1);
		b2 = new Bomba(2);
		b3 = new Bomba(3);
		b4 = new Bomba(4); 
		b5 = new Bomba(5);
		b6 = new Bomba(6);
	}
	
	@Test
	public void testObterBomba() {
		
		Assert.assertEquals(b1, Bomba.obterBomba(1));
		Assert.assertEquals(Bomba.DESLIGADA, b1.getStatus());
		Assert.assertEquals(b2, Bomba.obterBomba(2));
		Assert.assertEquals(Bomba.DESLIGADA, b2.getStatus());
		Assert.assertEquals(b3, Bomba.obterBomba(3));
		Assert.assertEquals(Bomba.DESLIGADA, b3.getStatus());
		Assert.assertEquals(b4, Bomba.obterBomba(4));
		Assert.assertEquals(Bomba.DESLIGADA, b4.getStatus());
		Assert.assertEquals(b5, Bomba.obterBomba(5));
		Assert.assertEquals(Bomba.DESLIGADA, b5.getStatus());
		Assert.assertEquals(b6, Bomba.obterBomba(6));
		Assert.assertEquals(Bomba.DESLIGADA, b6.getStatus());
	}
	
	@Test
	public void testObterBico() {
		Assert.assertEquals(1, b1.obterBico(1).getNumero());
		Assert.assertEquals(1, b2.obterBico(1).getNumero());
		Assert.assertEquals(1, b3.obterBico(1).getNumero());
		Assert.assertEquals(1, b4.obterBico(1).getNumero());
		Assert.assertEquals(1, b5.obterBico(1).getNumero());
		Assert.assertEquals(1, b6.obterBico(1).getNumero());
		
		Assert.assertEquals(2, b1.obterBico(2).getNumero());
		Assert.assertEquals(2, b2.obterBico(2).getNumero());
		Assert.assertEquals(2, b3.obterBico(2).getNumero());
		Assert.assertEquals(2, b4.obterBico(2).getNumero());
		Assert.assertEquals(2, b5.obterBico(2).getNumero());
		Assert.assertEquals(2, b6.obterBico(2).getNumero());
		
		Assert.assertEquals(3, b1.obterBico(3).getNumero());
		Assert.assertEquals(3, b2.obterBico(3).getNumero());
		Assert.assertEquals(3, b3.obterBico(3).getNumero());
		Assert.assertEquals(3, b4.obterBico(3).getNumero());
		Assert.assertEquals(3, b5.obterBico(3).getNumero());
		Assert.assertEquals(3, b6.obterBico(3).getNumero());
		
		Assert.assertEquals(4, b1.obterBico(4).getNumero());
		Assert.assertEquals(4, b2.obterBico(4).getNumero());
		Assert.assertEquals(4, b3.obterBico(4).getNumero());
		Assert.assertEquals(4, b4.obterBico(4).getNumero());
		Assert.assertEquals(4, b5.obterBico(4).getNumero());
		Assert.assertEquals(4, b6.obterBico(4).getNumero());
	}
	
	@Test
	public void testAlterarStatus(){
		Assert.assertEquals(Bomba.DESLIGADA, b1.alterarStatus(Bomba.DESLIGADA));
		Assert.assertEquals(Bomba.ATIVADA, b1.alterarStatus(Bomba.ATIVADA));
		Assert.assertEquals(-1, b1.alterarStatus(Bomba.DESLIGADA));
		Assert.assertEquals(Bomba.ATIVADA, b1.alterarStatus(Bomba.ATIVADA));
		Assert.assertEquals(Bomba.DESATIVADA, b1.alterarStatus(Bomba.DESATIVADA));
		Assert.assertEquals(-1, b1.alterarStatus(Bomba.ATIVADA));
		Assert.assertEquals(-1, b1.alterarStatus(Bomba.DESLIGADA));
	}

}
