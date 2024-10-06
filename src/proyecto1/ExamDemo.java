/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto1;

/**
 *
 * @author jere
 */
public class ExamDemo {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        // crea un examen  con un total de 10 puntos: 8 preguntas de un punto y una de dos puntos 
        Exam miExam = new Exam(); 
        miExam.agregaPregunta(new TFpregunta("La capital de Chile es Santiago", true, 1)); 
        String santiagoElec[] = {"Santiago", "Valparaiso", "Concepcion", "Magallanes", "Arica"}; 
        miExam.agregaPregunta(new Selec_Mul_Pregunta("Cuál es la capital de Region Metropolitana\n", santiagoElec, 0, 1));
        miExam.agregaPregunta(new Resp_Cortas_Pregunta("Cuál es la capital de IV Region","Coquimbo", 1)); 
        miExam.agregaPregunta(new TFpregunta("La capital de Alberta es Calgary", false, 1)); 
        String BCElec[] = {"Victoria", "Vancouver", "Nanaimo"}; 
        miExam.agregaPregunta(new Selec_Mul_Pregunta("Cuál es la capital de British Columbia",BCElec, 0, 1)); 
        miExam.agregaPregunta(new Resp_Cortas_Pregunta("Cuál es la capital de Argentina", "Buenos Aires", 1)); 
        miExam.agregaPregunta(new Resp_Cortas_Pregunta("Cuál es la capital de Canada", "Ottawa", 2)); 
        miExam.agregaPregunta(new TFpregunta("La capital de La Serena es Illapel", false, 1)); 
        String PElec[] = {"Brasilia", "Rio de Janeiro", "Sao Paulo", "Blumenau"}; 
        miExam.agregaPregunta(new Selec_Mul_Pregunta("Cuál es la capital de Brasil?", PElec, 0, 1)); 
        // dar examen y reportar el puntaje 
        int puntaje = miExam.darExam(); 
        System.out.println("su resultado es " + puntaje);
        
    }   
    
}
