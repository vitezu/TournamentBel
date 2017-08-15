package com.intelisoft.tournamentbel.dao.impl;


import com.intelisoft.tournamentbel.api.dao.ILeaguesDao;
import com.intelisoft.tournamentbel.entity.Leagues;


/**
 * Created by Pavel on 02.08.2017.
 */
public class LeaguesDaoImpl extends AbstractDaoImpl<Leagues> implements ILeaguesDao {


    public LeaguesDaoImpl() {
        super(Leagues.class );
    }
}
