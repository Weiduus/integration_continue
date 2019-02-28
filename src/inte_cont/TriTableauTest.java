package inte_cont;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TriTableauTest {

	private int[] tab = { 5, 8, 15, 21, 25, 12, 1, 4, 18 };
	private TriTableau tb;
	
	@BeforeEach
	void setUp() throws Exception {
		tb = new TriTableau();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testTriCroissant() {
		
		int[] tabResultatCroissant = { 1, 4, 5, 8, 12, 15, 18, 21, 25 };
		int[] tabTriCroissant = tab;
		
		tb.triCroissant(tabTriCroissant);
		assertArrayEquals(tabResultatCroissant, tabTriCroissant);	
	}
	
	@Test
	void testTriDecroissant() {
		int[] tabResultatDecroissant = { 25, 21, 18, 15, 12, 8, 5, 4, 1 };
		int[] tabTriDecroissant = tab;
		
		tb.triDecroissant(tabTriDecroissant);
		assertArrayEquals(tabResultatDecroissant, tabTriDecroissant);
	}

}
