package controladores;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

/**
 *
 * @author Diego
 */
public class ControladorBorrar implements MouseListener {
    
     private JTextField texto;
    private String letra;

    public ControladorBorrar(JTextField texto, String letra) {
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

/*package controladores;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

public class ControladorBorrar implements MouseListener{
    
    private JTextField texto;
    private String espacio = " ";
    
    public ControladorBorrar (JTextField texto){
        
        this.texto = texto;
        
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        
        texto.setText(texto.getText()+ espacio);
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
    
    
    
}
*/