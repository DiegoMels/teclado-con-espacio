package principalt;

import controladores.ControladorClick;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Letra extends JButton {
    
     private String letra;
     private JTextField texto;
     
     private ControladorClick controladorClick;
     

    public Letra(String letra, JTextField texto) {
        super(letra);
        this.letra = letra;
        this.texto = texto;
        
        controladorClick = new ControladorClick(texto, letra);
        this.addMouseListener(controladorClick);
    }

   
    
}
