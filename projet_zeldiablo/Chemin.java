/**
 * Classe representant un chemin vide
 *
 * @author AGJMX
 */
public class Chemin extends Case {

    /**
     * Constructeur public par defaut a deux parametres
     *
     * @param x abscisse
     * @param y ordonnee
     */
    public Chemin(int x, int y) {
        super(x, y);
    }

    /**
     * Methode pour verifier si un personnage peut passer sur cette classe
     *
     * @return booleen, a vrai si "p" peut passer dessus
     */
    @Override
    public boolean peutTraverser(Personnage p) {
        switch (p.getClass().getName()) {
            case "Joueur":
                return true;
        }
        return false;
    }

}
