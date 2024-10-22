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

    public Selec_Mul_Pregunta(String Text, String[] elecc, int respuestaC, int Peso) {
        super(Peso, Text);
        
        // Validar que hay al menos 2 alternativas y la respuesta correcta está dentro del rango válido
        if (elecc.length < 2 || respuestaC < 0 || respuestaC >= elecc.length) {
            setPeso(-1);
            System.out.println("\nPregunta invalida \n");

        } else {
            this.elecciones = elecc;
            this.respuestaCorrecta = respuestaC;
        }
    }
    
    
    @Override
    public Boolean buscar() {
        
        System.out.println(getText());
    
        // Imprimir las opciones
        char letra = 'A';
        for (int i = 0; i < elecciones.length; i++) {
            System.out.println(letra + ") " + elecciones[i]);
            letra++;
        }
    
        Scanner s = new Scanner(System.in);
        int intentos = 3; 
    
        while (intentos > 0) {
            System.out.println("\nIngrese la opcion (A-" + (char) ('A' + elecciones.length - 1) + "): ");
            System.out.println("Intentos restantes: " + intentos);
            
            String respuestaUsuario = s.next().toUpperCase();
    
            if (respuestaUsuario.length() == 1 && respuestaUsuario.charAt(0) >= 'A' && 
                respuestaUsuario.charAt(0) <= 'A' + elecciones.length - 1) {
                
                int respuestaIndex = respuestaUsuario.charAt(0) - 'A';
    
                if (respuestaIndex == this.respuestaCorrecta) {
                    System.out.println("Pregunta correcta");
                    return true;
                } 
                else if(respuestaIndex != this.respuestaCorrecta){
                    System.out.println("Pregunta incorrecta");
                    return false;

                }
                else {
                    intentos--; 
                    if (intentos > 0) {
                        System.out.println("xxxxxxxxxxxxxxxx\nPregunta incorrecta. Le quedan " + intentos + " intentos.\nxxxxxxxxxxxxxxx");
                    } else {
                        System.out.println("Se ha quedado sin intentos");
                    }
                }
            } else {
                intentos--; 
                if (intentos > 0) {
                    System.out.println("xxxxxxxxxxxxxxxx\nOpción inválida. Le quedan " + intentos + 
                                     " intentos.\nPor favor, ingrese una letra válida entre A y " + 
                                     (char) ('A' + elecciones.length - 1) + "\nxxxxxxxxxxxxxxx");
                } else {
                    System.out.println("Se ha quedado sin intentos");
                }
            }
        }
        return false;
    }
    
    
    
    
    
    
    
}
