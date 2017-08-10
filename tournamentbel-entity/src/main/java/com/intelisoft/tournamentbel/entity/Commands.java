package com.intelisoft.tournamentbel.entity;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "Commands")
public class Commands {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name_command")
    private String nameCommand;
    @Column(name = "city")
    private String city;
    @Column(name = "trainer")
    private String trainer;
    @Column(name = "rating")
    private Integer rating;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "command")
    private List<CommandsPlayers> commandsPlayers;

    @ManyToMany(mappedBy = "commands")
    private List<Matches> matches;

    public Commands() {
    }

    public Commands(String nameCommand, String city, String trainer, Integer rating) {
        this.nameCommand = nameCommand;
        this.city = city;
        this.trainer = trainer;
        this.rating = rating;

    }

    //    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinTable(name = "commands_players",
//            joinColumns = @JoinColumn(name = "command_id"),
//            inverseJoinColumns = @JoinColumn(name = "player_id") )
//
//

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameCommand() {
        return nameCommand;
    }

    public void setNameCommand(String nameCommand) {
        this.nameCommand = nameCommand;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public List<CommandsPlayers> getCommandsPlayers() {
        return commandsPlayers;
    }

    public void setCommandsPlayers(List<CommandsPlayers> commandsPlayers) {
        this.commandsPlayers = commandsPlayers;
    }

    public List<Matches> getMatches() {
        return matches;
    }

    public void setMatches(List<Matches> matches) {
        this.matches = matches;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Commands{");
        sb.append("id=").append(id);
        sb.append(", nameCommand='").append(nameCommand).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", trainer='").append(trainer).append('\'');
        sb.append(", rating=").append(rating);
        sb.append(", commandsPlayers=").append(commandsPlayers);
        sb.append(", matches=").append(matches);
        sb.append('}');
        return sb.toString();
    }
}
