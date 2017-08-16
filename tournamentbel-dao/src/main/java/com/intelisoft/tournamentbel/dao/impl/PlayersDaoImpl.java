package com.intelisoft.tournamentbel.dao.impl;

import com.intelisoft.tournamentbel.api.dao.IPlayersDao;
import com.intelisoft.tournamentbel.entity.Players;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel on 02.08.2017.
 */
public class PlayersDaoImpl extends AbstractDaoImpl<Players> implements IPlayersDao {

    public PlayersDaoImpl() {
        super(Players.class);
    }

    public void getWithCommands (Session session) {
        List<Players> players = new ArrayList<Players>();
        Criteria criteria = session.createCriteria(Players.class).createAlias("commandsPlayers","c", JoinType.LEFT_OUTER_JOIN)
                .add(Restrictions.eq("lastName", "Sidorov"));

        players = criteria.list();
        for (Players p : players){
            System.out.println(p);
        }
    }
    public void foundByName (Session session) {
        Criteria criteria = session.createCriteria(Players.class)
                .add(Restrictions.eq("lastName", "Popov"));

        List<Players> player = criteria.list();

        for (Players p : player) {

            System.out.println(p);
        }

    }
}
