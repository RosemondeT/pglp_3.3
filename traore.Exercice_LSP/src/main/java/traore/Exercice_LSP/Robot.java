package traore.Exercice_LSP;

/**
 * Classe Robot qui possède deux attributs à savoir la direction et la position
 */
public abstract class Robot {
	
	/**
	 * Méthode tourne() qui permet au robot de changer de direction
	 */
	public abstract void tourne(Direction d);
	
	/**
	 * Methode avance() qui augmente la position actuelle du robot
	 *  en plus ajoutant le nombre de pas qu'il a eu a effectué
	 */
	public abstract void avance(Direction d);
	

}
