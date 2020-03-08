package traore.Exercice_LSP;

/**
 * Classe Robot qui possède la méthode à savoir avance()
 */
public class Robot {
	protected int position;
	protected int pas;
	
	public Robot(int position, int pas) {
		this.position=position;
		this.pas=pas;
	}
	
	/**
	 * Methode avance() qui augmente la position actuelle du robot
	 *  en plus ajoutant le nombre de pas qu'il a eu a effectué
	 */
	
	public void avance() {
		this.position+=pas;
	}
}
