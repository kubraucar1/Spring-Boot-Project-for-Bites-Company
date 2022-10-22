package com.xss.test.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "keycloak_id")
    private UUID keycloak_id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "email")
    private String email;

    @CreationTimestamp
    @Column(name = "cdate")
    private Date cdate;

    @CreationTimestamp
    @Column(name = "udate")
    private Date udate;

    public Users() {
    }

    public Users(UUID id, UUID keycloak_id, String first_name, String last_name, String email, Date cdate, Date udate) {
        this.setId(id);
        this.setKeycloak_id(keycloak_id);
        this.setFirst_name(first_name);
        this.setLast_name(last_name);
        this.setEmail(email);
        this.setCdate(cdate);
        this.setUdate(udate);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getKeycloak_id() {
        return keycloak_id;
    }

    public void setKeycloak_id(UUID keycloak_id) {
        this.keycloak_id = keycloak_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        return "Users{" +
                "id=" + id +
                ", keycloak_id=" + keycloak_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", cdate=" + cdate +
                ", udate=" + udate +
                '}';
    }
}
