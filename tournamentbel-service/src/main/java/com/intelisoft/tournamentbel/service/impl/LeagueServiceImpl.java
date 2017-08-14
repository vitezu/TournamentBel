package com.intelisoft.tournamentbel.service.impl;

import com.intelisoft.tournamentbel.api.services.ILeagueService;
import com.intelisoft.tournamentbel.dao.impl.LeaguesDaoImpl;
import com.intelisoft.tournamentbel.dao.util.HibernateUtil;
import com.intelisoft.tournamentbel.entity.Leagues;
import org.apache.log4j.Logger;
import org.hibernate.Session;

/**
 * Created by Pavel on 08.08.2017.
 */
public class LeagueServiceImpl implements ILeagueService {
    private final Logger logger =  Logger.getLogger(LeagueServiceImpl.class);
    LeaguesDaoImpl leaguesDaoImpl = new LeaguesDaoImpl();

    public void add (Leagues league){
        Session session = HibernateUtil.getSession();
        try {
            session.beginTransaction();
            leaguesDaoImpl.save(league, session);
            session.getTransaction().commit();
        }catch  (Exception e){
            logger.error("Error add League");
            session.getTransaction().rollback();
        }
    }
}
