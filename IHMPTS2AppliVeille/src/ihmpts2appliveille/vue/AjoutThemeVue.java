/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihmpts2appliveille.vue;

import ihmpts2appliveille.controleur.MainControleur;

/**
 * AjoutThemeVue est l'IHM permettant à un utilisateur de type administrateur d'ajouter un nouveau thème
 * @author Bobysmiile
 */
public class AjoutThemeVue extends javax.swing.JPanel {
    private MainControleur ctrl;

    /**
     * Creates new form AjoutThemeVue : Constructeur de la vue 
     * @param ctrl le main controleur
     */
    public AjoutThemeVue(MainControleur ctrl) {
        this.ctrl = ctrl;
        this.ctrl.setAjoutThemeVue(this);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDescription = new javax.swing.JTextArea();
        jIntitule = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jValider = new javax.swing.JButton();
        jAnnuler = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Ajouter un thème");

        jDescription.setColumns(20);
        jDescription.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jDescription.setLineWrap(true);
        jDescription.setRows(5);
        jDescription.setText("Une petite déscription qui devra être rédigée par l'étudiant pour définir son thème.\n");
        jDescription.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jDescription.setDragEnabled(true);
        jScrollPane1.setViewportView(jDescription);

        jIntitule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIntituleActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Description");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Intitulé");

        jValider.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jValider.setText("Valider");
        jValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jValiderActionPerformed(evt);
            }
        });

        jAnnuler.setText("Annuler");
        jAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnnulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 225, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1)
                                        .addComponent(jIntitule, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(225, 225, 225))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jValider)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jAnnuler)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(129, 129, 129)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jIntitule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jValider)
                    .addComponent(jAnnuler))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jIntituleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIntituleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIntituleActionPerformed

    /**
     * Bouton valider débutant le processus d'ajout d'un nouveau thème dans la base de données
     * @param evt 
     */
    private void jValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jValiderActionPerformed
        ctrl.ajoutTheme(jIntitule.getText(), jDescription.getText());
        ctrl.naviguerVers("Liste des thèmes");
    }//GEN-LAST:event_jValiderActionPerformed

    /**
     * Bouton annuler permettant de revenir vers la liste des thèmes
     * @param evt 
     */
    private void jAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnnulerActionPerformed
        ctrl.naviguerVers("Liste des thèmes");
    }//GEN-LAST:event_jAnnulerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAnnuler;
    private javax.swing.JTextArea jDescription;
    private javax.swing.JTextField jIntitule;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jValider;
    // End of variables declaration//GEN-END:variables
}
