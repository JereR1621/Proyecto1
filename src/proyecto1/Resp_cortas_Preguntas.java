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
public class Resp_cortas_Preguntas extends Pregunta {
    
    private String respuestaCorrecta;

    public Resp_cortas_Preguntas(String respuestaCorrecta, int Peso, String Text) {
        super(Peso, Text);
        this.respuestaCorrecta = respuestaCorrecta.toUpperCase();
    }
    
    @Override
    public Boolean buscar(){
        int pin=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Responda con T si es verdadero de lo contrario f");
        while(pin==0){
            try{
                
                String respuesta=s.next().toUpperCase();
                if(respuesta==this.respuestaCorrecta){
                    System.out.println("Pregunta correcta");
                    return true;
                    
                    
                    
                    
                    
                    
                }
                
                else{
                    return false;
                }
            }
            catch(Exception e){
                System.out.println("Dato invalido");
            }
            
            
            
            
        }
        return null;
    }
    
    
    
    
    
    
}
