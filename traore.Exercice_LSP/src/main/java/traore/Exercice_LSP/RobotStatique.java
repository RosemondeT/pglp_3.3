package traore.Exercice_LSP;

/**
 * 
 * Classe RoboStatique qui hérite de la méthode Robot
 *
 */
public class RobotStatique extends Robot {

	/**
	 * direction 
	 */
	private Direction d;
	
	/**
	 * position
	 */
	private Position p;
	
	public RobotStatique(Position p, Direction d) {
		this.p = p;
		this.d = d;
	}
	
	
	/**
	 * obtenir la positon
	 * @return
	 */
	public Position getP() {
		return this.p;
	}
	
	/**
	 * obtenir la direciton
	 * @return
	 */
	public Direction getD() {
		return this.d;
	}

	@Override
	public void tourne(Direction d) {
		System.out.println("this robot don't tourne");
		
	}

	@Override
	public void avance(Direction d) {
		// TODO Auto-generated method stub
		System.out.println("this robot can not move");
		
	}

}
