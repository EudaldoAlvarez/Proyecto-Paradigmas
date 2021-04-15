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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author eudal
 */
public class Ventana extends JFrame {
    
    private Background fondo =new Background();
    private Imc imc=new Imc();
    private Estadisticas estadisticas=new Estadisticas();
    private int largo = 563, ancho = 1000;
    private double decimales;
    private String content;
    
    public Ventana() {
        //===================Configuraciones basicas de la ventana=============
        this.setLayout(null);
        JLabel texto = new JLabel();
        Toolkit theKit = texto.getToolkit();
        Dimension pantalla = theKit.getScreenSize();
        this.setBounds(((pantalla.width / 2) - (ancho / 2)),((pantalla.height / 2) - (largo / 2)),ancho,largo);
        //this.setContentPane(fondo);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //===================Configuraciones basicas de la ventana fin==========================

        //==================Formulario==============================
        Background formulario=new Background();
        formulario.setOpaque(false);
        formulario.setLayout(null);
        formulario.setBounds(0,0,ancho,largo);
        Font font=new Font("Arial Black",0, 20);
        
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
        
        JRadioButton h=new JRadioButton("H");
        h.setBounds(95,145,50,30);
        h.setFont(font);
        h.setOpaque(false);
        h.setForeground(Color.white);
        formulario.add(h);
        
        JRadioButton m=new JRadioButton("M");
        m.setBounds(135,145,50,30);
        m.setFont(font);
        m.setOpaque(false);
        m.setForeground(Color.white);
        m.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (m.isSelected()==true) {
                    h.setSelected(false);
                }
                  
            }
        });
        formulario.add(m);
        h.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (h.isSelected()==true) {
                    m.setSelected(false);
                }
                  
            }
        });
        
        JLabel peso=new JLabel("Peso(Kg)");
        peso.setBounds(40, 180, 100, 40);
        peso.setFont(font);
        peso.setForeground(Color.white);
        formulario.add(peso);
        
        JTextField sendPeso=new JTextField();
        sendPeso.setBounds(140,185, 50, 30);
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
        
        JLabel titulo_estadisticas=new JLabel("Estadísticas");
        titulo_estadisticas.setBounds(400, 90, 200, 40);
        titulo_estadisticas.setFont(font);
        titulo_estadisticas.setOpaque(false);
        titulo_estadisticas.setForeground(Color.white);
        formulario.add(titulo_estadisticas);
        
        JLabel descEstadisticas=new JLabel();
        descEstadisticas.setBounds(400, 120, 600, 200);
        descEstadisticas.setFont(font);
        descEstadisticas.setForeground(Color.white);
        descEstadisticas.setOpaque(false);
        formulario.add(descEstadisticas);
        
        JButton calcular=new JButton("Calcular IMC");
        calcular.setBounds(45, 320, 190, 40);
        calcular.setFont(font);
        calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                decimales=imc.calculo(Double.parseDouble(sendPeso.getText()),Double.parseDouble(sendAltura.getText()));
                if (h.isSelected()==true) {
                    content="<html><body>El paciente "+sendNombre.getText()+"<br>Tiene un IMC de "+imc.calculo(Double.parseDouble(sendPeso.getText()), Double.parseDouble(sendAltura.getText()))+"<br>lo cual se considera "+estadisticas.Estadisticas("H", decimales)+"</body></html>";
                    descEstadisticas.setText(content);
                    repaint();
                }else{
                    content="<html><body>La paciente "+sendNombre.getText()+"<br>Tiene un IMC de "+imc.calculo(Double.parseDouble(sendPeso.getText()), Double.parseDouble(sendAltura.getText()))+"<br>lo cual se considera "+estadisticas.Estadisticas("M", decimales)+"</body></html>";
                    descEstadisticas.setText(content);
                    repaint();
                }
                
            }
        }
        );
        formulario.add(calcular);
        
        JButton reset=new JButton("Reiniciar");
        reset.setBounds(400, 320, 200, 40);
        reset.setFont(font);
        formulario.add(reset);
        reset.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                sendNombre.setText("");
                h.setSelected(false);
                m.setSelected(false);
                sendPeso.setText("");
                sendAltura.setText("");
                descEstadisticas.setText("");
                repaint();
            }
        });
        
        add(formulario);
        repaint();
        //==================Formulario Fin==========================
        
        

    }
    class Background extends JPanel{
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
