package com.intelisoft.tournamentbel.dao.impl;


import com.intelisoft.tournamentbel.api.dao.IPeriodsDao;
import com.intelisoft.tournamentbel.entity.Periods;


/**
 * Created by Pavel on 02.08.2017.
 */
public class PeriodsDaoImpl extends AbstractDaoImpl<Periods> implements IPeriodsDao {


    public PeriodsDaoImpl() {
        super(Periods.class);
    }
}
