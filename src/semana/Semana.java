/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana;

/**
 *
 * @author Notebook
 */
public class Semana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Día de semana 
        int numDia;
        numDia = 2;
        
        if(numDia == 1){
            System.out.println("Lunes");
        }
        else if(numDia == 2){
            System.out.println("Martes");
        }
        else if(numDia == 3){
            System.out.println("Miercoles");
        }
        
        else if(numDia == 4){
            System.out.println("Jueves");
        }
        
        else if(numDia == 5){
            System.out.println("Viernes");
        }
        
        else if(numDia == 6){
            System.out.println("Sabado");
        }
        
        else if(numDia == 7){
            System.out.println("Domingo");
        }
        else{
            System.out.println("Día no valido");
        }
    }
    
}
