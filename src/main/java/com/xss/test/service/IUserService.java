package com.xss.test.service;

import com.xss.test.entity.SessionRecording;
import com.xss.test.entity.UserProvider;
import com.xss.test.entity.UserSession;
import com.xss.test.entity.Users;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.util.Date;
import java.util.List;

@Service
public interface IUserService {



    List<Users> getRecordDay(LocalDate cdate);
    List<Users> getRecordMonth(int monthValue);
    List<Users> getRecordYear(int yearValue);
    List<Users> getRecordHour(int yearValue,int monthValue,int hourValue);
    List<Users> getRecordWeek(int yearValue,int weekValue);
///////////////////////////////////////////////////////////////////

    List<Users> getUserRegister(LocalDate sdate, LocalDate edate);
    List<UserSession> getCurrentUser();
    List<UserProvider> getmostUsedStreamingPlatform();
}
