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