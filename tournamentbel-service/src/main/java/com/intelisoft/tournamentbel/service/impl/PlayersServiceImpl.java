package com.intelisoft.tournamentbel.service.impl;

import com.intelisoft.tournamentbel.api.services.IPlayersService;
import com.intelisoft.tournamentbel.dao.impl.PlayersDaoImpl;
import com.intelisoft.tournamentbel.dao.util.HibernateUtil;
import com.intelisoft.tournamentbel.entity.Players;
import org.apache.log4j.Logger;
import org.hibernate.Session;


public class PlayersServiceImpl implements IPlayersService {
    private final Logger logger =  Logger.getLogger(PlayersServiceImpl.class);
    private final PlayersDaoImpl playersDaoImpl = new PlayersDaoImpl();
    private final HibernateUtil hibernateUtil = HibernateUtil.getInstance();

        public void add (Players player){
        Session session = hibernateUtil.getSession();
        try {
            session.beginTransaction();
            playersDaoImpl.save(player, session);
            session.getTransaction().commit();
        }catch  (Exception e){
            logger.error("Error add Players");
            session.getTransaction().rollback();
        }

    }

    public void delete(Players player) {
        Session session = hibernateUtil.getSession();
        try {
            session.beginTransaction();
            playersDaoImpl.delete(player, session);
            session.getTransaction().commit();
        }catch  (Exception e){
            logger.error("Error add Players");
            session.getTransaction().rollback();
        }
    }

    public void GetWithCommand() {
        Session session = hibernateUtil.getSession();
        try {
            session.beginTransaction();
            playersDaoImpl.GetWithCommands(session);
            session.getTransaction().commit();
        } catch (Exception e) {
            logger.error("Error GetWithCommand");
            session.getTransaction().rollback();
        }


    }

    public void foundByName(){

        Session session = hibernateUtil.getSession();
        try {
            session.beginTransaction();
            playersDaoImpl.foundByName(session);
            session.getTransaction().commit();
        } catch (Exception e) {
            logger.error("Error foundByName");
            session.getTransaction().rollback();
        }
    }
}
