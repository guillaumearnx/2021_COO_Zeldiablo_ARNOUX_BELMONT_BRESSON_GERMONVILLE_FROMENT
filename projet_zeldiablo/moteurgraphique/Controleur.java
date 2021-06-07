package moteurgraphique;

import jeu.utils.Direction;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

public class Controleur implements KeyListener {

    /**
     * Direction utile
     */
    private Direction enCours;

    /**
     * Direction a retourner
     */
    private Direction aRetourner;

    /**
     * Controlleur public par defaut
     */
    public Controleur() {
        enCours = null;
        aRetourner = null;
    }

    /**
     * Getter de commande
     * Return commande en cours
     */
    public Direction getDirection() {
        Direction retour = this.aRetourner;
        this.aRetourner = enCours;
        return retour;
    }

    @Override
    public void keyTyped(KeyEvent ignored) {
        //NOTHING
    }

    /**
     * Event keyPressed pour deplacer le joueur
     *
     * @param e event
     */
    @Override
    public void keyPressed(KeyEvent e) {
        switch (Character.toLowerCase(e.getKeyChar())) {
            // si on appuie sur 'q',commande joueur est gauche
            case 'q':
                this.enCours = Direction.WEST;
                this.aRetourner = Direction.WEST;
                break;
            // si on appuie sur 'd',commande joueur est droite
            case 'd':
                this.enCours = Direction.EAST;
                this.aRetourner = Direction.EAST;
                break;
            // si on appuie sur 'z',commande joueur est haut
            case 'z':
                this.enCours = Direction.NORTH;
                this.aRetourner = Direction.NORTH;
                break;
            // si on appuie sur 's',commande joueur est bas
            case 's':
                this.enCours = Direction.SOUTH;
                this.aRetourner = Direction.SOUTH;
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        this.enCours = null;
    }
}
