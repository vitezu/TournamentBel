package com.intelisoft.tournamentbel.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by Pavel on 31.07.2017.
 */
@Entity
@Table(name = "matches")
public class Matches {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "place")
    private String place;
    @Column(name = "num_card")
    private Integer numCard;
    @Temporal(TemporalType.DATE)
    @Column(name = "date_match")
    private Date dateMatch;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tournament_id")
    private Tournaments tournament;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "match")
    private List<Periods> periods;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "match")
    private List<Goals> goals;


    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "matches_commands",
            joinColumns = @JoinColumn(name = "match_id"),
            inverseJoinColumns = @JoinColumn(name = "command_id") )
    private Set<Commands> commands;

    public Matches (){
}
    public Matches(String place, Integer numCard, Date dateMatch, Tournaments tournament, Set<Commands> commands) {
        this.place = place;
        this.numCard = numCard;
        this.dateMatch = dateMatch;
        this.tournament = tournament;
        this.commands = commands;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Integer getNumCard() {
        return numCard;
    }

    public void setNumCard(Integer numCard) {
        this.numCard = numCard;
    }

    public Date getDateMatch() {
        return dateMatch;
    }

    public void setDateMatch(Date dateMatch) {
        this.dateMatch = dateMatch;
    }

    public Tournaments getTournament() {
        return tournament;
    }

    public void setTournament(Tournaments tournament) {
        this.tournament = tournament;
    }

    public List<Periods> getPeriodsList() {
        return periods;
    }

    public void setPeriodsList(List<Periods> periods) {
        this.periods = periods;
    }

    public List<Goals> getGoalsList() {
        return goals;
    }

    public void setGoalsList(List<Goals> goals) {
        this.goals = goals;
    }

    public Set<Commands> getCommandsSet() {
        return commands;
    }

    public void setCommandsSet(Set<Commands> commands) {
        this.commands = commands;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Matches{");
        sb.append("id=").append(id);
        sb.append(", place='").append(place).append('\'');
        sb.append(", numCard=").append(numCard);
        sb.append(", dateMatch=").append(dateMatch);
        sb.append(", tournament=").append(tournament);
        sb.append(", periods=").append(periods);
        sb.append(", goals=").append(goals);
        sb.append(", commands=").append(commands);
        sb.append('}');
        return sb.toString();
    }
}
