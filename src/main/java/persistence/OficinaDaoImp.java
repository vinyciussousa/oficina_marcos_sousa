package persistence;

import model.Oficina;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

import java.util.List;

public class OficinaDaoImp implements OficinaDAO {
    @Override
    public void incluir(Oficina local) {
        Session session = null;
        try {
            SessionFactory sessionFactory =
                    HibernateUtil.getSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(local);
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
    public void alterar(Oficina local) {
        Session session = null;
        try {
            SessionFactory sessionFactory =
                    HibernateUtil.getSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(local);
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
    public void excluir(Oficina local) {
        Session session = null;
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(local);
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
    public List<Oficina> listarTodos() {
        Session session = null;
        List<Oficina> lista = null;
        try {
            SessionFactory sessionFactory =
                    HibernateUtil.getSessionFactory();
            session = sessionFactory.openSession();
            session.beginTransaction();
            lista = (List<Oficina>) session.createQuery("from Oficina").list();
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
