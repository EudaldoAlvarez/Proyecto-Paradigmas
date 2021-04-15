/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ing_soft.t1;

import java.util.Scanner;

/**
 *
 * @author eudal
 */
public class Ing_SoftT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        metodo_general();
        // TODO code application logic here
    }
    /**
    *Resolución de la formula general*
    *nombre del modulo: Formula_general*
    *Programador: Eudaldo Antonio Alvarez Trasviña*
    *Version:1.0 (13/04/2021)**/
    public static void metodo_general(){
        Scanner scan=new Scanner(System.in);
        double a,b,c,interior_raiz,x1,x2;
        
        System.out.println("Escribe el valor de a");
        a=scan.nextDouble();
        System.out.println("Escribe el valor de b");
        b=scan.nextDouble();
        System.out.println("Escribe el valor de c");
        c=scan.nextDouble();
        
        interior_raiz=Math.pow(b,2)-4*a*c;
        
        if (interior_raiz<0) {
            System.out.println("No existen soluciones");
        }else{
            if(interior_raiz==0){
               x1=(-b+Math.sqrt(interior_raiz))/2;
                System.out.println("La unica solucion es: "+x1);
            }else{
                x1=(-b+Math.sqrt(interior_raiz))/2;
                x2=(-b-Math.sqrt(interior_raiz))/2;
                System.out.println("La solucion de x1 es: "+x1);
                System.out.println("La solucion de x2 es: "+x2);
            }
        }
    }
    
}
