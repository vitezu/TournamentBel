package com.intelisoft.tournamentbel.dao.impl;


import com.intelisoft.tournamentbel.api.dao.IMatchesDao;
import com.intelisoft.tournamentbel.entity.Matches;
import org.hibernate.Session;

import java.util.List;

/**
 * Created by Pavel on 02.08.2017.
 */
public class MatchesDaoImpl extends AbstractDaoImpl<Matches> implements IMatchesDao {


    public MatchesDaoImpl() {
        super(Matches.class);
    }
}
