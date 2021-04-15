/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.paradigmas;

/**
 *
 * @author eudal
 */
public class Imc {
    
    
    public double calculo(double peso,double altura){
        double imc;
        imc=peso/Math.pow(altura,2);
        return Math.round(imc * 100d) / 100d;
    }
    
    
}
