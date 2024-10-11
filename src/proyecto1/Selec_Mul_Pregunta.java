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
        System.out.println("\nIngrese la opcion (A-" + (char) ('A' + elecciones.length - 1) + "): ");
        

        // Verificar si la entrada es válida
        int pivote=0;
        while(pivote==0){
        String respuestaUsuario = s.next().toUpperCase(); // Convertir la entrada a mayúscula
        if (respuestaUsuario.length() == 1 && respuestaUsuario.charAt(0) >= 'A' && respuestaUsuario.charAt(0) <= 'A' + elecciones.length - 1) {
            // Convertir la letra ingresada en el índice correspondiente (A -> 0, B -> 1, etc.)
            int respuestaIndex = respuestaUsuario.charAt(0) - 'A';

            // Verificar si la respuesta es correcta
            if (respuestaIndex == this.respuestaCorrecta) {
                System.out.println("Pregunta correcta");
                return true;
            } else {
                System.out.println("Pregunta incorrecta. La respuesta correcta es " + elecciones[this.respuestaCorrecta]);
                return false;
            }
        } else {
            System.out.println("Opcion invalida. Por favor, ingrese una letra valida entre A y " + (char) ('A' + elecciones.length - 1));
        }
    }
        return null;
    }
    
    
    
    
    
    
    
}
