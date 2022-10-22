package com.xss.test.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "session_recording")
public class SessionRecording {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "user_id")
    private UUID user_id;

    @Column(name = "user_session_id")
    private UUID user_session_id;

    @Column(name = "recording_file_key")
    private String recording_file_key;

    @CreationTimestamp
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @Column(name = "cdate")
    private Date cdate;

    @CreationTimestamp
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @Column(name = "udate")
    private Date udate;

    public SessionRecording(){

    }
    public SessionRecording(UUID id, UUID user_id, UUID user_session_id,
                            String recording_file_key, Date cdate, Date udate){
        this.id=id;
        this.user_id=user_id;
        this.user_session_id=user_session_id;
        this.recording_file_key=recording_file_key;
        this.cdate=cdate;
        this.udate=udate;

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

    public UUID getUser_session_id() {
        return user_session_id;
    }

    public void setUser_session_id(UUID user_session_id) {
        this.user_session_id = user_session_id;
    }

    public String getRecording_file_key() {
        return recording_file_key;
    }

    public void setRecording_file_key(String recording_file_key) {
        this.recording_file_key = recording_file_key;
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
        return "Session_recording{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", user_session_id=" + user_session_id +
                ", recording_file_key='" + recording_file_key + '\'' +
                ", cdate=" + cdate +
                ", udate=" + udate +
                '}';
    }
}
