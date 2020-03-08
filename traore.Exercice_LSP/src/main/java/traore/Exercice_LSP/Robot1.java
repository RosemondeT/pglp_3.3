package traore.Exercice_LSP;

/**
 * Classe Robot1 qui est une classe fille de la classe Robot
 */

public class Robot1 extends Robot {
	public Robot1(int position, int pas) {
		super(position, pas);
	}
	
	public void avance() {
		super.position+=20;
	}


}
