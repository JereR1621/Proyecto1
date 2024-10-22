/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

import java.util.Scanner;

/**
 *
 * @author jere
 */
public class TFpregunta extends Pregunta {

    private Boolean respuestaCorrecta;

    //Constructor
    public TFpregunta(String Text, Boolean respuestaCorrecta, int Peso) {
        super(Peso, Text);
        this.respuestaCorrecta = respuestaCorrecta;
    }
    
    @Override
    public Boolean buscar() {

        
        System.out.println(Text);
        System.out.println("Responda con T si es verdadero o F si es falso");
        Scanner s = new Scanner(System.in);
        int intentos = 3; // Comienza con 3 intentos

        while (intentos > 0) {  // Mientras queden intentos
            try {
                String respuesta = s.next().toUpperCase();
                // Verifica si la respuesta es válida
                if ("T".equals(respuesta) || "F".equals(respuesta)) {
                    if (this.respuestaCorrecta == "T".equals(respuesta)) {
                        System.out.println("Pregunta correcta");
                        return true;
                    } else {
                        System.out.println("Respuesta incorrecta, le toco estudiar");
                        return false;
                    }
                } else {
                    intentos--;  // Decrementamos intentos
                    if (intentos > 0) {
                        System.out.println("Opción inválida: " + respuesta + ". Te quedan " + intentos + " intentos");
                    } else {
                        System.out.println("Respuesta incorrecta, nisiquiera era una opcion ...");
                        return false;
                    }
                }
            } catch (Exception e) {
                intentos--;  // Decrementamos intentos
                if (intentos > 0) {
                    System.out.println("Error: " + e + ". Te quedan " + intentos + " intentos");
                } else {
                    System.out.println("Respuesta incorrecta, le toco estudiar");
                    return false;
                }
            }
        }
        return false;
    }
}