package com.intelisoft.tournamentbel.service.impl;

import com.intelisoft.tournamentbel.api.services.IPlayersService;
import com.intelisoft.tournamentbel.dao.impl.PlayersDaoImpl;
import com.intelisoft.tournamentbel.dao.util.HibernateUtil;
import com.intelisoft.tournamentbel.entity.Players;
import org.apache.log4j.Logger;
import org.hibernate.Session;


public class PlayersServiceImpl implements IPlayersService {
    private final Logger logger =  Logger.getLogger(PlayersServiceImpl.class);
    PlayersDaoImpl playersDaoImpl = new PlayersDaoImpl();

        public void add (Players player){
        Session session = HibernateUtil.getSession();
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
        Session session = HibernateUtil.getSession();
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
        Session session = HibernateUtil.getSession();
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

        Session session = HibernateUtil.getSession();
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
