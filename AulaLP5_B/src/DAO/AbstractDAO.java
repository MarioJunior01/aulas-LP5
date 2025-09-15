/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author u04584043221
 */
public abstract class AbstractDAO {

    Session session;

    public AbstractDAO() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        session= sessionFactory .openSession();
    }

    public abstract void insert(Object object);

    public abstract void update(Object object);

    public abstract void delete(Object object);

    public abstract void list(int codigo);

    public abstract void listAl();

}
