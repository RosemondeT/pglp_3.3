package traore.Exercice_LSP;

import java.util.ArrayList;

/**
 * 
 * Classe AllRobot  qui contient la méthode avancerTous
 *
 */

public class AllRobot{
	ArrayList <Robot1> listRobot;
	

	public AllRobot() {
		listRobot =  new ArrayList<Robot1>();
		
	}
	
	/**
	 * Méthode avanceTous() concerne seulement les robots qui bougent
	 */
	
	
	public void avancerTous() {

		for(Robot1 r: listRobot){
		 r.avance();
		}
	}


}
