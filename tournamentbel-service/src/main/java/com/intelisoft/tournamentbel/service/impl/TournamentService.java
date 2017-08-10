package com.intelisoft.tournamentbel.service.impl;


import com.intelisoft.tournamentbel.dao.impl.TournamentsDaoImpl;
import com.intelisoft.tournamentbel.dao.util.HibernateUtil;
import com.intelisoft.tournamentbel.entity.Tournaments;
import org.apache.log4j.Logger;
import org.hibernate.Session;

/**
 * Created by Pavel on 08.08.2017.
 */
public class TournamentService {
    private final Logger logger =  Logger.getLogger(TournamentService.class);
    TournamentsDaoImpl tournamentsDao = new TournamentsDaoImpl();
    public void add (Tournaments tournament){
        Session session = HibernateUtil.getSession();
        try {
            session.beginTransaction();
            tournamentsDao.save(tournament, session);
            session.getTransaction().commit();
        }catch  (Exception e){
            logger.error("Error add Tournament");
            session.getTransaction().rollback();
        }
    }
}
