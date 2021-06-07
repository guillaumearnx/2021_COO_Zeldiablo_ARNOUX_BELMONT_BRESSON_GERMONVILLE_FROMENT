package jeu.entites;

import jeu.Labyrinthe;
import jeu.cases.Porte;

/**
 * Classe modelisant un Joueur
 *
 * @author AGJMX
 */

public class Joueur extends Personnage {

    /**
     * Constructeur public par defaut a deux parametres
     *
     * @param l Labyrinthe sur lequel il joue
     * @param e Point d'apparition
     */
    public Joueur(Labyrinthe l, Porte e) {
        super(l, e, 20, 4);
        e.setFerme(true);

    }

    public Joueur(Labyrinthe l, Porte e, int pv, int atk){
        super(l, e, pv, atk);
        e.setFerme(true);
    }





}
