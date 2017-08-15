package com.intelisoft.tournamentbel.service.impl;


import com.intelisoft.tournamentbel.api.services.ICommandsPlayersService;
import com.intelisoft.tournamentbel.dao.impl.CommandsPlayersDaoImpl;
import com.intelisoft.tournamentbel.dao.util.HibernateUtil;
import com.intelisoft.tournamentbel.entity.CommandsPlayers;
import org.apache.log4j.Logger;
import org.hibernate.Session;

public class CommandsPlayersServiceImpl implements ICommandsPlayersService {
    private final Logger logger =  Logger.getLogger(CommandsPlayersServiceImpl.class);
    private final CommandsPlayersDaoImpl commandsPlayersDaoImpl = new CommandsPlayersDaoImpl();
    private final HibernateUtil hibernateUtil = HibernateUtil.getInstance();


    public void add (CommandsPlayers commandsPlayers){
        Session session = hibernateUtil.getSession();
        try {
            session.beginTransaction();
            commandsPlayersDaoImpl.save(commandsPlayers, session);
            session.getTransaction().commit();
        }catch  (Exception e){
            logger.error("Error add CommandsPlayers");
            session.getTransaction().rollback();
        }
    }
}
