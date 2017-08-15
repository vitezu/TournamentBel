package com.intelisoft.tournamentbel.api.services;

import com.intelisoft.tournamentbel.entity.Goals;

import java.util.List;

public interface IGoalsService  {

    public void add (Goals goal);
    public void delete(Goals goal);
    public List<Goals> getAll();
    public Goals getById(Integer id);
}
