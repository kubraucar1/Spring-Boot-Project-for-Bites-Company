package com.xss.test.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "user_session_provider")
public class UserSessionProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "user_id")
    private UUID user_id;

    @Column(name = "user_session_id")
    private UUID user_session_id;

    @Column(name = "user_provider_id")
    private UUID user_provider_id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "privacy")
    private String privacy;

    @Column(name = "category")
    private String category;

    @Column(name = "rtmpurl")
    private String rtmpurl;

    @Column(name = "viewurl")
    private String viewurl;

    @Column(name = "sessioninfo")
    private String sessioninfo;

    @CreationTimestamp
    @Column(name = "cdate")
    private Date cdate;

    @CreationTimestamp
    @Column(name = "udate")
    private Date udate;


    public UserSessionProvider() {

    }

    public UserSessionProvider(UUID id, UUID user_id, UUID user_session_id, UUID user_provider_id, String title, String description, String privacy, String category, String rtmpurl, String viewurl, String sessioninfo, Date cdate, Date udate) {
        this.setId(id);
        this.setUser_id(user_id);
        this.setUser_session_id(user_session_id);
        this.setUser_provider_id(user_provider_id);
        this.setTitle(title);
        this.setDescription(description);
        this.setPrivacy(privacy);
        this.setCategory(category);
        this.setRtmpurl(rtmpurl);
        this.setViewurl(viewurl);
        this.setSessioninfo(sessioninfo);
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

    public UUID getUser_session_id() {
        return user_session_id;
    }

    public void setUser_session_id(UUID user_session_id) {
        this.user_session_id = user_session_id;
    }

    public UUID getUser_provider_id() {
        return user_provider_id;
    }

    public void setUser_provider_id(UUID user_provider_id) {
        this.user_provider_id = user_provider_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRtmpurl() {
        return rtmpurl;
    }

    public void setRtmpurl(String rtmpurl) {
        this.rtmpurl = rtmpurl;
    }

    public String getViewurl() {
        return viewurl;
    }

    public void setViewurl(String viewurl) {
        this.viewurl = viewurl;
    }

    public String getSessioninfo() {
        return sessioninfo;
    }

    public void setSessioninfo(String sessioninfo) {
        this.sessioninfo = sessioninfo;
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
}
