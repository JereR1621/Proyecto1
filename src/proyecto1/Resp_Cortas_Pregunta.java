package proyecto1;

import java.util.Scanner;

public class Resp_Cortas_Pregunta extends Pregunta {

    private String respuestaCorrecta;

    public Resp_Cortas_Pregunta(String Text, String respuestaCorrecta, int Peso) {
        super(Peso, Text);
        this.respuestaCorrecta = respuestaCorrecta.toUpperCase().trim(); // Eliminar espacios en blanco
    }

    @Override
    public Boolean buscar() {
        System.out.println(Text);
        Scanner s = new Scanner(System.in);
        
        int intentos = 3; // Contador de intentos

        while (intentos > 0) {
            System.out.println("\nIngrese su respuesta:");
            String respuesta = s.nextLine().toUpperCase().trim(); // Usar nextLine para respuestas de múltiples palabras

            // Comparar la respuesta
            if (respuesta.equals(this.respuestaCorrecta)) {
                System.out.println("\n¡Pregunta correcta!\n");
                return true; // Retorna verdadero si la respuesta es correcta
            } else {
                intentos--; // Reduce el contador de intentos
                if (intentos > 0) {
                    System.out.println("xxxxxxxxxxxxxxxx\nPregunta incorrecta. Le quedan " + intentos + " intentos.\nxxxxxxxxxxxxxxx");
                } else {
                    System.out.println("\nSe ha quedado sin intentos. La respuesta correcta era: " + this.respuestaCorrecta + ".\n");
                }
            }
        }
        return false; // Retorna falso si se agotan los intentos
    }
}
