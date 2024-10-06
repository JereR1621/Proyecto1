/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

import java.util.Scanner;

/**
 *
 * @author diver
 */
public class Selec_Mul_Pregunta extends Pregunta{
    
    private String[] elecciones;
    private int respuestaCorrecta;

    public Selec_Mul_Pregunta(String Text,String[] elecc,int respuestaC,int Peso) {
        super(Peso, Text);
        this.elecciones=elecc;
        this.respuestaCorrecta = respuestaC;
    }
    
    
    @Override
    public Boolean buscar() {
        System.out.println(Text);

        // Imprimir las opciones
        char letra = 'A';
        for (int i = 0; i < elecciones.length; i++) {
            System.out.println(letra + ") " + elecciones[i]);
            letra++;
        }

        Scanner s = new Scanner(System.in);

        System.out.println("\nIngrese la opción (A-" + (char) ('A' + elecciones.length - 1) + "): ");
        String respuestaUsuario = s.next().toUpperCase(); // Convertir la entrada a mayúscula

        // Verificar si la entrada es válida
        if (respuestaUsuario.length() == 1 && respuestaUsuario.charAt(0) >= 'A' && respuestaUsuario.charAt(0) <= 'A' + elecciones.length - 1) {
            // Convertir la letra ingresada en el índice correspondiente (A -> 0, B -> 1, etc.)
            int respuestaIndex = respuestaUsuario.charAt(0) - 'A';

            // Verificar si la respuesta es correcta
            if (respuestaIndex == this.respuestaCorrecta) {
                System.out.println("\n¡Pregunta correcta!\n");
                return true;
            } else {
                System.out.println("\nPregunta incorrecta. La respuesta correcta es " + elecciones[this.respuestaCorrecta] + ".\n");
                return false;
            }
        } else {
            System.out.println("Opción inválida. Por favor, ingrese una letra válida entre A y " + (char) ('A' + elecciones.length - 1) + ".");
            return false; // Opción inválida
        }
    }
    
    
    
    
    
    
    
}
