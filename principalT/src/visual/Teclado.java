/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import principalt.Letra;

/**
 *
 * @author Diego
 */
public class Teclado extends JFrame{
    
    private JButton borrar = new JButton ("Borrar");
    private JButton espacio = new JButton ("Espacio");
    private JTextField texto;
    private ArrayList<Letra> arrLetra = new ArrayList();
    private GridLayout contenedor = new GridLayout(5,10);
    
    public Teclado() {
        this.setSize(700, 700);
        this.setLayout(contenedor);
        this.agregarComponentes();
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void agregarComponentes(){
        Integer i;
        texto = new JTextField();
        this.cargarLetras();
        this.espacio();
        this.add(texto);
        this.add(espacio);
        this.add(borrar);
        for (i = 0; i < arrLetra.size(); i++){
            this.add(arrLetra.get(i));
        }
        
    }
    
    
    
    private void espacio(){
        Integer i;
        for (i= 32; i <= 32; i++){
            arrLetra.add(new Letra(String.valueOf((char)(int) i), texto));
        }
    }
    
    private void cargarLetras(){
        Integer i;
        for (i = 97; i <= 122; i++){
            
            arrLetra.add(new Letra(String.valueOf((char)(int) i), texto));
        }
            
    }
    
}
