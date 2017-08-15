package com.intelisoft.tournamentbel.api.dao;

import com.intelisoft.tournamentbel.api.abstractdao.IGenericDao;
import com.intelisoft.tournamentbel.entity.Players;
import org.hibernate.Session;

/**
 * Created by Pavel on 06.08.2017.
 */
public interface IPlayersDao extends IGenericDao<Players> {
    public void foundByName (Session session);
}
