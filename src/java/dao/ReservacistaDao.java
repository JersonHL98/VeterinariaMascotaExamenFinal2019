/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Reservacista;
import interfaces.IReservacista;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utilitarios.HibernateUtil;

/**
 *
 @author Jerson
 */
public class ReservacistaDao implements IReservacista {

    @Override
    public boolean guardarReservacista(Reservacista reservacista) {
        //Construir una nueva session y una nueva transaccion
        boolean respuesta = true;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = sesion.beginTransaction();

        //Registrar en la base de datos la reservacista
        try {
            sesion.save(reservacista);
            transaccion.commit();
        } catch (Exception e) {
            respuesta = false;
        }
        sesion.close();
        return respuesta;

    }

    @Override
    public ArrayList<Reservacista> listarReservacista() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        ArrayList<Reservacista> milista = new ArrayList<>();
        //Crear la consulta hacia la base de datos
        Query query = session.createQuery("FROM Reservacista");

        //Ejecutar la consulta y obtener la lista
        milista = (ArrayList<Reservacista>) query.list();
        session.close();
        return milista;

    }

    @Override
    public boolean actualizarReservacista(Reservacista reservacista) {
        boolean respuesta = true;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = sesion.beginTransaction();
        try {
            sesion.update(reservacista);
            transaccion.commit();
        } catch (Exception e) {
            respuesta = false;
        }
        sesion.close();
        return respuesta;
    }

    @Override
    public Integer listCount(Session sesion) {
        String sql = "select count(*) From Reservacista";
        Query query = sesion.createQuery(sql);
        Long long1 = (Long) query.uniqueResult();
        Integer count = long1.intValue();
        return count;
    }

    @Override
    public boolean eliminarReservacista(Reservacista reservacista) {

        boolean respuesta = true;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = sesion.beginTransaction();
        try {
            sesion.delete(reservacista);
            transaccion.commit();
            respuesta = true;
        } catch (Exception e) {
            respuesta = false;
            System.out.println(e.getMessage());
        }
        sesion.close();
        return respuesta;
    }

}
