package com.intelisoft.tournamentbel.api.services;

import com.intelisoft.tournamentbel.entity.Goals;

public interface IGoalsService  {

    public void add (Goals goal);
    public void delete(Goals goal);
    public void getAll();
    public Goals getById(Integer id);
}
