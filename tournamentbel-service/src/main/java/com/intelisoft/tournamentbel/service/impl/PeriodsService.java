package com.intelisoft.tournamentbel.service.impl;

import com.intelisoft.tournamentbel.dao.impl.PeriodsDaoImpl;
import com.intelisoft.tournamentbel.dao.util.HibernateUtil;
import com.intelisoft.tournamentbel.entity.Periods;
import org.apache.log4j.Logger;
import org.hibernate.Session;

public class PeriodsService {
    private final Logger logger =  Logger.getLogger(PeriodsService.class);
    PeriodsDaoImpl periodsDao = new PeriodsDaoImpl();
    public void add (Periods period){
        Session session = HibernateUtil.getSession();
        try {
            session.beginTransaction();
            periodsDao.save(period, session);
            session.getTransaction().commit();
        }catch  (Exception e){
            logger.error("Error add period");
            session.getTransaction().rollback();
        }
    }

}
