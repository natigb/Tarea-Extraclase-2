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