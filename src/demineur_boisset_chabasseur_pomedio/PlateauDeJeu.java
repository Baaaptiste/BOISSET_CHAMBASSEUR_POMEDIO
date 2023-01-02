/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demineur_boisset_chabasseur_pomedio;

/**
 *
 * @author bapti
 */
public class PlateauDeJeu {

    CelluleDeGrille[][] grille = new CelluleDeGrille[20][20];

    public PlateauDeJeu() {
        for (int ligne = 0; ligne < 20; ligne++) {
            for (int colonne = 0; colonne < 20; colonne++) {
                grille[ligne][colonne] = new CelluleDeGrille();
            }
        }
    }

    public boolean presenceBombe(int ligne, int colonne) {
        return grille[ligne][colonne].presenceBombe();
    }

    public void placerBombe(int ligne, int colonne) {
        grille[ligne][colonne].placerBombe();
        for (int i = ligne - 1; i <= ligne + 1; i++) {
            if (i < 0) {
                i++;
            }
            if (i >= 20) {
                break;
            }
            for (int j = colonne - 1; j <= colonne + 1; j++) {
                if (j < 0) {
                    j++;
                }
                if (j >= 20) {
                    break;
                }
                if (grille[i][j].presenceBombe() == false) { // revoir les indices
                    grille[i][j].incrementerCase();
                }
            }
        }
    }

    public boolean presenceDrapeau(int ligne, int colonne) {
        return grille[ligne][colonne].presenceDrapeau();
    }
    
    public void DecouvrirCase() {
        for (int ligne = 0; ligne < 20; ligne++) {
            for (int colonne = 0; colonne < 20; colonne++) {
                grille[ligne][colonne].lirelacase();
            }
        }
    }

    public void placerDrapeau(int ligne, int colonne) {
        grille[ligne][colonne].placeDrapeau();
    }

    public int presenceChiffre(int ligne, int colonne) {
        return grille[ligne][colonne].getValChiffre();
    }

    public void viderGrille() {
        for (int ligne = 0; ligne < 20; ligne++) {
            for (int colonne = 0; colonne < 20; colonne++) {
                grille[ligne][colonne].retirerDrapeau();
                grille[ligne][colonne].retirerBombe();
                grille[ligne][colonne].initChiffre();
                grille[ligne][colonne].initlacase();
                grille[ligne][colonne].initPartiePerdue();
            }
        }
    }

    
    public void demasquerCasesAutour(int ligne, int col) {
        int nb_bombes = 0;
        for (int i = ligne - 1; i <= ligne + 1; i++) {
            if (i < 0) {
                i++;
            }
            if (i >= grille.length) {
                break;
            }
            for (int j = col - 1; j <= col + 1; j++) {
                if (j < 0) {
                    j++;
                }
                if (j >= grille.length) {
                    break;
                }
                if (grille[i][j].presenceBombe()) {
                    nb_bombes++;
                }
                if (nb_bombes==0){
                    grille[i][j].setCache(true);                 
                }
            }
        }
    }

    public void demasquerCases() {
        for (int k = 0; k < grille.length; k++) { //on repete plusieurs fois l'action pour traiter toutes les cases
            for (int i = 0; i < grille.length; i++) {
                for (int j = 0; j < grille.length; j++) {
                    if (grille[i][j].isLacase() == false) {
                        if (grille[i][j].getValChiffre()==0){                           
                            demasquerCasesAutour(i, j);
                        }                    
                    }
                }
            }
        }
    }
    
    public boolean partieGagnante() {
        boolean win = true; //on part du principe que la partie est gagnante, et on cherche une  bombe non marquee par un drapeau
        for (int i = 0; i < grille.length; i++) {
            for (int j = 0; j < grille.length; j++) {
                if (grille[i][j].presenceBombe()) {
                    if (grille[i][j].presenceDrapeau() == false) {
                        win = false;
                    }
                }
            }

        }
        return win;
    }
    

    
}
