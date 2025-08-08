
package plantilla;
import java.util.List;
/**
 * PLANTILLA CLIENTE
 * @author Marcelo
 */
public class Cliente {
    private int id;
    private String dni;
    private String nombre;
    private String apellido;
    private List <Ticket> listsTickets;

    public Cliente() {
    this.listsTickets = new java.util.ArrayList<>();
}

    public Cliente(String apellido, String dni, int id, List<Ticket> listsTickets, String nombre) {
        this.apellido = apellido;
        this.dni = dni;
        this.id = id;
        this.listsTickets = listsTickets;
        this.nombre = nombre;
        this.listsTickets = new java.util.ArrayList<>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public List<Ticket> getListsTickets() {
        return listsTickets;
    }

    public void setListsTickets(List<Ticket> listsTickets) {
        this.listsTickets = listsTickets;
    }
    

}
