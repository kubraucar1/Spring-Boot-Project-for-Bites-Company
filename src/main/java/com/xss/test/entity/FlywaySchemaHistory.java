package com.xss.test.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;

@Entity
@Table(name = "flyway_schema_history")
public class FlywaySchemaHistory {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "installed_rank",unique = true, nullable = false)
    private int instaled_rank;


    @Column(name = "version")
    private String version;

    @Column(name = "description")
    private  String description;

    @Column(name = "type")
    private String type;

    @Column(name = "script")
    private String script;

    @Column(name = "checksum")
    private int checksum;

    @Column(name = "installed_by")
    private String installed_by;

    @CreationTimestamp
    @Column(name = "installed_on")
    private Date installed_on;

    @Column(name = "execution_time")
    private int execution_time;

    @Column(name = "success")
    private boolean success;



    public FlywaySchemaHistory(){

    }
    public FlywaySchemaHistory(int instaled_rank, String version, String description, String type, String script, int checksum,
                               String installed_by, Date installed_on, int execution_time, boolean success){
        this.instaled_rank=instaled_rank;
        this.version=version;
        this.description=description;
        this.type=type;
        this.script=script;
        this.checksum=checksum;
        this.installed_by=installed_by;
        this.installed_on=installed_on;
        this.execution_time=execution_time;
        this.success=success;

    }


    public int getInstaled_rank() {
        return instaled_rank;
    }

    public void setInstaled_rank(int instaled_rank) {
        this.instaled_rank = instaled_rank;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescriotion() {
        return description;
    }

    public void setDescriotion(String descriotion) {
        this.description = descriotion;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public int getChecksum() {
        return checksum;
    }

    public void setChecksum(int checksum) {
        this.checksum = checksum;
    }

    public String getInstalled_by() {
        return installed_by;
    }

    public void setInstalled_by(String installed_by) {
        this.installed_by = installed_by;
    }

    public Date getInstalled_on() {
        return installed_on;
    }

    public void setInstalled_on(Date installed_on) {
        this.installed_on = installed_on;
    }

    public int getExecution_time() {
        return execution_time;
    }

    public void setExecution_time(int execution_time) {
        this.execution_time = execution_time;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "Flyway_schema_history{" +
                "instaled_rank=" + instaled_rank +
                ", version='" + version + '\'' +
                ", description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", script='" + script + '\'' +
                ", checksum=" + checksum +
                ", installed_by='" + installed_by + '\'' +
                ", installed_on=" + installed_on +
                ", execution_time=" + execution_time +
                ", success=" + success +
                '}';
    }
}
