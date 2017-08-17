package com.intelisoft.tournamentbel.dao.impl;


import com.intelisoft.tournamentbel.api.dao.IMatchesDao;
import com.intelisoft.tournamentbel.entity.Matches;
import com.intelisoft.tournamentbel.entity.Players;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.sql.JoinType;

import java.util.List;

/**
 * Created by Pavel on 02.08.2017.
 */
public class MatchesDaoImpl extends AbstractDaoImpl<Matches> implements IMatchesDao {


    public MatchesDaoImpl() {
        super(Matches.class);
    }

    public List<Matches> getWithGoals(Session session){
        List<Matches> matches = null;
        Criteria criteria = session.createCriteria(Matches.class).createAlias("goals","c", JoinType.LEFT_OUTER_JOIN);
//                .add(Restrictions.eq("lastName", "Sidorov"));

        return matches = criteria.list();
        }

    }


