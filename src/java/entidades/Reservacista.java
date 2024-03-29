package entidades;
// Generated 19/07/2019 08:31:04 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Reservacista generated by hbm2java
 */
public class Reservacista  implements java.io.Serializable {


     private int idReservaCista;
     private Cliente cliente;
     private Tiporeserva tiporeserva;
     private Usuario usuario;
     private Date fecha;

    public Reservacista() {
    }

    public Reservacista(int idReservaCista, Cliente cliente, Tiporeserva tiporeserva, Usuario usuario, Date fecha) {
       this.idReservaCista = idReservaCista;
       this.cliente = cliente;
       this.tiporeserva = tiporeserva;
       this.usuario = usuario;
       this.fecha = fecha;
    }
   
    public int getIdReservaCista() {
        return this.idReservaCista;
    }
    
    public void setIdReservaCista(int idReservaCista) {
        this.idReservaCista = idReservaCista;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Tiporeserva getTiporeserva() {
        return this.tiporeserva;
    }
    
    public void setTiporeserva(Tiporeserva tiporeserva) {
        this.tiporeserva = tiporeserva;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }




}


