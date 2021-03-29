/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.paradigmas;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author eudal
 */
public class Ventana extends JFrame {

    private int largo = 563, ancho = 1000;

    public Ventana() {
        //===================Configuraciones basicas de la ventana=============
        setLayout(null);
        JLabel texto = new JLabel();
        Toolkit theKit = texto.getToolkit();
        Dimension pantalla = theKit.getScreenSize();

        setLocation(((pantalla.width / 2) - (ancho / 2)), ((pantalla.height / 2) - (largo / 2)));
        setSize(ancho, largo);
        setVisible(true);
        setResizable(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //===================Configuraciones fin==========================

        //===================Contenedor principal==============================
        JPanel contenedorPrincipal=new JPanel();
        contenedorPrincipal.setBounds(0, 0, ancho, largo);
        contenedorPrincipal.setLayout(new GridLayout(1, 2));
        ImageIcon image=new ImageIcon("../img/bg.png");
        JLabel bg=new JLabel();
        bg.setSize(ancho, largo);
        bg.setOpaque(true);
        bg.setIcon(image);
        contenedorPrincipal.add(bg);
        add(contenedorPrincipal);
        //===================Contenedor principa Fin
        
        //===================Contenedor izquierdo===================
        JPanel contenedorIzquierdo = new JPanel();
        contenedorIzquierdo.setSize(ancho / 2, largo / 2);
        //contenedorIzquierdo.setBackground(Color.red);
        contenedorIzquierdo.setLayout(null);
        
        JButton hombre=new JButton();
        hombre.setText("Hombre");
        
        
        contenedorPrincipal.add(contenedorIzquierdo);
        //===================Contedor izquierdo fin===================

        //===================Contendor Derecho========================
        JPanel contenedorDerecho = new JPanel();
        contenedorDerecho.setSize(ancho / 2, largo / 2);
        //contenedorDerecho.setBackground(Color.blue);
        contenedorPrincipal.add(contenedorDerecho);
        //===================Contenedor Derecho fin===================

    }

}
