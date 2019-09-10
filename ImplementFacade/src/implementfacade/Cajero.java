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
public class Cajero {
    
    public void recibirPedido(){
        System.out.println("¡Su pedido ha sido confirmado!");
    }
    public void facturarPedido(int tarjeta){
        System.out.println("Se han rebajado de la tarjeta "+tarjeta);
    }
    
}
