package com.intelisoft.tournamentbel.service.impl;

import com.intelisoft.tournamentbel.dao.impl.CommandsDaoImpl;
import com.intelisoft.tournamentbel.dao.util.HibernateUtil;
import com.intelisoft.tournamentbel.entity.Commands;
import org.apache.log4j.Logger;
import org.hibernate.Session;

public class CommandsService {
    private final Logger logger =  Logger.getLogger(CommandsService.class);
    CommandsDaoImpl commandsDao = new CommandsDaoImpl();
    public void add (Commands command){
        Session session = HibernateUtil.getSession();
        try {
        session.beginTransaction();
        commandsDao.save(command, session);
        session.getTransaction().commit();
        }catch  (Exception e){
            logger.error("Error add Commands");
            session.getTransaction().rollback();
        }
    }
}
