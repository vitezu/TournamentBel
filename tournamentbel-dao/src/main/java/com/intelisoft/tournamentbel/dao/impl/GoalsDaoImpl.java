package com.intelisoft.tournamentbel.dao.impl;

import com.intelisoft.tournamentbel.api.dao.IGoalsDao;
import com.intelisoft.tournamentbel.entity.Goals;


/**
 * Created by Pavel on 02.08.2017.
 */
public class GoalsDaoImpl extends AbstractDaoImpl<Goals> implements IGoalsDao {
    public GoalsDaoImpl() {
        super(Goals.class);
    }
}
