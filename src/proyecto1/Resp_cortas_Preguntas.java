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
        int intento=3;
        System.out.println(Text);
        Scanner s = new Scanner(System.in);
        
        while(pin==0){
            
            System.out.println("\nIngrese su respuesta");
                try{
                    String respuesta=s.next().toUpperCase();
                    if(respuesta.equals(this.respuestaCorrecta)){
                        System.out.println("\nPregunta correcta \n");
                        return true;
                        
                    }
                    else{
                        intento--;
                        if(intento==0){
                            System.out.println("\nSe a quedado sin intentos\n");
                            return false;
                        }
                        else{
                            System.out.println("xxxxxxxxxxxxxxxx\nPregunta incorrecta le quedan "+intento+" intentos\nxxxxxxxxxxxxxxx");
                            
                        }
                     
                    }
                }   
                catch(Exception e){
                    System.out.println("Dato invalido");
                }
            
            
            
            
        }
        return null;
        
    }
    
    
    
    
    
    
}
