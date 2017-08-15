package com.intelisoft.tournamentbel.service.impl;

import com.intelisoft.tournamentbel.api.services.IPeriodsService;
import com.intelisoft.tournamentbel.dao.impl.PeriodsDaoImpl;
import com.intelisoft.tournamentbel.dao.util.HibernateUtil;
import com.intelisoft.tournamentbel.entity.Periods;
import org.apache.log4j.Logger;
import org.hibernate.Session;

public class PeriodsServiceImpl implements IPeriodsService {
    private final Logger logger =  Logger.getLogger(PeriodsServiceImpl.class);
    private final PeriodsDaoImpl periodsDaoImpl = new PeriodsDaoImpl();
    private final HibernateUtil hibernateUtil = HibernateUtil.getInstance();

    public void add (Periods period){
        Session session = hibernateUtil.getSession();
        try {
            session.beginTransaction();
            periodsDaoImpl.save(period, session);
            session.getTransaction().commit();
        }catch  (Exception e){
            logger.error("Error add period");
            session.getTransaction().rollback();
        }
    }

}
