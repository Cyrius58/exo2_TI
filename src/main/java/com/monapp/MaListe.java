package com.monapp;
import java.util.ArrayList;

/**
 * Classe MaListe qui permet de gérer une liste d'entiers.
 */
public class MaListe {

    private ArrayList<Integer> liste;

    /**
     * Constructeur par défaut. Initialise une nouvelle liste vide.
     */
    public MaListe() {
        this.liste = new ArrayList<>();
    }

    /**
     * Ajoute un élément à la fin de la liste.
     * 
     * @param element l'entier à ajouter à la liste.
     */
    public void ajouter(int element) {
        liste.add(element);
    }

    /**
     * Supprime un élément à un index donné.
     * 
     * @param index l'index de l'élément à supprimer.
     * @throws IndexOutOfBoundsException si l'index est invalide.
     */
    public void retirer(int index) throws IndexOutOfBoundsException {
        if(index < 0 || index >= liste.size()) {
            throw new IndexOutOfBoundsException("Index hors des limites");
        }
        liste.remove(index);
    }

    /**
     * Trouve l'index du premier élément correspondant dans la liste.
     * 
     * @param element l'élément à trouver.
     * @return l'index de l'élément trouvé, ou -1 s'il n'est pas trouvé.
     */
    public int trouver(int element) {
        return liste.indexOf(element);
    }
}
