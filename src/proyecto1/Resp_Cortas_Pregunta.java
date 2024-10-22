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

public class Resp_Cortas_Pregunta extends Pregunta {

    private String respuestaCorrecta;

    public Resp_Cortas_Pregunta(String Text, String respuestaCorrecta, int Peso) {
        super(Peso, Text);
        this.respuestaCorrecta = respuestaCorrecta.trim();
    }

    @Override
    public Boolean buscar() {

        System.out.println(getText());
        Scanner s = new Scanner(System.in);
        
        int intentos = 3;
    
        while (intentos > 0) {
            System.out.println("Ingrese su respuesta:");
            String respuesta = s.nextLine().trim();
    
            // Usamos equalsIgnoreCase en lugar de equals
            if (respuesta.equalsIgnoreCase(this.respuestaCorrecta)) {
                System.out.println("Pregunta correcta");
                return true;
            } else {
                intentos--;
                if (intentos > 0) {
                    System.out.println("xxxxxxxxxxxxxxxx\nPregunta incorrecta. Le quedan " + intentos + " intentos.\nxxxxxxxxxxxxxxx");
                } else {
                    System.out.println("Se ha quedado sin intentos. La respuesta correcta era: " + this.respuestaCorrecta);
                }
            }
        }
        return false;
    }
}
