package inte_cont;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FIFOTest {


	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAdd() {
		FIFO fifo = new FIFO();
		int size = 0;
		
		fifo.add(8);
		assertEquals(1, size+1);
	
		fifo.add(2);
		assertEquals(2, size+2);
	}

	@Test
	void testFirst() {
		FIFO fifo = new FIFO();
		fifo.add(1);
		
		assertTrue(1 == fifo.first());
	}

	@Test
	void testIsEmpty() {
		FIFO fifo = new FIFO();
		
		assertTrue(fifo.isEmpty());
		
		fifo.add(475);
		assertFalse(fifo.isEmpty());
	}

	@Test
	void testRemoveFirst() {
		FIFO fifo = new FIFO();
		
		fifo.add(1);
		fifo.add(2);
		
		int resAttendu = fifo.first();
		assertEquals(1, resAttendu);
		
		fifo.removeFirst();
		resAttendu = fifo.first();
		assertEquals(2, resAttendu);
	}

	@Test
	void testSize() {
		FIFO fifo = new FIFO();
		fifo.add(1);
		fifo.add(100);
		
		assertTrue(2 == fifo.size());
		assertEquals(2, fifo.size());
		
		fifo.add(466);
		assertEquals(3, fifo.size());
	}

}
