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

    private int valChiffre;
    private boolean avoirBombe;
    private boolean avoirDrapeau;
    private boolean lacase;
    private boolean perdue;
    
    public CelluleDeGrille() {
        this.avoirBombe = false;
        this.avoirDrapeau = false;
        this.lacase = false;
        this.perdue = false;
    }

    public void placerBombe() {
        avoirBombe = true;
    }

    public void placeDrapeau() {
        avoirDrapeau = true;
    }

    public void retirerDrapeau() {
        avoirDrapeau = false;
    }

    public void retirerBombe() {
        avoirBombe = false;
    }

    public void initChiffre() {
        valChiffre = 0;
    }

    public void incrementerCase() {
        valChiffre += 1;
    }

    public boolean presenceBombe() {
        if (avoirBombe == false) {
            return false;
        } else {
            return true;
        }
    }

    public boolean presenceDrapeau() {
        if (avoirDrapeau == false) {
            return false;
        } else {
            return true;
        }
    }

    public boolean lirelacase() {
        return lacase = true;
    }

    public boolean initlacase() {
        return lacase = false;
    }

    public boolean isLacase() {
        return lacase;
    }

    public int getValChiffre() {
        return valChiffre;
    }

    public boolean PartiePerdue() {
        return perdue = true;
    }

    public boolean initPartiePerdue() {
        return perdue = false;
    }

    public boolean isPerdue() {
        return perdue;
    }

    public boolean isAvoirDrapeau() {
        return avoirDrapeau;
    }
    
    
    public void setCache(boolean cache) {
        this.lacase = cache;
    }
    
   
}
