package com.intelisoft.tournamentbel.entity;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Pavel on 31.07.2017.
 */
@Entity
@Table(name = "players")
public class Players {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "type_player")
    private String typePlayer;
    @Column(name = "num_player")
    private Integer numPlayer;
    @Column(name = "commander")
    private Boolean commander;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "match")
    private List<Goals> goals;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "player")
    private List<CommandsPlayers> commandsPlayers;


    public Players () {
    }



    public Players(String lastName, String firstName, String typePlayer, Integer numPlayer, Boolean commander) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.typePlayer = typePlayer;
        this.numPlayer = numPlayer;
        this.commander = commander;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Players{");
        sb.append("id=").append(id);
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", typePlayer='").append(typePlayer).append('\'');
        sb.append(", numPlayer=").append(numPlayer);
        sb.append(", commander=").append(commander);
//        sb.append(", goals=").append(goals);
//        sb.append(", commandsPlayers=").append(commandsPlayers);
        sb.append('}');
        return sb.toString();
    }
}
