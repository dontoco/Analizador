/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Victor
 */
public class Pila {

    private Nodo UltimoValorIngresado;

    public Pila() {
        UltimoValorIngresado = null;
    }

    // metodo para insertart dentro de la pila 
    public void Insertar(char valor) {
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.informacion = valor;

        if (UltimoValorIngresado == null) {
            nuevo_nodo.siguente = null;
            UltimoValorIngresado = nuevo_nodo;

        } else {
            nuevo_nodo.siguente = UltimoValorIngresado;
            UltimoValorIngresado = nuevo_nodo;

        }

    }
    //metodo para entraer de la pila 
    public char Extraer(){
        if (UltimoValorIngresado != null){
            char informacion = UltimoValorIngresado.informacion;
            UltimoValorIngresado = UltimoValorIngresado.siguente;
            return informacion;
        }
        else {
            // esta wea da lo mismo es solo para que no arroje error 
            return Character.MAX_VALUE;
        }
        
    }
    // metodo para saber si la pila esta vacia 
    public boolean PilaVacia(){
        return UltimoValorIngresado == null;
        
    }
    
}
