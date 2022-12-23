/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package demineur_boisset_chabasseur_pomedio;

import java.awt.event.MouseEvent;
import java.util.Random;

/**
 *
 * @author bapti
 */
public class Fenetre extends javax.swing.JFrame {

    private PlateauDeJeu plateau = new PlateauDeJeu();

    /**
     * Creates new form Fenetre
     */
    public Fenetre() {
        initComponents();
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                CelluleGraphique cellGraph = new CelluleGraphique(plateau.grille[i][j]);

                cellGraph.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        CelluleDeGrille cases = cellGraph.celluleAssociee;
                        if (cases.presenceBombe() == false) {
                            cases.lirelacase();
                        }
                        if (cases.presenceBombe() == true) {
                            TextMessage.setText("Vous avez perdu");
                            cases.PartiePerdue();
                        }
                        
                    }

                });
                PanelJeu.add(cellGraph);
            }
        }
        initialiserPartie();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        PanelJeu = new javax.swing.JPanel();
        PanelAffichage = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Btn_Start = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextMessage = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 540));
        setPreferredSize(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelJeu.setBackground(new java.awt.Color(255, 255, 255));
        PanelJeu.setPreferredSize(new java.awt.Dimension(1000, 1000));
        PanelJeu.setLayout(new java.awt.GridLayout(20, 20));
        getContentPane().add(PanelJeu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 400, 400));

        PanelAffichage.setBackground(new java.awt.Color(153, 255, 255));
        PanelAffichage.setMinimumSize(new java.awt.Dimension(380, 100));
        PanelAffichage.setPreferredSize(new java.awt.Dimension(760, 100));
        PanelAffichage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Démineur :");
        PanelAffichage.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        Btn_Start.setText("Start");
        Btn_Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_StartActionPerformed(evt);
            }
        });
        PanelAffichage.add(Btn_Start, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel3.setText("Info Partie :");
        PanelAffichage.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        jLabel5.setText("Nombre de Bombe :");
        PanelAffichage.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, 20));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("30");
        PanelAffichage.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, 20));

        TextMessage.setColumns(20);
        TextMessage.setRows(5);
        jScrollPane2.setViewportView(TextMessage);

        PanelAffichage.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 150, 60));

        getContentPane().add(PanelAffichage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_StartActionPerformed
        // TODO add your handling code here:
        initialiserPartie();
        PanelJeu.repaint();
        
    }//GEN-LAST:event_Btn_StartActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fenetre().setVisible(true);
            }
        });
    }

    void placerBombeAlea() {
        Random r = new Random();
        int i = 0;
        while (i != 10) {
            int ligne = r.nextInt(20);
            int colonne = r.nextInt(20);
            if (plateau.presenceBombe(ligne, colonne) == false) {
                plateau.placerBombe(ligne, colonne);
                i += 1;
            }
        }
    }

    void initialiserPartie() {
        plateau.viderGrille();
        placerBombeAlea();
        TextMessage.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Start;
    private javax.swing.JPanel PanelAffichage;
    private javax.swing.JPanel PanelJeu;
    private javax.swing.JTextArea TextMessage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
