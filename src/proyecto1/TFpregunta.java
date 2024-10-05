/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

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
        
        return null;
    }
    
    
}
