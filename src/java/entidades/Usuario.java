package entidades;
// Generated 19/07/2019 08:31:04 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int idUsuario;
     private String nombreUsuario;
     private String password;
     private Integer idCliente;
     private Integer idPersonal;
     private Set reservacistas = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(int idUsuario, String nombreUsuario, String password) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }
    public Usuario(int idUsuario, String nombreUsuario, String password, Integer idCliente, Integer idPersonal, Set reservacistas) {
       this.idUsuario = idUsuario;
       this.nombreUsuario = nombreUsuario;
       this.password = password;
       this.idCliente = idCliente;
       this.idPersonal = idPersonal;
       this.reservacistas = reservacistas;
    }
   
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public Integer getIdPersonal() {
        return this.idPersonal;
    }
    
    public void setIdPersonal(Integer idPersonal) {
        this.idPersonal = idPersonal;
    }
    public Set getReservacistas() {
        return this.reservacistas;
    }
    
    public void setReservacistas(Set reservacistas) {
        this.reservacistas = reservacistas;
    }




}

