package com.intelisoft.tournamentbel.api.services;

import com.intelisoft.tournamentbel.entity.Matches;

public interface IMatchesService {
    public void add (Matches match);
    public void delete (Matches match);
}
