package com.xss.test.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "provider")
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "short_code")
    private String short_code;

    @CreationTimestamp
    @Column(name = "cdate")
    private Date cdate;

    @CreationTimestamp
    @Column(name = "udate")
    private Date udate;

    @Column(name = "multiple_stream")
    private boolean multiple_stream;

    public Provider() {

    }
    public Provider(UUID uuid,String name,String short_code,Date cdate,Date udate,boolean multiple_stream){
    this.id =id;
    this.name=name;
    this.short_code=short_code;
    this.cdate=cdate;
    this.udate=udate;
    this.multiple_stream=multiple_stream;

    }

    public Provider(String name) {
    }

    public UUID getUuid() {
        return id;
    }

    public void setUuid(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShort_code() {
        return short_code;
    }

    public void setShort_code(String short_code) {
        this.short_code = short_code;
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

    public boolean isMultiple_stream() {
        return multiple_stream;
    }

    public void setMultiple_stream(boolean multiple_stream) {
        this.multiple_stream = multiple_stream;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", short_code='" + short_code + '\'' +
                ", cdate=" + cdate +
                ", udate=" + udate +
                ", multiple_stream=" + multiple_stream +
                '}';
    }
}
