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
        for (int ligne=0; ligne<10; ligne++){
            for (int colonne=0; colonne<10; colonne++){
                grille[ligne][colonne] = new CelluleDeGrille();
            }
        }
    }
    
    public boolean presenceBombe(int ligne, int colonne){
        return grille [ligne][colonne].presenceBombe();
    }

    public void placerBombe(int ligne, int colonne){
        grille[ligne][colonne].placerBombe();
        for (int i = ligne-1; i<= ligne + 1; i++){
            if (i<0)i++;
            if (i>=10)break;
            for (int j = colonne-1; j<= colonne + 1; j++){
                if (j<0)i++;
                if (j>=10)break;
                grille[i][j].incrementerCase();
            }
        }
    }
    
    public boolean presenceDrapeau(int ligne, int colonne){
        return grille [ligne][colonne].presenceDrapeau();
    }

    public void placerDrapeau(int ligne, int colonne){
        grille[ligne][colonne].placerDrapeau();
    }
    public int presenceChiffre(int ligne, int colonne){
        return grille [ligne][colonne].lireChiffre();
    }  
    
    public void viderGrille(){
        for (int ligne = 0; ligne<10;ligne++){
            for (int colonne = 0; colonne<10;colonne++){
                grille [ligne][colonne].retirerDrapeau();
                grille [ligne][colonne].retirerBombe();
                grille [ligne][colonne].initChiffre();                
            }

        }
    }

}
