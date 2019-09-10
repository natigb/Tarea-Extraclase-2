/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementfacade;

/**
 *
 * @author Nati Gonzalez
 */
public class Cocinero {
    
    public void elaborarPedido(int numero){
        System.out.println("Elaborando pedido #"+numero);
    }
    public void empacarPedido(String nombre){
        System.out.println("Empacando pedido de: "+nombre);
    }
}
