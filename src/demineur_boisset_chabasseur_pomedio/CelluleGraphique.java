/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demineur_boisset_chabasseur_pomedio;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author bapti
 */
public class CelluleGraphique extends JButton {

    CelluleDeGrille celluleAssociee;
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/images/0.png"));
    ImageIcon img_1 = new javax.swing.ImageIcon(getClass().getResource("/images/1.png"));
    ImageIcon img_2 = new javax.swing.ImageIcon(getClass().getResource("/images/2.png"));
    ImageIcon img_3 = new javax.swing.ImageIcon(getClass().getResource("/images/3.png"));
    ImageIcon img_4 = new javax.swing.ImageIcon(getClass().getResource("/images/4.png"));
    ImageIcon img_5 = new javax.swing.ImageIcon(getClass().getResource("/images/5.png"));
    ImageIcon img_6 = new javax.swing.ImageIcon(getClass().getResource("/images/6.png"));
    ImageIcon img_7 = new javax.swing.ImageIcon(getClass().getResource("/images/7.png"));
    ImageIcon img_8 = new javax.swing.ImageIcon(getClass().getResource("/images/8.png"));
    ImageIcon img_Bomb = new javax.swing.ImageIcon(getClass().getResource("/images/bomb.png"));
    ImageIcon img_BombDefused = new javax.swing.ImageIcon(getClass().getResource("/images/bombDefused.png"));
    ImageIcon img_BombExploded = new javax.swing.ImageIcon(getClass().getResource("/images/bombExploded.png"));
    ImageIcon img_BombWrongDefused = new javax.swing.ImageIcon(getClass().getResource("/images/bombWrongDefused.png"));
    ImageIcon img_cell = new javax.swing.ImageIcon(getClass().getResource("/images/cell.png"));
    ImageIcon img_icone = new javax.swing.ImageIcon(getClass().getResource("/images/icone.png"));

    public CelluleGraphique(CelluleDeGrille uneCellule) {
        celluleAssociee = uneCellule;
    }

    @Override
    public void paintComponent(Graphics G) {
        if (celluleAssociee.isLacase() == false) {
            try {
                super.paintComponent(G);
                Image img = ImageIO.read(new File("src/images/cell.png"));
                G.drawImage(img, 0, 0, 20, 20, this);
                this.setMaximumSize(new Dimension(40, 40));

            } catch (IOException ex) {
                Logger.getLogger(CelluleGraphique.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (celluleAssociee.isLacase() == true) {
            if (celluleAssociee.presenceBombe() == false && celluleAssociee.getValChiffre() == 0) {
                try {
                    super.paintComponent(G);
                    Image img = ImageIO.read(new File("src/images/0.png"));
                    G.drawImage(img, 0, 0, 20, 20, this);
                    this.setMaximumSize(new Dimension(40, 40));

                } catch (IOException ex) {
                    Logger.getLogger(CelluleGraphique.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                int nombre = celluleAssociee.getValChiffre();
                switch (nombre) {
                    case 1:
                    
                        try {
                        super.paintComponent(G);
                        Image img = ImageIO.read(new File("src/images/1.png"));
                        G.drawImage(img, 0, 0, 20, 20, this);
                        this.setMaximumSize(new Dimension(40, 40));

                    } catch (IOException ex) {
                        Logger.getLogger(CelluleGraphique.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;

                    case 2:
                    
                    try {
                        super.paintComponent(G);
                        Image img = ImageIO.read(new File("src/images/2.png"));
                        G.drawImage(img, 0, 0, 20, 20, this);
                        this.setMaximumSize(new Dimension(40, 40));

                    } catch (IOException ex) {
                        Logger.getLogger(CelluleGraphique.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;

                    case 3:
                    
                    try {
                        super.paintComponent(G);
                        Image img = ImageIO.read(new File("src/images/3.png"));
                        G.drawImage(img, 0, 0, 20, 20, this);
                        this.setMaximumSize(new Dimension(40, 40));

                    } catch (IOException ex) {
                        Logger.getLogger(CelluleGraphique.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;

                    case 4:
                    
                    try {
                        super.paintComponent(G);
                        Image img = ImageIO.read(new File("src/images/4.png"));
                        G.drawImage(img, 0, 0, 20, 20, this);
                        this.setMaximumSize(new Dimension(40, 40));

                    } catch (IOException ex) {
                        Logger.getLogger(CelluleGraphique.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;

                    case 5:
                    
                    try {
                        super.paintComponent(G);
                        Image img = ImageIO.read(new File("src/images/5.png"));
                        G.drawImage(img, 0, 0, 20, 20, this);
                        this.setMaximumSize(new Dimension(40, 40));

                    } catch (IOException ex) {
                        Logger.getLogger(CelluleGraphique.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;

                    case 6:
                    
                    try {
                        super.paintComponent(G);
                        Image img = ImageIO.read(new File("src/images/6.png"));
                        G.drawImage(img, 0, 0, 20, 20, this);
                        this.setMaximumSize(new Dimension(40, 40));

                    } catch (IOException ex) {
                        Logger.getLogger(CelluleGraphique.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;

                    case 7:
                    
                    try {
                        super.paintComponent(G);
                        Image img = ImageIO.read(new File("src/images/7.png"));
                        G.drawImage(img, 0, 0, 20, 20, this);
                        this.setMaximumSize(new Dimension(40, 40));

                    } catch (IOException ex) {
                        Logger.getLogger(CelluleGraphique.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;

                    case 8:
                    
                    try {
                        super.paintComponent(G);
                        Image img = ImageIO.read(new File("src/images/8.png"));
                        G.drawImage(img, 0, 0, 20, 20, this);
                        this.setMaximumSize(new Dimension(40, 40));

                    } catch (IOException ex) {
                        Logger.getLogger(CelluleGraphique.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;

                }
            }
        }

        if (celluleAssociee.presenceBombe() == true) {
            try {
                super.paintComponent(G);
                Image img = ImageIO.read(new File("src/images/bomb.png"));
                G.drawImage(img, 0, 0, 20, 20, this);
                this.setMaximumSize(new Dimension(40, 40));

            } catch (IOException ex) {
                Logger.getLogger(CelluleGraphique.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (celluleAssociee.isPerdue() == true) {
            try {
                super.paintComponent(G);
                Image img = ImageIO.read(new File("src/images/bombExploded.png"));
                G.drawImage(img, 0, 0, 20, 20, this);
                this.setMaximumSize(new Dimension(40, 40));

            } catch (IOException ex) {
                Logger.getLogger(CelluleGraphique.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
