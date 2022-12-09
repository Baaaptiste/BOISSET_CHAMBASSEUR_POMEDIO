/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demineur_boisset_chabasseur_pomedio;

/**
 *
 * @author bapti
 */
public class CelluleDeGrille {
    private int Chiffres;
    private boolean avoirBombe;
    private boolean avoirDrapeau;

    public CelluleDeGrille() {
        this.Chiffres = 0;
        this.avoirBombe = false;
        this.avoirDrapeau = false;
    }
    
    public void placerBombe(){
        avoirBombe = true;
    }
    public void placerDrapeau(){
        avoirDrapeau = true;
    }
    public void retirerDrapeau(){
        avoirDrapeau = false;
    }
    public boolean presenceBombe(){
        if (avoirBombe==false){
            return false ;
        }
        else{
            return true ;
        }
    }
    public boolean presenceDrapeau(){
        if (avoirDrapeau==false){
            return false ;
        }
        else{
            return true ;
        }
    }    
}
