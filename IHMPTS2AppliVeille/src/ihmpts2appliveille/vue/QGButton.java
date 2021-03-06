/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihmpts2appliveille.vue;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

/**
 * Classe héritant de JButton : Bouton personnalisé pour l'application
 * @author x1QG1x
 */
public class QGButton extends JButton implements MouseListener{
    private Color primaryColor;
    private Color hoverColor;
    private Color textColor;
    private Font f;
    
    /**
     * Constructeur du bouton
     * @param text texte s'affichant à l'interieur du bouton
     * @param primary couleur principale du bouton
     * @param hover couleur secondaire au passage du curseur
     * @param textColor couleur du texte affiché dans le bouton
     * @param f police de caractère du texte à l'interieur du bouton
     */
    public QGButton(String text, Color primary, Color hover, Color textColor, Font f)
    {
        super(text);
        this.primaryColor = primary;
        this.hoverColor = hover;
        this.textColor = textColor;
        this.f = f;
        this.setContentAreaFilled(false);
        this.setOpaque(true);
        this.setBackground(primaryColor);
        this.setForeground(textColor);
        this.setFont(this.f);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.addMouseListener(this);
    }
    

    @Override
    public void mouseClicked(MouseEvent e) {
        //Useless can use ActionListener
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Useless
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Useless
    }

    /**
     * Applique le changement de couleur du bouton lors du passage du curseur sur celui-ci
     * @param e 
     */
    @Override
    public void mouseEntered(MouseEvent e) {
        this.setBackground(hoverColor);
    }

    /**
     * Applique le changement de couleur du bouton (retour à la couleur initiale) lorsque le curseur ne survole plus celui-ci
     * @param e 
     */
    @Override
    public void mouseExited(MouseEvent e) {
        this.setBackground(primaryColor);
    }
}
