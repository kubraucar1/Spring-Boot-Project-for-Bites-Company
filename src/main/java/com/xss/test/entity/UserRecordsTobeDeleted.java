package com.xss.test.entity;

import jdk.jfr.Enabled;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "user_records_to_be_deleted")
public class UserRecordsTobeDeleted {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;


    @Column(name = "file_key")
    private String file_key;

    public UserRecordsTobeDeleted(){

    }
    public UserRecordsTobeDeleted(UUID id,String file_key){

        this.id=id;
        this.file_key=file_key;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFile_key() {
        return file_key;
    }

    public void setFile_key(String file_key) {
        this.file_key = file_key;
    }

    @Override
    public String toString() {
        return "UserRecordsTobeDeleted{" +
                "id=" + id +
                ", file_key='" + file_key + '\'' +
                '}';
    }
}
