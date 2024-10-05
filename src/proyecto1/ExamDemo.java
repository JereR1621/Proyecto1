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
        Exam examen=new Exam();
        Resp_cortas_Preguntas pregunta1 = new Resp_cortas_Preguntas("santiago",10,"Cual es la capital de chile?");
        TFpregunta pregunta2 = new TFpregunta(true,10,"1+1 == 2?");
        examen.agregaPregunta(pregunta1);
        examen.agregaPregunta(pregunta2);
        int puntaje= examen.darExam();
        System.out.println("Su puntaje totoal fue de "+puntaje);
    }
    
}
