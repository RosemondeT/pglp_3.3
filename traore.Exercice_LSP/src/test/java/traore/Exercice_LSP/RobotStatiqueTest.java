package traore.Exercice_LSP;

import static org.junit.Assert.*;

import org.junit.Test;

public class RobotStatiqueTest {

	@Test
	public void testConstructeur() {
		RobotStatique r = new RobotStatique(new Position(4, 5), Direction.Bas);
		assertNotNull(r);
	}
	
	@Test
	public void testTourner() {
		RobotStatique r = new RobotStatique(new Position(4, 5), Direction.Haut);
		r.tourne(Direction.Bas);
		assertTrue(r.getD() == Direction.Haut);
	}
	
	@Test
	public void testAvancer() {
		RobotStatique r = new RobotStatique(new Position(4, 5), Direction.Haut);
		r.avance(Direction.Bas);
		assertTrue(r.getP().getY() == 5);
	}

}
