package com.intelisoft.tournamentbel.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Pavel on 31.07.2017.
 */
@Entity
@Table(name = "tournaments")
public class Tournaments {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name_tournaments")
    private String nameTournaments;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tournament")
    private List<Leagues> leagues;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tournament" )
    private List<Matches> matches;

    public Tournaments (){
    }


    public Tournaments (String nameTournaments){
        this.nameTournaments = nameTournaments;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameTournaments() {
        return nameTournaments;
    }

    public void setNameTournaments(String nameTournaments) {
        this.nameTournaments = nameTournaments;
    }

    public List<Leagues> getLeaguesList() {
        return leagues;
    }

    public void setLeaguesList(List<Leagues> leagues) {
        this.leagues = leagues;
    }

    public List<Matches> getMatchesList() {
        return matches;
    }

    public void setMatchesList(List<Matches> matches) {
        this.matches = matches;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tournaments{");
        sb.append("id=").append(id);
        sb.append(", nameTournaments='").append(nameTournaments).append('\'');
        sb.append(", leagues=").append(leagues);
        sb.append(", matches=").append(matches);
        sb.append('}');
        return sb.toString();
    }
}
