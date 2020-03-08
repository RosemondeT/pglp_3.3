package traore.Exercice_LSP;

/*
* Classe Robot2 qui est une classe fille de la classe Robot
*/

public class Robot2 extends Robot{
	public Robot2(int position, int pas) {
		super(position, pas);
	}
	
	public void avance() {
		super.position+=pas;
	}

}
