package com.intelisoft.tournamentbel.service.impl;


import com.intelisoft.tournamentbel.api.services.IMatchesService;
import com.intelisoft.tournamentbel.dao.impl.MatchesDaoImpl;

import com.intelisoft.tournamentbel.dao.util.HibernateUtil;


import com.intelisoft.tournamentbel.entity.*;
import org.apache.log4j.Logger;
import org.hibernate.Session;

import java.util.List;


/**
 * Created by Pavel on 06.08.2017.
 */
public class MatchesServiceImpl implements IMatchesService {

    private final Logger logger =  Logger.getLogger(MatchesServiceImpl.class);
    private final MatchesDaoImpl matchesDaoImpl = new MatchesDaoImpl();
    private final HibernateUtil hibernateUtil = HibernateUtil.getInstance();


    public void add (Matches match){
        Session session = hibernateUtil.getSession();
        try {
            session.beginTransaction();
            matchesDaoImpl.save(match, session);
            session.getTransaction().commit();
        }catch  (Exception e){
            logger.error("Error add Matche");
            session.getTransaction().rollback();
        }
    }

    public void delete(Matches match) {
        Session session = hibernateUtil.getSession();
        try {
            session.beginTransaction();
            matchesDaoImpl.delete(match, session);
            session.getTransaction().commit();
        }catch  (Exception e){
            logger.error("Error delete Matche");
            session.getTransaction().rollback();
        }
    }

    public List<Matches> getWithGoals() {
        List<Matches> matches = null;
        Session session = hibernateUtil.getSession();
        try {
            session.beginTransaction();
            matches = matchesDaoImpl.getWithGoals( session);
            session.getTransaction().commit();
        }catch  (Exception e){
            logger.error("Error getWithGoals Matche");
            session.getTransaction().rollback();
        }
        return matches;
    }


}
