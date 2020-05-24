package traore.Exercice_LSP;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPosition {

	/**
	 * test construction Position
	 */
	@Test
	public void testConstruction() {
		Position p = new Position(2, 4);
		assertNotNull(p);
		assertTrue(p.getX() == 2 
					&& p.getY() == 4);
	}

}
