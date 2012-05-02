import java.util.Vector;

import junit.framework.Assert;

import org.junit.Test;


public class BombaTest {
	
	Vector<Reservatorio> r = new Vector<Reservatorio>();

	Bomba b1 = new Bomba(1,r), 
	      b2 = new Bomba(2,r),
		  b3 = new Bomba(3,r),
		  b4 = new Bomba(4,r), 
		  b5 = new Bomba(5,r),
		  b6 = new Bomba(6,r);
	
//	@Before
//	public void setUp(){
//		
//	}
	
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

}
