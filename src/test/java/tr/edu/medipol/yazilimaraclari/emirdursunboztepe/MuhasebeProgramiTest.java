package tr.edu.medipol.yazilimaraclari.emirdursunboztepe;

import org.junit.Assert;
import org.junit.Test;

import tr.edu.medipol.yazilimaraclari.emirdursunboztepe.MuhasebeProgrami.Ucret;

public class MuhasebeProgramiTest {
	
	@Test
	public void testUcretHesapla() {
		int calisilanSaat = 5;
		int saatlikUcret = 25;
		
		String ucretHesaplaSonuc = MuhasebeProgrami.ucretHesapla(calisilanSaat, saatlikUcret);
		
		Assert.assertEquals("5 * 25 = 125", ucretHesaplaSonuc);
	}
}
