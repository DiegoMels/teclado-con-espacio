/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

/**
 *
 * @author Diego
 */
public class ControladorClick implements MouseListener {
    
     private JTextField texto;
    private String letra;

    public ControladorClick(JTextField texto, String letra) {
        this.texto= texto;
        this.letra = letra;
    
    }

    
    @Override
    public void mouseClicked(MouseEvent e) {
        texto.setText(texto.getText()+ letra);
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
