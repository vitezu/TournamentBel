package com.intelisoft.tournamentbel.service.impl;


import com.intelisoft.tournamentbel.dao.impl.PlayersDaoImpl;
import com.intelisoft.tournamentbel.dao.util.HibernateUtil;
import com.intelisoft.tournamentbel.entity.Players;
import org.apache.log4j.Logger;
import org.hibernate.Session;


public class PlayersService {
    private final Logger logger =  Logger.getLogger(PlayersService.class);
    PlayersDaoImpl playersDao = new PlayersDaoImpl();
    public void add (Players player){
        Session session = HibernateUtil.getSession();
        try {
            session.beginTransaction();
            playersDao.save(player, session);
            session.getTransaction().commit();
        }catch  (Exception e){
            logger.error("Error add Players");
            session.getTransaction().rollback();
        }
    }


}
