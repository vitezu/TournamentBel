package com.intelisoft.tournamentbel.service.impl;


import com.intelisoft.tournamentbel.dao.impl.CommandsPlayersDaoImpl;
import com.intelisoft.tournamentbel.dao.util.HibernateUtil;
import com.intelisoft.tournamentbel.entity.CommandsPlayers;
import org.apache.log4j.Logger;
import org.hibernate.Session;

public class CommandsPlayersService {
    private final Logger logger =  Logger.getLogger(CommandsPlayersService.class);
    CommandsPlayersDaoImpl commandsPlayersDao = new CommandsPlayersDaoImpl();
    public void add (CommandsPlayers commandsPlayers){
        Session session = HibernateUtil.getSession();
        try {
            session.beginTransaction();
            commandsPlayersDao.save(commandsPlayers, session);
            session.getTransaction().commit();
        }catch  (Exception e){
            logger.error("Error add CommandsPlayers");
            session.getTransaction().rollback();
        }
    }
}
