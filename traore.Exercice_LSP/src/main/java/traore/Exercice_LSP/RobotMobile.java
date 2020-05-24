package traore.Exercice_LSP;

/**
 * 
 * Classe Robot1 qui herite de la methode DeplacementRobot
 *
 */

public class RobotMobile extends Robot {

	/**
	 * position du robot
	 */
	private Position p;
	
	/**
	 * direction du robot
	 */
	private Direction d;
	
	public RobotMobile(Direction d, Position p) {
		this.d = d;
		this.p = p;
	}
	
	public Position getPosition() {
		return this.p;
	}
	
	public Direction getDirection() {
		return this.d;
	}
	
	/**
	 * avancement d'un pas
	 */
	@Override
	public void avance(Direction direction) {
		
		if(direction == Direction.Haut) {
			this.p.setY(this.p.getY()+1);
		}
		else if(direction == Direction.Bas) {
			this.p.setY(this.p.getY()-1);
		}
		else if(direction == Direction.Gauche) {
			this.p.setX(this.p.getX()-1);
		}
		else if(direction == Direction.Droite) {
			this.p.setX(this.p.getX()+1);
		}else {
			System.out.println("this direction not exist");
		}
    }
	
	/**
	 * changement d'orientation d'un robot
	 */
	@Override
	public void tourne(Direction direction) {
		
		if(direction == Direction.Haut) {
			this.d = Direction.Haut;
		}
		else if(direction == Direction.Bas) {
			this.d = Direction.Bas;
		}
		else if(direction == Direction.Gauche) {
			this.d = Direction.Gauche;
		}
		else if(direction == Direction.Droite) {
			this.d = Direction.Droite;
		}else {
			System.out.println("this direction not exist");
		}

	}
	

}
