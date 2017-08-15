package com.intelisoft.tournamentbel.dao.impl;

import com.intelisoft.tournamentbel.api.dao.ICommandsDao;
import com.intelisoft.tournamentbel.entity.Commands;



/**
 * Created by Pavel on 02.08.2017.
 */
public class CommandsDaoImpl  extends AbstractDaoImpl<Commands> implements ICommandsDao  {


    public CommandsDaoImpl() {
        super(Commands.class);
    }
}
