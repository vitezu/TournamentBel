package com.intelisoft.tournamentbel.entity;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by Pavel on 31.07.2017.
 */
@Entity
@Table(name = "periods")
public class Periods {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Enumerated(EnumType.ORDINAL)
    private NamePeriod namePeriod;
    @Column(name = "added_time")
    private Time addedTime;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "match_id")
    private Matches match;

    public enum NamePeriod  {
       First, Second
    }

public Periods (){

}

    public Periods(NamePeriod namePeriod, Time addedTime, Matches match) {
        this.namePeriod = namePeriod;
        this.addedTime = addedTime;
        this.match = match;
    }

    public Matches getMatch() {
        return match;
    }

    public void setMatch(Matches match) {
        this.match = match;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public NamePeriod getNamePeriod() {
        return namePeriod;
    }

    public void setNamePeriod(NamePeriod namePeriod) {
        this.namePeriod = namePeriod;
    }

    public Time getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(Time addedTime) {
        this.addedTime = addedTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Periods{");
        sb.append("id=").append(id);
        sb.append(", namePeriod=").append(namePeriod);
        sb.append(", addedTime=").append(addedTime);
        sb.append(", match=").append(match);
        sb.append('}');
        return sb.toString();
    }
}
