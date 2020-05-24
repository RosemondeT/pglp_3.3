package traore.Exercice_LSP;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RobotMobileTest {

	@Before
	public void testConstruteur() {
		RobotMobile r = new RobotMobile(Direction.Haut, new Position(2, 4));
		assertNotNull(r);
	}
	
	@Test
	public void testTourner() {
		RobotMobile r = new RobotMobile(Direction.Haut, new Position(2, 4));
		r.tourne(Direction.Bas);
		assertTrue(r.getDirection() == Direction.Bas);
	}
	
	@Test
	public void testAvancer() {
		RobotMobile r = new RobotMobile(Direction.Haut, new Position(2, 4));
		r.avance(Direction.Bas);
		assertTrue(r.getPosition().getY() == 3);
	}

}
