package com.xss.test.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "oauth_state")
public class OauthState {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "state")
    private String state;

    @CreationTimestamp
    @Column(name = "cdate")
    private Date cdate;

    @CreationTimestamp
    @Column(name = "udate")
    private Date udate;


    public OauthState(){

    }
    public OauthState(UUID id, String state, Date cdate, Date udate){
        this.id=id;
        this.state=state;
        this.cdate=cdate;
        this.udate=udate;

    }
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    public Date getUdate() {
        return udate;
    }

    public void setUdate(Date udate) {
        this.udate = udate;
    }

    @Override
    public String toString() {
        return "Oauth_state{" +
                "id=" + id +
                ", state='" + state + '\'' +
                ", cdate=" + cdate +
                ", udate=" + udate +
                '}';
    }
}
