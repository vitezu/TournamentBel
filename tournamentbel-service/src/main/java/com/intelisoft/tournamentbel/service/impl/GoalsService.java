package com.intelisoft.tournamentbel.service.impl;

import com.intelisoft.tournamentbel.dao.impl.GoalsDaoImpl;;
import com.intelisoft.tournamentbel.dao.util.HibernateUtil;
import com.intelisoft.tournamentbel.entity.Goals;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * Created by Pavel on 09.08.2017.
 */
public class GoalsService {
    private final Logger logger = Logger.getLogger(GoalsService.class);
    GoalsDaoImpl goalsDao = new GoalsDaoImpl();

    public void add(Goals goal) {
        Session session = HibernateUtil.getSession();
        try {
            session.beginTransaction();
            goalsDao.save(goal, session);
            session.getTransaction().commit();
        } catch (Exception e) {
            logger.error("Error add goal");
            session.getTransaction().rollback();
        }
    }

    public void delete(Goals goal) {
        Session session = HibernateUtil.getSession();
        try {
            session.beginTransaction();
            goalsDao.delete(goal, session);
            session.getTransaction().commit();
        } catch (Exception e) {
            logger.error("Error delete goal");
            session.getTransaction().rollback();
        }
    }

    public void getAll() {
        List<Goals> goals = null;
        Session session = HibernateUtil.getSession();
        try {
            session.beginTransaction();
            Criteria criteria = session.createCriteria(Goals.class);
            criteria.list();
            goals = criteria.list();
            for (Goals t : goals) {
                System.out.println(t);
            }
            session.getTransaction().commit();
        } catch (Exception e) {
            logger.error("Error getAll Goals");
            session.getTransaction().rollback();
        }
    }


    public Goals getById(Integer id) {
        Criteria criteria = null;
        Session session = HibernateUtil.getSession();
        try {
            session.beginTransaction();
            criteria = session.createCriteria(Goals.class);
            criteria.add(Restrictions.eq("id", id));
            session.getTransaction().commit();
        } catch (Exception e) {
            logger.error("Error getAll Goals");
            session.getTransaction().rollback();
        }

        return (Goals) criteria.list().get(0);
    }
}