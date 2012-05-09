import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class BicoTest {

	Bico b1 = new Bico(); 
	
	@Test
	public void testAlterarStatus() {
		Assert.assertEquals(Bico.DESLIGADO, b1.alterarStatus(Bico.DESLIGADO));
		Assert.assertEquals(Bico.ABASTECENDO, b1.alterarStatus(Bico.ABASTECENDO));
		Assert.assertEquals(Bico.DESLIGADO, b1.alterarStatus(Bico.DESLIGADO));
		Assert.assertEquals(Bico.ABASTECENDO, b1.alterarStatus(Bico.ABASTECENDO));
		Assert.assertEquals(Bico.TRAVADO, b1.alterarStatus(Bico.TRAVADO));
	}

}
