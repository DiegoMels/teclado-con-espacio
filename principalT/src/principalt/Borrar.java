package principalt;

import controladores.ControladorBorrar;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Borrar extends JButton{
    
    private String letra;
    private JTextField texto;
    private ControladorBorrar controladorBorrar;
    
    public Borrar(JTextField texto, String letra){
        
        this.texto = texto;
        this.letra = letra;
        controladorBorrar = new ControladorBorrar(texto, letra);
        this.addMouseListener(controladorBorrar);
       
    }
}
