import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;


public class BombaTest {

	Bomba b1 = new Bomba(1), 
	      b2 = new Bomba(2),
		  b3 = new Bomba(3),
		  b4 = new Bomba(4), 
		  b5 = new Bomba(5),
		  b6 = new Bomba(6);
	
//	@Before
//	public void setUp(){
//		
//	}
	
	@Test
	public void testObterBomba() {
		Assert.assertEquals(b1, Bomba.obterBomba(1));
		Assert.assertEquals("Desligada", b1.getStatus());
		Assert.assertEquals(b2, Bomba.obterBomba(2));
		Assert.assertEquals("Desligada", b2.getStatus());
		Assert.assertEquals(b3, Bomba.obterBomba(3));
		Assert.assertEquals("Desligada", b3.getStatus());
		Assert.assertEquals(b4, Bomba.obterBomba(4));
		Assert.assertEquals("Desligada", b4.getStatus());
		Assert.assertEquals(b5, Bomba.obterBomba(5));
		Assert.assertEquals("Desligada", b5.getStatus());
		Assert.assertEquals(b6, Bomba.obterBomba(6));
		Assert.assertEquals("Desligada", b6.getStatus());
	}

}
