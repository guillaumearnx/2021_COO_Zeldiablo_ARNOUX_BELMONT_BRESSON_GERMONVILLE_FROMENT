package jeu.entites;

import jeu.JeuPerso;
import jeu.Labyrinthe;
import jeu.cases.Case;
import moteurgraphique.DessinJeu;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;

/**
 * Classe modelisant un troll
 *
 * @author AGJMX
 */
public class Troll extends Monstre {

    Image texture;

    /**
     * booleen qui permet de determiner si le troll a ete tape dans le tour
     */
    private boolean tapeDansLeTour;

    /**
     * Constructeur public par defaut a deux parametres
     *
     * @param l      labyrinthe
     * @param depart position de depart
     */
    public Troll(Labyrinthe l, Case depart) throws IOException {
        super(l, depart, 3, 3, 5);
        tapeDansLeTour = false;
        texture =  ImageIO.read(new File(JeuPerso.assetsDirectory,"TrollContour.png"));
    }

    /**
     * Methode qui permet de regenerer le troll s'il n'a pas ete tape
     */
    public void seRegenerer() {
        if (!tapeDansLeTour) {
            this.augmenterVie(1);
        }

    }

    @Override
    public boolean isTroll() {
        return true;
    }

    /**
     * Methode qui change l'etat attaque du troll
     */
    public void trollSeFaitAttaquer() {
        tapeDansLeTour = true;
    }

    @Override
    public boolean peutTraverserChemin() {
        return true;
    }

    @Override
    public boolean peutTraverserMur() {
        return false;
    }

    @Override
    public boolean peutTraverserPiege() {
        return true;
    }

    @Override
    public boolean peutTraverserPorte() {
        return false;
    }

    @Override
    public boolean isJoueur() {
        return false;
    }

    /**
     * Methode dessiner
     *
     * @param crayon graphics
     */
    @Override
    public void dessiner(Graphics2D crayon) {
        crayon.drawImage(texture, getCase().x * DessinJeu.TAILLE_CASE, getCase().y * DessinJeu.TAILLE_CASE,DessinJeu.TAILLE_CASE,DessinJeu.TAILLE_CASE, null);
    }
}
