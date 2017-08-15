package com.intelisoft.tournamentbel.dao.impl;

import com.intelisoft.tournamentbel.api.dao.IGoalsDao;
import com.intelisoft.tournamentbel.entity.Goals;
import org.hibernate.Criteria;
import org.hibernate.Session;

import java.util.List;


/**
 * Created by Pavel on 02.08.2017.
 */
public class GoalsDaoImpl extends AbstractDaoImpl<Goals> implements IGoalsDao {
    public GoalsDaoImpl() {
        super(Goals.class);
    }

    @Override
    public List<Goals> getAll(Session session) {
        return super.getAll(session);

    }
}
