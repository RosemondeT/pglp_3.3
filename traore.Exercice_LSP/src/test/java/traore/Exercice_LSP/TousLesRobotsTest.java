package traore.Exercice_LSP;

import static org.junit.Assert.*;

import org.junit.Test;

public class TousLesRobotsTest {

	@Test
	public void testAvance() {
		
		RobotMobile r1 = new RobotMobile(Direction.Haut, new Position(2, 4));
		RobotMobile r2 = new RobotMobile(Direction.Gauche, new Position(3, 9));
		TousLesRobots l = new TousLesRobots();
		l.add(r1);
		l.add(r2);
		l.avancerTous(Direction.Haut);
		assertTrue(r1.getPosition().getY() == 5  
					&& r2.getPosition().getY() == 10);
	}
	
	@Test
	public void testTourne() {

		RobotMobile r1 = new RobotMobile(Direction.Haut, new Position(2, 4));
		RobotMobile r2 = new RobotMobile(Direction.Gauche, new Position(3, 9));
		TousLesRobots l = new TousLesRobots();
		l.add(r1);
		l.add(r2);
		l.tournerTous(Direction.Bas);
		assertTrue(r1.getDirection() == Direction.Bas
					&& r2.getDirection() == Direction.Bas);
		
	}

}