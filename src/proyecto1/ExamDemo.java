/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jere
 */
public class ExamDemo {
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args){
        
        
        //Creamos y agregamos las preguntas 
        Exam miExam = new Exam(); 
        miExam.agregaPregunta(new TFpregunta("La capital de Chile es Santiago", true, 1)); 
        String santiagoElec[] = {"Santiago", "Valparaiso", "Concepcion", "Magallanes", "Arica"}; 
        miExam.agregaPregunta(new Selec_Mul_Pregunta("Cuál es la capital de Region Metropolitana\n", santiagoElec, 10, 1));
        miExam.agregaPregunta(new Resp_Cortas_Pregunta("Cuál es la capital de IV Region","Coquimbo", 1)); 
        miExam.agregaPregunta(new TFpregunta("La capital de Alberta es Calgary", false, 1)); 
        String BCElec[] = {"Victoria", "Vancouver", "Nanaimo"}; 
        miExam.agregaPregunta(new Selec_Mul_Pregunta("Cuál es la capital de British Columbia",BCElec, 0, 1)); 
        miExam.agregaPregunta(new Resp_Cortas_Pregunta("Cuál es la capital de Argentina", "Buenos Aires", 1)); 
        miExam.agregaPregunta(new Resp_Cortas_Pregunta("Cuál es la capital de Canada", "Ottawa", 2)); 
        miExam.agregaPregunta(new TFpregunta("La capital de La Serena es Illapel", false, 1)); 
        String PElec[] = {"Brasilia", "Rio de Janeiro", "Sao Paulo", "Blumenau"}; 
        miExam.agregaPregunta(new Selec_Mul_Pregunta("Cuál es la capital de Brasil?", PElec, 0, 1));
        miExam.agregaPregunta(new Resp_Cortas_Pregunta("Cuál es la capital de Argentina", "Buenos Aires", 1)); 
        miExam.agregaPregunta(new Resp_Cortas_Pregunta("Cuál es la capital de Argentina", "Buenos Aires", 1));

        
        miExam.agregaPregunta(new Resp_Cortas_Pregunta("Cuál es la capital de Argentina", "Buenos Aires", 1)); 
        miExam.agregaPregunta(new Resp_Cortas_Pregunta("Cuál es la capital de Argentina", "Buenos Aires", 1)); 


        
        
        //Rendir examen
        int p=0;
        while(p==0){
            Scanner n = new Scanner(System.in);
            System.out.println("Elija una opcion: \n1-Rendir examen\n2-Salir");
            try{
                int seleccion=n.nextInt();
                if(seleccion==1){
                    int puntaje = miExam.darExam();
                    System.out.println("su resultado es " + puntaje);
                }
                else if(seleccion==2){
                    break;
                }
                else{
                    System.out.println("\nSeleccion invalida");
                
                }
            }
            catch(Exception e){
                System.out.println("Error "+e);
            }
    }
        
        
    }   

    
}