package com.xss.test.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserProviderDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    private UUID id;

    @Column(name = "user_id")
    private UUID user_id;

    @Column(name = "provider_id")
    private UUID provider_id;

    @Column(name = "open_auth_id")
    @Size(max = 256)
    private String open_auth_id;

    @Column(name = "display_name")
    @Size(max = 256)
    private String display_name;

    @Column(name = "avatar_url")
    @Size(max = 1024)
    private String avatar_url;

    @Column(name = "refresh_token")
    @Size(max = 2048)
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
    private boolean refresh_token_valid = true;

    @Column(name = "is_deleted")
    private boolean is_deleted = false;

    @Column(name = "access_token")
    @Size(max = 2048)
    private String access_token;

    @CreationTimestamp
    @Column(name = "access_token_exdate")
    private Date access_token_exdate;

}
