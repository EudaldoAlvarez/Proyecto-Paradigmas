/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.paradigmas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author eudal
 */
public class Ventana extends JFrame {
    
    private FondoPanel fondo =new FondoPanel();
    private int largo = 563, ancho = 1000;
    
    public Ventana() {
        //===================Configuraciones basicas de la ventana=============
        setLayout(null);
        JLabel texto = new JLabel();
        Toolkit theKit = texto.getToolkit();
        Dimension pantalla = theKit.getScreenSize();
        setBounds(((pantalla.width / 2) - (ancho / 2)),((pantalla.height / 2) - (largo / 2)),ancho,largo);
        this.setContentPane(fondo);
        
        setVisible(true);
        setResizable(false);
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //===================Configuraciones basicas de la ventana fin==========================

        //==================Formulario==============================
        JPanel formulario=new JPanel();
        formulario.setOpaque(false);
        formulario.setLayout(null);
        formulario.setBounds(0,0,ancho/2,largo);
        Font font=new Font("Bodoni MT Black",20, 20);
        
        JLabel nombre=new JLabel("Nombre");
        nombre.setBounds(40, 50, 200, 40);
        nombre.setFont(font);
        nombre.setForeground(Color.white);
        nombre.setOpaque(false);
        formulario.add(nombre);
        
        JTextField sendNombre=new JTextField();
        sendNombre.setBounds(40, 100, 200, 40);
        sendNombre.setFont(font);
        sendNombre.setOpaque(true);
        formulario.add(sendNombre);
        
        JLabel sexo=new JLabel("Sexo");
        sexo.setBounds(40, 140, 70, 40);
        sexo.setFont(font);
        sexo.setForeground(Color.white);
        formulario.add(sexo);
        
        JComboBox sendSexo=new JComboBox();
        sendSexo.setBounds(110,145, 30, 30);
        sendSexo.setFont(font);
        sendSexo.setBackground(Color.white);
        sendSexo.setOpaque(false);
        sendSexo.addItem("H");
        sendSexo.addItem("M");
        formulario.add(sendSexo);
        
        JLabel peso=new JLabel("Peso(Kg)");
        peso.setBounds(40, 180, 70, 40);
        peso.setFont(font);
        peso.setForeground(Color.white);
        formulario.add(peso);
        
        JTextField sendPeso=new JTextField();
        sendPeso.setBounds(95,180, 50, 40);
        
        sendPeso.setFont(font);
        sendPeso.setOpaque(true);
        formulario.add(sendPeso);
        
        JLabel altura=new JLabel("Altura(mts)");
        altura.setBounds(40, 225, 200, 40);
        altura.setFont(font);
        altura.setForeground(Color.white);
        formulario.add(altura);
        
        JTextField sendAltura=new JTextField();
        sendAltura.setBounds(40, 265, 200, 40);
        sendAltura.setFont(font);
        sendAltura.setOpaque(true);
        formulario.add(sendAltura);
        
        add(formulario);
        repaint();
        //==================Formulario Fin==========================
        
        

    }
    class FondoPanel extends JPanel{
        private Image imagen;
        @Override
        public void paint(Graphics g){
          imagen = new ImageIcon(getClass().getResource("/img/bg.png")).getImage();
          g.drawImage(imagen, 0, 0, getWidth(),getHeight(),this);
          setOpaque(false);
          super.paint(g);
        }
    }
}
