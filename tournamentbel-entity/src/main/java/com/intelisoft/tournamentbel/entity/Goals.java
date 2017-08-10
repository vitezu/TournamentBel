package com.intelisoft.tournamentbel.entity;

import javax.persistence.*;
import java.sql.Time;


/**
 * Created by Pavel on 31.07.2017.
 */
@Entity
@Table(name = "goals")
public class Goals {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
//    @Temporal(TemporalType.TIME)
    @Column(name = "time_goal")
    private Time timeGoal;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "player_id")
    private Players player;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "match_id")
    private Matches match;

    public Goals() {

    }


    public Goals(Time timeGoal, Players player, Matches match) {
        this.timeGoal = timeGoal;
        this.player = player;
        this.match = match;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Time getTimeGoal() {
        return timeGoal;
    }

    public void setTimeGoal(Time timeGoal) {
        this.timeGoal = timeGoal;
    }

    public Players getPlayer() {
        return player;
    }

    public void setPlayer(Players player) {
        this.player = player;
    }

    public Matches getMatch() {
        return match;
    }

    public void setMatch(Matches match) {
        this.match = match;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Goals{");
        sb.append("id=").append(id);
        sb.append(", timeGoal=").append(timeGoal);
        sb.append(", player=").append(player);
        sb.append(", match=").append(match);
        sb.append('}');
        return sb.toString();
    }
}
