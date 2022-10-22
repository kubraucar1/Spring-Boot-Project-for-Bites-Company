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
public class UserSessionProviderDto {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    private UUID id;

    @Column(name = "user_id")
    private UUID user_id;

    @Column(name = "user_session_id")
    private UUID user_session_id;

    @Column(name = "user_provider_id")
    private UUID user_provider_id;

    @Column(name = "title")
    @Size(max = 255)
    private String title;

    @Column(name = "description")
    @Size(max = 2048)
    private String description;

    @Column(name = "privacy")
    @Size(max = 255)
    private String privacy;

    @Column(name = "category")
    @Size(max = 255)
    private String category;

    @Column(name = "rtmpurl")
    @Size(max = 255)
    private String rtmpurl;

    @Column(name = "viewurl")
    @Size(max = 255)
    private String viewurl;

    @Column(name = "sessioninfo")
    @Size(max = 8192)
    private String sessioninfo;

    @CreationTimestamp
    @Column(name = "cdate")
    private Date cdate;

    @CreationTimestamp
    @Column(name = "udate")
    private Date udate;
}

