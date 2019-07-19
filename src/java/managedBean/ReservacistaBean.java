/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import dao.AtencionDao;
import dao.ClienteDao;
import dao.ReservacistaDao;
import dao.TiporeservaDao;
import dao.UsuarioDao;
import entidades.Cliente;
import entidades.Reservacista;
import entidades.Tiporeserva;
import entidades.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Jerson
 */
@ManagedBean
@ViewScoped
public class ReservacistaBean implements Serializable {

    private Reservacista reservacista;
    private boolean banderaSelect;
    private Cliente cliente;
    private Tiporeserva tiporeserva;
    private Usuario usuario;
    private int idCliente;
    private int idTipoReserva;
    private int idUsuario;
    private ArrayList listarCliente;
    private ArrayList listarTipoReserva;
    private ArrayList listarUsuario;

    public ReservacistaBean() {
        listarCliente = new ArrayList();
        listarTipoReserva = new ArrayList();
        listarUsuario = new ArrayList();
        cliente = new Cliente();
        tiporeserva = new Tiporeserva();
        usuario = new Usuario();
        reservacista = new Reservacista();
        listasCombos();
    }

    public void listasCombos() {
        ClienteDao clientedao = new ClienteDao();
        TiporeservaDao tiporeservadao = new TiporeservaDao();
        UsuarioDao usuariodao = new UsuarioDao();

        listarCliente = clientedao.listarClientes();
        listarTipoReserva = tiporeservadao.listarTiporeserva();
        listarUsuario = usuariodao.listarUsuario();
    }

    public String guardar() {
        ReservacistaDao dao = new ReservacistaDao();

        cliente.setIdCliente(idCliente);
        tiporeserva.setIdTipoReserva(idTipoReserva);
        usuario.setIdUsuario(idUsuario);

        reservacista.setCliente(cliente);
        reservacista.setTiporeserva(tiporeserva);
        reservacista.setUsuario(usuario);
        boolean respuesta = dao.guardarReservacista(reservacista);
        if (respuesta) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Correcto", "Se Registro Crrectamente"));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Error", "No se pudo registrar"));
        }
        return "/RegistroReservaCita";

    }

    public Reservacista getReservacista() {
        return reservacista;
    }

    public void setReservacista(Reservacista reservacista) {
        this.reservacista = reservacista;
    }

    public String guardarReservacista() {

        ReservacistaDao dao = new ReservacistaDao();
        boolean respuesta = dao.guardarReservacista(reservacista);

        if (respuesta) {

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Correcto", "Se Registro Crrectamente"));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Error", "No se pudo registrar"));
        }
        return "/RegistroReservaCita.xhtml";
    }

    public String actualizarReservacista() {
        ReservacistaDao dao = new ReservacistaDao();
        boolean respuesta = dao.actualizarReservacista(reservacista);
        if (respuesta) {

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Correcto", "Registro actualizo con exito"));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Error", "No se pudo actualizar"));
        }
        return "/RegistroReservaCita.xhtml";
    }

    public ArrayList<Reservacista> listarReservacista() {
        ArrayList<Reservacista> milista = new ArrayList<>();
        ReservacistaDao dao = new ReservacistaDao();
        milista = dao.listarReservacista();

        return milista;
    }

    public String limpiar() {
        return "/RegistroReservaCita.xhtml";
    }

    public String eliminarReservacista() {
        ReservacistaDao dao = new ReservacistaDao();
        boolean respuesta = dao.eliminarReservacista(reservacista);
        if (respuesta) {

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Correcto", "Registro Borrado con exito"));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Error", "No se pudo eliminar"));
        }
        return "/RegistroReservaCita.xhtml";
    }

    public void selectBandera() {
        banderaSelect = true;
    }

    public boolean isBanderaSelect() {
        return banderaSelect;
    }

    public void setBanderaSelect(boolean banderaSelect) {
        this.banderaSelect = banderaSelect;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tiporeserva getTiporeserva() {
        return tiporeserva;
    }

    public void setTiporeserva(Tiporeserva tiporeserva) {
        this.tiporeserva = tiporeserva;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdTipoReserva() {
        return idTipoReserva;
    }

    public void setIdTipoReserva(int idTipoReserva) {
        this.idTipoReserva = idTipoReserva;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public ArrayList getListarCliente() {
        return listarCliente;
    }

    public void setListarCliente(ArrayList listarCliente) {
        this.listarCliente = listarCliente;
    }

    public ArrayList getListarTipoReserva() {
        return listarTipoReserva;
    }

    public void setListarTipoReserva(ArrayList listarTipoReserva) {
        this.listarTipoReserva = listarTipoReserva;
    }

    public ArrayList getListarUsuario() {
        return listarUsuario;
    }

    public void setListarUsuario(ArrayList listarUsuario) {
        this.listarUsuario = listarUsuario;
    }

}
