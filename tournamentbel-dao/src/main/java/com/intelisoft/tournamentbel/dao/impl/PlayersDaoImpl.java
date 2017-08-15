package com.intelisoft.tournamentbel.dao.impl;

import com.intelisoft.tournamentbel.api.dao.IPlayersDao;
import com.intelisoft.tournamentbel.entity.Players;
import com.intelisoft.tournamentbel.entity.Tournaments;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pavel on 02.08.2017.
 */
public class PlayersDaoImpl extends AbstractDaoImpl<Players> implements IPlayersDao {

    public List<Players> GetWithCommands (Session session) {
        List<Players> players = new ArrayList<Players>();
        Criteria criteria = session.createCriteria(Players.class).createCriteria("commandsPlayer")
                .add(Restrictions.eq("lastName", "Popov"));
//.createCriteria("owner")
//                .add(Restrictions.eq("lastName", "Testoff"))

        return players;
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
