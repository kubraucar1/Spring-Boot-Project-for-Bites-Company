package com.xss.test.dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

import static org.assertj.core.util.DateUtil.now;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class FlywaySchemaHistoryDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "installed_rank", unique = true, nullable = false)
    private int installed_rank;

    @Size(max = 50,message = "lenght of version can be max 50 characters")
    @Column(name = "version")
    @NotNull(message = "version cannot be null")
    private String version;

    @Size(max = 200, message = "lenght of description can be max 200 characters")
    @Column(name = "description", nullable = false)
    private  String description;

    @Size(max = 20 ,message = "lenght of type can be max 20 characters")
    @Column(name = "type", nullable = false)
    private String type;

    @Size(max = 1000,message = "lenght of script can be max 1000 characters")
    @Column(name = "script", nullable = false)
    private String script;

    @Column(name = "checksum")
    private int checksum;

    @Size(max = 100 )
    @Column(name = "installed_by", nullable = false)
    private String installed_by;

    @CreationTimestamp
    @Column(name = "installed_on", nullable = false)
    private Date installed_on = now();

    @Column(name = "execution_time", nullable = false)
    private int execution_time;

    @Column(name = "success", nullable = false)
    private boolean success;



}
