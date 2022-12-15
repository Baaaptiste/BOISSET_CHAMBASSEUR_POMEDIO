/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demineur_boisset_chabasseur_pomedio;

import java.util.Random;

/**
 *
 * @author bapti 
 */
public class Partie {
    private PlateauDeJeu plateau  = new PlateauDeJeu(); 
     
    
    public void placerBombeAlea(){
        Random r = new Random();
        int i=0;
        while (i!=30){
            int ligne = r.nextInt(20);
            int colonne = r.nextInt(20);
            if (plateau.presenceBombe(ligne,colonne)==false){
                plateau.placerBombe(ligne,colonne);
                i+=1;
            }
        }
    } 
    
    public void initialiserPartie(){
        plateau.viderGrille();
        placerBombeAlea();
    }

}
