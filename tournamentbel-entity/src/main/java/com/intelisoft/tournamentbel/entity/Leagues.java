package com.intelisoft.tournamentbel.entity;

import javax.persistence.*;

/**
 * Created by Pavel on 31.07.2017.
 */
@Entity
@Table(name = "leagues")
public class Leagues {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name_leagues")
    private String nameLeagues;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tournament_id")
    private Tournaments tournament;

    public Leagues () {

    }

    public Leagues(String nameLeagues, Tournaments tournament) {
        this.nameLeagues = nameLeagues;
        this.tournament = tournament;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameLeagues() {
        return nameLeagues;
    }

    public void setNameLeagues(String nameLeagues) {
        this.nameLeagues = nameLeagues;
    }

    public Tournaments getTournament() {
        return tournament;
    }

    public void setTournament(Tournaments tournament) {
        this.tournament = tournament;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Leagues{");
        sb.append("id=").append(id);
        sb.append(", nameLeagues='").append(nameLeagues).append('\'');
        sb.append(", tournament=").append(tournament);
        sb.append('}');
        return sb.toString();
    }
}
