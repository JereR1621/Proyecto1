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
    public TFpregunta(String Text,Boolean respuestaCorrecta,int Peso) {
        super(Peso, Text);
        this.respuestaCorrecta = respuestaCorrecta;
    }
    
    @Override
public Boolean buscar() {
    Scanner s = new Scanner(System.in);
    System.out.println(Text);
    System.out.println("Responda con T si es verdadero o F si es falso");

    while (true) { // Ciclo hasta que el usuario ingrese una opción válida
        try {
            String respuesta = s.next().toUpperCase();
            // Verifica si la respuesta es válida
            if ("T".equals(respuesta) || "F".equals(respuesta)) {
                
                if (this.respuestaCorrecta == "T".equals(respuesta)) {
                    System.out.println("Pregunta correcta");
                    return true;
                }   
                else if(this.respuestaCorrecta == "F".equals(respuesta)){
                    System.out.println("Pregunta correcta");
                    return true;
                        }
                 else {
                    System.out.println("Respuesta incorrecta");
                    return false;
                }
            } else {
                System.out.println("Opción invalida: " + respuesta);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

    
    
}
