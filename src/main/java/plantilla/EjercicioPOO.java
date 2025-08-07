package plantilla;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



/**
 *
 * @author Marcelo
 */
public class EjercicioPoo {

    //Plantear un sistema de tickets que obtendrá cada persona al reservar su asiento.
    //Para ello tener emn cuenta lo siguiente:

    /*1. Crear la "plantilla" necesaria para guardar los siguientes datos por
    ticket; numero, fila, asiento, fecha de compra, fecha de validez, precio

    2. Usar una "base de datos lógica" mediante alguna estructura de datos
    que permita almacenar un número indeterminado de tickets. Cargar una
    serie de tickets a dicha estructura.

    3. Crear un método que recorra la estructura seleccionada y sume los precios
    de todos los tickets. Mostrar pot pantañña el total. No es necesario IGU

    4. Solicitar al usuario que ingrese un número de fila. A partid de esto
    mostrar por pantalla los datos de los tickets pertenecientes a esa fila. 
    No es necesario IGU para esto

    .Consideraciones: No es necesaria la implementación de IGU ni de BD.
    Se evaluará 100% el menajo lógico del desarrollo de la aplicación.
    Extra: En caso que se desee agregar una plantilla para clientes con los
    datos: dni, id, nombre, apellido. ¿Cómo se implementaría? ¿De qué manera 
    se relacionaría con ticket para que el mismo posea los datos del cliente
    que tiene asignado? Realizar la implemmentación.

    */

    public static void main(String[] args) {
        //Estructura de datos con herencia y polimorfimo
        List<Ticket> listaTickets = new ArrayList<Ticket>();

        //creacion de ticket mediante parametros
        Ticket ticket1 = new Ticket(1, 1, 2, 6500, new Date(), new Date());
        Ticket ticket2 = new Ticket(1, 1, 1, 6500, new Date(), new Date());

        //creacion de ticket mediante construtor vacio y aplico encapsulamiento
        Ticket ticket3 = new Ticket();
        ticket3.setNumero(3);
        ticket3.setFila(3);
        ticket3.setAsiento(1);
        ticket3.setPrecio(8000);
        ticket3.setFechaCompra(new Date());
        ticket3.setFechaValidez(new Date());

        //agrego los elementos a la lista
        listaTickets.add(ticket1);
        listaTickets.add(ticket2);
        listaTickets.add(ticket3);

        //PUNTO 3: Suma de precios de todos los tickets:

        double suma = 0;
        for(Ticket tick: listaTickets){
            suma += tick.getPrecio();
        }

        System.out.println("La suma de precio de todos los tickets es: " + suma);
    }
}
