package com.proj.view;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.proj.model.entities.CityEntity;

public class HibernateTest {
    public static void run() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        CityEntity city = new CityEntity();
        city.setCityName("Fredericton");

        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            // Save the entity
            session.save(city);
            transaction.commit();
        } catch (RuntimeException e) {
            if (transaction != null) transaction.rollback();
            throw e;
        } finally {
            session.close();
        }

        sessionFactory.close();
    }
}
