package com.intelisoft.tournamentbel.dao.util;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


/**
 * Created by Pavel on 02.08.2017.
 */
public class HibernateUtil {
    private static SessionFactory factory;
    private static Session session;


    private HibernateUtil() {
    }

    public static Session getSession() {

        if (factory == null) {
            Configuration configuration = new Configuration().configure();
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
            factory = configuration.buildSessionFactory(builder.build());
            session = factory.openSession();
        }
        return session;
    }
}
