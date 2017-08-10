package com.intelisoft.tournamentbel.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Pavel on 08.08.2017.
 */
@Entity
@Table(name = "commands_players")
public class CommandsPlayers {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
//    @Column(name = "command_id")
//    private Integer command_id;
//    @Column(name = "player_id")
//    private Integer player_id;
    @Column(name = "date_beging")
   @Temporal(TemporalType.DATE)
    private Date dateBegin;
    @Column(name = "date_ended")
    @Temporal(TemporalType.DATE)
    private Date dateEnded;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "command_id")
    private Commands command;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "player_id")
    private Players player;

    public CommandsPlayers(){

    }

    public CommandsPlayers(Date dateBegin, Date dateEnded, Commands command, Players player) {
        this.dateBegin = dateBegin;
        this.dateEnded = dateEnded;
        this.command = command;
        this.player = player;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public Integer getCommand_id() {
//        return command_id;
//    }
//
//    public void setCommand_id(Integer command_id) {
//        this.command_id = command_id;
//    }
//
//    public Integer getPlayer_id() {
//        return player_id;
//    }
//
//    public void setPlayer_id(Integer player_id) {
//        this.player_id = player_id;
//    }

    public Date getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(Date dateBegin) {
        this.dateBegin = dateBegin;
    }

    public Date getDateEnded() {
        return dateEnded;
    }

    public void setDateEnded(Date dateEnded) {
        this.dateEnded = dateEnded;
    }

    public Commands getCommand() {
        return command;
    }

    public void setCommand(Commands command) {
        this.command = command;
    }

    public Players getPlayer() {
        return player;
    }

    public void setPlayer(Players player) {
        this.player = player;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CommandsPlayers{");
        sb.append("id=").append(id);
//        sb.append(", command_id=").append(command_id);
//        sb.append(", player_id=").append(player_id);
        sb.append(", dateBegin=").append(dateBegin);
        sb.append(", dateEnded=").append(dateEnded);
        sb.append(", command=").append(command);
        sb.append(", player=").append(player);
        sb.append('}');
        return sb.toString();
    }
}
