package com.intelisoft.tournamentbel.dao.util;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


/**
 * Created by Pavel on 02.08.2017.
 */
public class HibernateUtil {
    private static HibernateUtil HIBERNATE_UTIL;
    private static SessionFactory factory;

    private HibernateUtil() {

    }

    public static HibernateUtil getInstance(){
        if (HIBERNATE_UTIL==null){
            HIBERNATE_UTIL = new HibernateUtil();
        }
        return HIBERNATE_UTIL;
    }

    public Session getSession() {
        if (factory == null) {
            createFactory();
        }
        return factory.openSession();
    }

    private void createFactory(){
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        factory = configuration.buildSessionFactory(builder.build());
    }

    public void close(){
        if (factory != null) {
           factory.close();
        }
    }
}
