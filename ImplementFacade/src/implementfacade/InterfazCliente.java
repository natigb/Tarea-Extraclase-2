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
public class InterfazCliente {
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        ImplementFacade facade = new ImplementFacade();
        facade.Pedido();
    }
}
