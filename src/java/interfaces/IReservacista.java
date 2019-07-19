/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Reservacista;
import entidades.Reservacista;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Jerson
 */
public interface IReservacista {

    public abstract boolean guardarReservacista(Reservacista reservacista);

    public abstract ArrayList<Reservacista> listarReservacista();

    public abstract boolean actualizarReservacista(Reservacista reservacista);

    public abstract boolean eliminarReservacista(Reservacista reservacista);

    public abstract Integer listCount(Session sesion);
}
