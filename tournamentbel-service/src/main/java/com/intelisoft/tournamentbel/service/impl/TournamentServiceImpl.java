package com.intelisoft.tournamentbel.service.impl;


import com.intelisoft.tournamentbel.api.dao.ITournamentsDao;
import com.intelisoft.tournamentbel.api.services.ITournamentsService;
import com.intelisoft.tournamentbel.dao.impl.TournamentsDaoImpl;
import com.intelisoft.tournamentbel.dao.util.HibernateUtil;
import com.intelisoft.tournamentbel.entity.Tournaments;
import org.apache.log4j.Logger;
import org.hibernate.Session;

/**
 * Created by Pavel on 08.08.2017.
 */
public  class TournamentServiceImpl implements ITournamentsService{
    private final Logger logger =  Logger.getLogger(TournamentServiceImpl.class);
    private final TournamentsDaoImpl tournamentsDaoImpl = new TournamentsDaoImpl();
    private final HibernateUtil hibernateUtil = HibernateUtil.getInstance();


    public void add (Tournaments tournament){
        Session session = hibernateUtil.getSession();
        try {
            session.beginTransaction();
            tournamentsDaoImpl.save(tournament, session);
            session.getTransaction().commit();
        }catch  (Exception e){
            logger.error("Error add Tournament");
            session.getTransaction().rollback();
        }
    }

    public void delete(Tournaments tournament) {
        Session session = hibernateUtil.getSession();
        try {
            session.beginTransaction();
            tournamentsDaoImpl.delete(tournament, session);
            session.getTransaction().commit();
        }catch  (Exception e){
            logger.error("Error delete Tournament");
            session.getTransaction().rollback();
        }
    }
}
