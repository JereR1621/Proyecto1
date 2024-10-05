/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1;

/**
 *
 * @author jere
 */
public abstract class Pregunta {
    private int Peso;
    private final String Text;
    
    
    //constructor
    public Pregunta(int Peso, String Text) {
        this.Peso = Peso;
        this.Text = Text;
    }
    
    
    
    //getter-setter
    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public String getText() {
        return Text;
    }
    
    
    
    
    //metodo abstracto
    public abstract Boolean buscar();
}
