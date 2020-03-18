package traore.Exercice_LSP;


import org.junit.Before;
import org.junit.Test;


public class RobotTest {
	
	AllRobot TousRobots;
	
	
	
	@Before
	  public void setup() {
		
		TousRobots=new AllRobot();
		
	}
	
	@Test
	public void AvanceTousTest() {
		TousRobots.avancerTous();
	}
	
	

}