package plantilla.logica;

import java.util.Date;


public class Ticket {
    private int numero;
    private int fila;
    private int asiento;
    private double precio;
    private Date fechaCompra;
    private Date fechaValidez;

    public Ticket(){

    }

    public Ticket(int numero, int fila, int asiento, double precio, Date fechaCompra, Date fechaValidez){
        this.numero= numero;
        this.fila = fila;
        this.asiento = asiento;
        this.precio = precio;
        this.fechaCompra = fechaCompra;
        this.fechaValidez = fechaValidez;
    }

    public int getNumero (){
        return numero;
    }

    public void setNumero (int numero){
        this.numero = numero;
    }

    public int getFila (){
        return fila;
    }

    public int setFila (){
        return fila;
    }

    public int getAsiento(){
        return asiento;
    }

    public int setAsiento(){
        return asiento;
    }

    public double getPrecio(){
        return precio;
    }

    public double setPrecio(){
        return precio;
    }

    public Date getFechaCompra(){
        return fechaCompra;
    }

    public Date setFechaCompra(){
        return fechaCompra;
    }

    public Date getFechaValidez(){
        return fechaValidez;
    }

    public Date setFechaValidez(){
        return fechaValidez;
    }
}
