package traore.Exercice_LSP;

/**
 * Classe RobotStatique qui est une classe fille de la classe Robot
 * mais qui ne supporte pas la méthode avance()
 */

public class RobotStatique extends Robot{
	public RobotStatique(int position, int pas) {
		super(position, pas);
	}
	
	public void avance() {
		if (pas==0) {

			super.position+=pas;
		}
		else 
		throw new UnsupportedOperationException();
	}

}
