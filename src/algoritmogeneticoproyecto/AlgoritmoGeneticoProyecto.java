/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmogeneticoproyecto;

/**
 *
 * @author uzuma
 */
public class AlgoritmoGeneticoProyecto {

    public static class Individuo{
        double x1;
        double x2;
        double valor;
        boolean estado;
        
    }
    
    public static final int POBLACION = 200;
    public static final int EJECUCIONES = 30;
    public static final int EVALUACIONES = 220000;
    
    
    public static void funcion(Individuo indi){
        double result = Math.pow((indi.x1-10),3) + Math.pow((indi.x2-20), 3);
        System.out.println(result);
        indi.valor = result;
    }
    public static boolean g1(Individuo indi){
        double result = - Math.pow((indi.x1 - 5),2) - Math.pow((indi.x2-5), 2) + 100;
        System.out.println(result);
        if(result <= 0){
            return true;
        }else
            return false;
    }
    public static boolean g2(Individuo indi){
        double result = Math.pow((indi.x1-6), 2) - Math.pow((indi.x2+5), 2) - 82.81;
            System.out.println(result);
        if(result <= 0){
            return true;
        }else
            return false;
    }
    
    
    
    
    public static void main(String[] args) {
        Individuo individuo = new Individuo();
        individuo.x1 = 24.5;
        individuo.x2 = 13.96;
        System.out.println((Math.random()*100)+13);
        System.out.println(g1(individuo));
        System.out.println(g2(individuo));
        funcion(individuo);
        System.out.println("Su valor: " + individuo.valor);
    }
    
}
