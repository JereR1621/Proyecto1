/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

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
    
    public void agregaPregunta(Pregunta p) {
        if (contadorPreguntas < 10 && p.getPeso() >=0) {
            preguntas[contadorPreguntas] = p;
            contadorPreguntas++;
            System.out.println("Pregunta numero "+contadorPreguntas+" "+p.getText()+" agregada correctamente.");
        } else if (contadorPreguntas >= 10) {

            System.out.println("No se puede agregar más preguntas");
        } else if (p == null || p.getPeso() < 0) {
            
            System.out.println("No se pudo agregar la pregunta\n");
            p=null;
        }
    }
    
    
   public int darExam() {
        System.out.println("\n---------------INICIO DEL EXAMEN-----------------\n");
        Scanner s = new Scanner(System.in);
        System.out.print("Nombre del Alumno: ");
        String nombre = s.nextLine();

        int puntaje = 0;
        int contador = 1;

        for (int i = 0; i < contadorPreguntas; i++) {
            System.out.println("\nPregunta N " + contador);
            if (preguntas[i] != null && preguntas[i].buscar()) {
                puntaje += preguntas[i].getPeso();
            }
            contador++;
        }

       
        String datos = String.format("%s - Puntaje: %d%n", nombre, puntaje);
        String archivo = "datos.txt";

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(archivo, true))) { 
            escritor.write(datos);
            System.out.println("Datos del alumno guardados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
        
        return puntaje;
    }
    
    
}
