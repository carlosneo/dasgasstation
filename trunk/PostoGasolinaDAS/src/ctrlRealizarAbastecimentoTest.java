import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ctrlRealizarAbastecimentoTest {

	ctrlRealizarAbastecimento controladora;
	
	@Before
	public void setUP() {
		controladora = new ctrlRealizarAbastecimento();
	}
	
	@After 
	public void tearDown(){
		Bomba.bombas.clear();
	}
	
	/**ok - Uma instancia v de Venda tem que ser criada.
	 * ok - O atributo v.codigoCartao torna-se o valor lido pela leitora de c—digo de barras
	 * ok - Uma instancia b de bomba tem que ser obtida a partir da correspondencia com o valor da bomba informado
	 * ok - Uma instancia bi de bico tem que ser obtida a partir da correspondencia com o valor do bico informado
	 * ok- O atributo bi.status torna-se "Abastecendo"
	 * ok - O atributo b.status torna-se "Ativo"
	 * ok - A instancia b de bomba Ž vinculada ˆ inst‰ncia v de Venda
	 * O atributo v.status torna-se "Iniciada"
	 * */
	@Test
	public void testIniciarVenda() {
		controladora.iniciarNovaVenda(2, 1, 13, new Date(2012, 5, 9));
		Venda v = controladora.getVenda();
		
		
		
		Assert.assertNotNull(v);
		Assert.assertEquals(13, v.getCodigoCartao());
		Assert.assertSame(Bomba.obterBomba(2), controladora.getBomba());
		Assert.assertEquals(1, controladora.getBico().getNumero());
		Assert.assertEquals(Bico.ABASTECENDO, controladora.getBico().getStatus());
		Assert.assertEquals(Bomba.ATIVADA, controladora.getBomba().getStatus());
		assertNotNull(v.getBomba());
		Assert.assertEquals(Venda.INICIADA, v.getStatus());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
