package traore.Exercice_LSP;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class RobotTest {
	ArrayList<Robot> Robots;
	
	
	
	@Before
	  public void setup() {
		Robots=new ArrayList<Robot>();
		Robots.add(new Robot1(15,5));
		Robots.add(new Robot2(30,10));	
		Robots.add(new RobotStatique(30,0));	
	}
	
	@Test
	public void AvanceTousTest() {
		ArrayList<Robot> Robots=new ArrayList<Robot>();
		Robots.add(new Robot1(20,4));
		Robots.add(new Robot2(10, 3));
		Robots.add(new RobotStatique(9,0));
		for(int i=0;i<Robots.size();i++)
			Robots.get(i).avance();
		for(int i=0;i<Robots.size();i++)
			System.out.println("position Robot de type "+(i+1)+Robots.get(i).position);
	}
	
	

}