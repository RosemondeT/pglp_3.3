package traore.Exercice_LSP;

import java.util.ArrayList;

/**
 * 
 * Classe AllRobot  qui contient la méthode avancerTous
 *
 */

public class TousLesRobots{
	ArrayList <RobotMobile> listRobot;
	

	public TousLesRobots() {
		listRobot =  new ArrayList<RobotMobile>();
		
	}
	
	/**
	 * Méthode avanceTous() concerne seulement les robots qui bougent
	 */
	
	/**
	 * add robot on robot list
	 * @param r1
	 */
	public void add(RobotMobile r1) {
		listRobot.add(r1);
	}
	
	public void avancerTous(Direction d) {
		for(RobotMobile r: listRobot){
		 r.avance(d);
		}
	}


	
	
	/**
	 * turn all robot in same time
	 * @param d
	 */
	public void tournerTous(Direction d) {
		for (RobotMobile robotMobile : listRobot) {
			robotMobile.tourne(d);
		}
	}


}
