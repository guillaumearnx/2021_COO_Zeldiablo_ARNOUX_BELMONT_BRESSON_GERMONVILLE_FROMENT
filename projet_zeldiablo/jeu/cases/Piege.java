package jeu.cases;

import jeu.entites.Joueur;


/**
 * Classe modelisant un Piege
 *
 * @author AGJMX
 */
public class Piege extends Obstacle {

    /**
     * Constructeur public par defaut a deux parametres
     *
     * @param x abscisse
     * @param y ordonnee
     */
    public Piege(int x, int y) {
        super(x, y);
    }

    /**
     * Methode pour verifier si un personnage peut passer sur cette classe
     *
     * @return booleen, a vrai si peut passer dessus
     */
    @Override
    public boolean peutTraverser() {
        return true;
    }

    /**
     * Methode retirant 1pv du joueur
     * @param j joueur auquel on retire 1pv
     */
    public void prendDegats(Joueur j) {
        j.diminuerVie(1);
    }
}
