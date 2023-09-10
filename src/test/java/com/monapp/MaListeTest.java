package com.monapp;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Classe de test pour {@link MaListe}.
 * <p>
 * Cette classe contient des tests unitaires pour toutes les méthodes de la classe {@link MaListe}.
 * Chaque méthode est testée avec des cas typiques ainsi qu'avec des cas limites.
 * </p>
 * 
 * @author Victor Mauboussin
 * @version 1.0
 * @since 2023-09-10
 */
public class MaListeTest {

    /**
     * Instance de la classe {@link MaListe} qui sera utilisée pour les tests.
     */
    private MaListe maListe;

    /**
     * Initialisation effectuée avant chaque test.
     * <p>
     * Cette méthode instancie une nouvelle {@link MaListe} avant chaque test pour s'assurer que chaque test
     * est exécuté dans un environnement propre.
     * </p>
     */
    @BeforeEach
    public void setUp() {
        maListe = new MaListe();
    }

    /**
     * Teste la méthode {@link MaListe#ajouter(int)}.
     * <p>
     * Ce test vérifie si un élément est correctement ajouté à la liste. 
     * L'élément ajouté est ensuite recherché pour s'assurer de sa présence dans la liste.
     * </p>
     */
    @Test
    public void testAjouter() {
        maListe.ajouter(10);
        assertEquals(0, maListe.trouver(10));
    }

    /**
     * Teste la méthode {@link MaListe#retirer(int)}.
     * <p>
     * Cette section doit être remplie avec la logique appropriée du test pour la méthode retirer.
     * </p>
     */
    @Test
    public void testRetirer() {
        maListe.ajouter(10);
        maListe.ajouter(20);
        maListe.retirer(0);
        assertEquals(-1, maListe.trouver(10));
    }

    /**
     * Teste la méthode {@link MaListe#retirer(int)} avec un index hors des limites.
     * <p>
     * Ce test vise à vérifier le comportement de la méthode lorsque l'index donné n'est pas dans la plage valide.
     * Une exception {@link IndexOutOfBoundsException} est attendue.
     * </p>
     */
    @Test
    public void testRetirerIndexHorsLimites() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            maListe.retirer(5);
        });
    }

    /**
     * Teste la méthode {@link MaListe#trouver(int)} avec un élément qui existe déjà dans la liste.
     * <p>
     * Ce test vérifie si la méthode renvoie l'index correct pour un élément précédemment ajouté à la liste.
     * L'élément 10, par exemple, devrait se trouver à l'index 0.
     * </p>
     */
    @Test
    public void testTrouverElementExistant() {
        maListe.ajouter(10);
        assertEquals(0, maListe.trouver(10));
    }

    /**
     * Teste la méthode {@link MaListe#trouver(int)} avec un élément qui n'est pas présent dans la liste.
     * <p>
     * Ce test vérifie si la méthode renvoie -1 lorsqu'on recherche un élément non existant.
     * </p>
     */
    @Test
    public void testTrouverElementNonExistant() {
        assertEquals(-1, maListe.trouver(10));
    }
}
