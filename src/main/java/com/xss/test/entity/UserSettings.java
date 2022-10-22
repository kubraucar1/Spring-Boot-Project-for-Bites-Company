package com.xss.test.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "user_settings")
public class UserSettings {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "user_id")
    private UUID user_id;

    @Column(name = "short_code")
    private String short_code;

    @Column(name = "state")
    private String state;

    @CreationTimestamp
    @Column(name = "cdate")
    private Date cdate;

    @CreationTimestamp
    @Column(name = "udate")
    private Date udate;

    public UserSettings() {
    }

    public UserSettings(UUID id, UUID user_id, String short_code, String state, Date cdate, Date udate) {
        this.setId(id);
        this.setUser_id(user_id);
        this.setShort_code(short_code);
        this.setState(state);
        this.setCdate(cdate);
        this.setUdate(udate);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getUser_id() {
        return user_id;
    }

    public void setUser_id(UUID user_id) {
        this.user_id = user_id;
    }

    public String getShort_code() {
        return short_code;
    }

    public void setShort_code(String short_code) {
        this.short_code = short_code;
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
        return "UserSettings{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", short_code='" + short_code + '\'' +
                ", state='" + state + '\'' +
                ", cdate=" + cdate +
                ", udate=" + udate +
                '}';
    }
}
