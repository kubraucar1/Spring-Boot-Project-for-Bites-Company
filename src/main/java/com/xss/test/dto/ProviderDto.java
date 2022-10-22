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
public class ProviderDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    private UUID id;

    @Column(name = "name")
    @Size(max = 200, message = "lenght of name can be max 200 characters")
    private String name;

    @Column(name = "short_code")
    @Size(max = 50, message = "lenght of short code can be max 50 characters")
    private String short_code;


    @CreationTimestamp
    @Column(name = "cdate")
    private Date cdate;

    @CreationTimestamp
    @Column(name = "udate")
    private Date udate;

    @Column(name = "multiple_stream")
    private boolean multiple_stream = false;













}



