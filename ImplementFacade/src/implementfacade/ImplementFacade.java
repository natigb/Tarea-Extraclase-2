/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementfacade;

import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author Nati Gonzalez
 */
public class ImplementFacade {
    public int tarjeta;
    public String nombre;
    public int pedido;
    public String direccion;

    
    
    public void Pedido() throws InterruptedException{
        nombre =JOptionPane.showInputDialog("Ingrese su nombre completo");
        pedido= Integer.parseInt(JOptionPane.showInputDialog("Escoja su pizza: 1- Jamón y queso  2-Pepperonni  3-Brasileña"));
        tarjeta=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de tarjeta"));
        direccion=JOptionPane.showInputDialog("Ingrese su dirección");
        
        Cajero cajero = new Cajero();
        Cocinero cocinero = new Cocinero();
        Repartidor repartidor = new Repartidor();
        TimeUnit.SECONDS.sleep(1);
        cajero.recibirPedido();
        cajero.facturarPedido(tarjeta);
        TimeUnit.SECONDS.sleep(3);
        cocinero.elaborarPedido(pedido);
        TimeUnit.SECONDS.sleep(2);
        cocinero.empacarPedido(nombre);
        TimeUnit.SECONDS.sleep(3);
        repartidor.entregarPedido(direccion);
        
               
    }
    
    
    
}
