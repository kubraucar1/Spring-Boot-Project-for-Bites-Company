package com.xss.test.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "user_provider")
public class UserProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "user_id")
    private UUID user_id;

    @Column(name = "provider_id")
    private UUID provider_id;

    @Column(name = "open_auth_id")
    private String open_auth_id;

    @Column(name = "display_name")
    private String display_name;

    @Column(name = "avatar_url")
    private String avatar_url;

    @Column(name = "refresh_token")
    private String refresh_token;

    @CreationTimestamp
    @Column(name = "cdate")
    private Date cdate;

    @CreationTimestamp
    @Column(name = "udate")
    private Date udate;

    @CreationTimestamp
    @Column(name = "refresh_token_udate")
    private Date refresh_token_udate;

    @Column(name = "refresh_token_valid")
    private boolean refresh_token_valid;

    @Column(name = "is_deleted")
    private boolean is_deleted;

    @Column(name = "access_token")
    private String access_token;

    @CreationTimestamp
    @Column(name = "access_token_exdate")
    private Date access_token_exdate;

    public UserProvider(){

    }
    public UserProvider(UUID id, UUID user_id, UUID provider_id, String open_auth_id, String display_name, String avatar_url,
                        String refresh_token, Date cdate, Date udate, Date refresh_token_udate, boolean refresh_token_valid,
                        boolean is_deleted, String access_token, Date access_token_exdate){

        this.id=id;
        this.user_id=user_id;
        this.provider_id=provider_id;
        this.open_auth_id=open_auth_id;
        this.display_name=display_name;
        this.avatar_url=avatar_url;
        this.refresh_token=refresh_token;
        this.cdate=cdate;
        this.udate=udate;
        this.refresh_token_udate=refresh_token_udate;
        this.refresh_token_valid= refresh_token_valid;
        this.is_deleted=is_deleted;
        this.access_token=access_token;
        this.access_token_exdate=access_token_exdate;

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

    public UUID getProvider_id() {
        return provider_id;
    }

    public void setProvider_id(UUID provider_id) {
        this.provider_id = provider_id;
    }

    public String getOpen_auth_id() {
        return open_auth_id;
    }

    public void setOpen_auth_id(String open_auth_id) {
        this.open_auth_id = open_auth_id;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
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

    public Date getRefresh_token_udate() {
        return refresh_token_udate;
    }

    public void setRefresh_token_udate(Date refresh_token_udate) {
        this.refresh_token_udate = refresh_token_udate;
    }

    public boolean isRefresh_token_valid() {
        return refresh_token_valid;
    }

    public void setRefresh_token_valid(boolean refresh_token_valid) {
        this.refresh_token_valid = refresh_token_valid;
    }

    public boolean isIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(boolean is_deleted) {
        this.is_deleted = is_deleted;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public Date getAccess_token_exdate() {
        return access_token_exdate;
    }

    public void setAccess_token_exdate(Date access_token_exdate) {
        this.access_token_exdate = access_token_exdate;
    }

    @Override
    public String toString() {
        return "User_provider{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", provider_id=" + provider_id +
                ", open_auth_id='" + open_auth_id + '\'' +
                ", display_name='" + display_name + '\'' +
                ", avatar_url='" + avatar_url + '\'' +
                ", refresh_token='" + refresh_token + '\'' +
                ", cdate=" + cdate +
                ", udate=" + udate +
                ", refresh_token_udate=" + refresh_token_udate +
                ", refresh_token_valid=" + refresh_token_valid +
                ", is_deleted=" + is_deleted +
                ", access_token='" + access_token + '\'' +
                ", access_token_exdate=" + access_token_exdate +
                '}';
    }
}
