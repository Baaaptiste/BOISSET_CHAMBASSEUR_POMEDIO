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
    CelluleDeGrille[][] grille = new CelluleDeGrille[10][10] ;
    
    public PlateauDeJeu() {
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                grille[i][j] = new CelluleDeGrille();
            }
        }
    }
    
    public boolean presenceBombe(int ligne, int colonne){
        return grille [ligne][colonne].presenceBombe();
    }

    public void placerBombe(int ligne, int colonne){
        grille[ligne][colonne].placerBombe();
    }
    
    public boolean presenceDrapeau(int ligne, int colonne){
        return grille [ligne][colonne].presenceDrapeau();
    }

    public void placerDrapeau(int ligne, int colonne){
        grille[ligne][colonne].placerDrapeau();
    }
}
