import static org.junit.Assert.*;

import org.junit.Test;

public class testSumOdds {

	@Test
	public void equals() {
		
		assertEquals(25,LabWorks.testSumOdds(10));
		
	}
	
	@Test
	public void notSame() {
		
		assertNotSame(26,LabWorks.testSumOdds(10));
		
		
	}

}
