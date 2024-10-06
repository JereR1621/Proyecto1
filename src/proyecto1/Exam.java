/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author jere
 */
public class Exam {
    
    private Pregunta[] preguntas;
    private int contadorPreguntas=0;

    public Exam() {
        preguntas= new Pregunta[10];
    }
    public void agregaPregunta(Pregunta p){        
        preguntas[contadorPreguntas]=p;
        contadorPreguntas++;
    }
    
    
    public int darExam() {
        System.out.println("\n---------------INICIO DE EL EXAMEN-----------------\n");
        
    int puntaje = 0;
    for (int i = 0; i < contadorPreguntas; i++) { 
        if (preguntas[i] != null && preguntas[i].buscar()) {
            puntaje += preguntas[i].getPeso();
        }
    }
    return puntaje;
}

    
    
}
