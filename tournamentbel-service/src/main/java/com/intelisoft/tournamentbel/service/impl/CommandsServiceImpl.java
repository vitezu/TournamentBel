package com.intelisoft.tournamentbel.service.impl;

import com.intelisoft.tournamentbel.api.services.ICommandsService;
import com.intelisoft.tournamentbel.dao.impl.CommandsDaoImpl;
import com.intelisoft.tournamentbel.dao.util.HibernateUtil;
import com.intelisoft.tournamentbel.entity.Commands;
import org.apache.log4j.Logger;
import org.hibernate.Session;

public class CommandsServiceImpl implements ICommandsService {
    private final Logger logger =  Logger.getLogger(CommandsServiceImpl.class);
    private final CommandsDaoImpl commandsDaoImpl = new CommandsDaoImpl();
    private final HibernateUtil hibernateUtil = HibernateUtil.getInstance();


    public void add (Commands command){
        Session session = hibernateUtil.getSession();
        try {
        session.beginTransaction();
            commandsDaoImpl.save(command, session);
        session.getTransaction().commit();
        }catch  (Exception e){
            logger.error("Error add Commands");
            session.getTransaction().rollback();
        }
    }
}
