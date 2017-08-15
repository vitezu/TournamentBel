package com.intelisoft.tournamentbel.dao.impl;


import com.intelisoft.tournamentbel.api.dao.ITournamentsDao;
import com.intelisoft.tournamentbel.entity.Tournaments;

/**
 * Created by Pavel on 02.08.2017.
 */
public class TournamentsDaoImpl extends AbstractDaoImpl<Tournaments> implements ITournamentsDao  {

    public TournamentsDaoImpl() {
        super(Tournaments.class);
    }
}
