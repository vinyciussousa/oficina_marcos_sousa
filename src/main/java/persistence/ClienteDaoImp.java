package persistence;

import model.Cliente;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

import java.util.List;

public class ClienteDaoImp implements ClienteDAO {
    @Override
    public void incluir(Cliente humanoide) {
        Session session = null;
        try {
            SessionFactory sessionFactory =
                    HibernateUtil.getSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(humanoide);
            session.getTransaction().commit();
        } catch (Exception e) {
            if (session != null) {
                session.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public void alterar(Cliente humanoide) {
        Session session = null;
        try {
            SessionFactory sessionFactory =
                    HibernateUtil.getSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(humanoide);
            session.getTransaction().commit();
        } catch (Exception e) {
            if (session != null) {
                session.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public void excluir(Cliente humanoide) {
        Session session = null;
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(humanoide);
            session.getTransaction().commit();
        } catch (Exception e) {
            if (session != null) {
                session.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<Cliente> listarTodos() {
        Session session = null;
        List<Cliente> lista = null;
        try {
            SessionFactory sessionFactory =
                    HibernateUtil.getSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            lista = (List<Cliente>) session.createQuery("from Cliente").list();
            session.getTransaction().commit();
        } catch (Exception e) {
            if (session != null) {
                session.getTransaction().rollback();
            }
            return lista;
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return lista;
    }
}