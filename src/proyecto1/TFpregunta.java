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
    public TFpregunta(Boolean respuestaCorrecta, int Peso, String Text) {
        super(Peso, Text);
        this.respuestaCorrecta = respuestaCorrecta;
    }
    
    @Override
    public Boolean buscar(){
        Scanner s = new Scanner(System.in);
        System.out.println(Text);
        System.out.println("Responda con T si es verdadero de lo contrario f");
        
            try{
                String respuesta=s.next().toUpperCase();
                if(this.respuestaCorrecta==true && "T".equals(respuesta)){
                    System.out.println("Pregunta correcta");
                    return true;
                }
                else if(this.respuestaCorrecta==false && "F".equals(respuesta)){
                    System.out.println("Pregunta correcta");
                    return true;
                }
                else{
                    System.out.println("Respuesta incorrecta");
                    
                    return false;
                    
                }
            }
            catch(Exception e){
                System.out.println("Dato invalido");
            }
        return false;
    }
    
    
}
