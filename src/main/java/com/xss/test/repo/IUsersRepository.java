package com.xss.test.repo;

import com.xss.test.dto.APIResponse;
import com.xss.test.entity.UserSession;
import com.xss.test.entity.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;

@Repository
public interface IUsersRepository extends JpaRepository<Users, UUID> {

    @Query(value = "select * from users where cdate >= ?1 and cdate <=?2 ", nativeQuery = true)
    List<Users> getRecordsWithThisDay(Timestamp sdate, Timestamp edate);


    @Query(value = "SELECT * FROM users WHERE EXTRACT(MONTH FROM cdate) = ?1", nativeQuery = true)
    List<Users> getRecordsWithThisMonth(int monthValue);

    @Query(value = "SELECT * FROM users WHERE EXTRACT(year FROM cdate) = ?1", nativeQuery = true)
    List<Users> getRecordsWithThisYear(int yearValue);

    @Query(value = "SELECT * FROM users WHERE EXTRACT('year' FROM cdate)=?1 and EXTRACT('month' FROM cdate) =?2 and EXTRACT('hour' FROM cdate) =?3 ", nativeQuery = true)
    List<Users> getRecordWithThisHour(int yearValue, int monthValue, int hourValue);

    @Query(value = "SELECT * FROM users WHERE EXTRACT('year' FROM cdate)=?1 and EXTRACT('week' FROM cdate) =?2", nativeQuery = true)
    List<Users> getRecordWithThisWeek(int yearValue, int weekValue);


    //////////////////////////////////////////////////////////

    @Query(value = "select * from users where cdate >= ?1 and cdate <= ?2", nativeQuery = true)
    List<Users> getUserRegister(LocalDate sdate, LocalDate edate);


}

