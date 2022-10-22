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
public class SessionRecordingDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    private UUID id;

    @Column(name = "user_id")
    private UUID user_id;

    @Column(name = "user_session_id")
    private UUID user_session_id;

    @Column(name = "recording_file_key")
    @Size(max = 255,message = "lenght of file key can be max 255 characters.")
    private String recording_file_key;

    @CreationTimestamp
    @Column(name = "cdate")
    private Date cdate;

    @CreationTimestamp
    @Column(name = "udate")
    private Date udate;

}
