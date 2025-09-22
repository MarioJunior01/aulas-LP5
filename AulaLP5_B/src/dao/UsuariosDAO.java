/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Usuarios;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u04584043221
 */
public class UsuariosDAO extends AbstractDAO {

    @Override
    public void insert(Object object) {

        session.beginTransaction();
        session.save(object);
        session.getTransaction().begin();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.update(object);
        session.flush();
        session.clear();
        session.getTransaction().begin();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().begin();
    }

  
    @Override
    public Object list(int codigo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Usuarios.class);
        criteria.add(Restrictions.eq("idUsuarios",codigo));
        List lista = criteria.list();
        session.getTransaction().begin();


        return lista;

    }

    
    @Override
    public Object  listAll() {
        session.beginTransaction();
        Criteria criteia = session.createCriteria(Usuarios.class);
        List lista = criteia.list();
        session.getTransaction().commit();

        return lista;
    }
    public static void main(String[] args) {
        UsuariosDAO usuariosDAO = new  UsuariosDAO();
        usuariosDAO.listAll();
        System.out.println("Deu certo");
    }

}
