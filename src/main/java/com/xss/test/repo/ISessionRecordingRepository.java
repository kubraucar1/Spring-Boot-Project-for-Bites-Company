package com.xss.test.repo;

import com.xss.test.entity.SessionRecording;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Repository
public interface ISessionRecordingRepository extends JpaRepository<SessionRecording, UUID> {
    @Query(value = "select * from session_recording  where cdate =?1", nativeQuery = true)
    List<SessionRecording> getRecordWithThisDate(@DateTimeFormat(pattern="yyyy-MM-dd") Date cdate);


   @Query(value = "select * from session_recording  where cdate BETWEEN ?1 and ?2 ",nativeQuery = true)
    List<SessionRecording> getDatesBetweenThisDays(@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") Date startDate, Date endDate);

   @Query(value = "SELECT * FROM public.session_recording x where x.cdate BETWEEN '2022-04-12 14:30:16.616' and '2022-05-27 08:29:51.422'" ,nativeQuery = true)
   List<SessionRecording> getBetweenDates();


}
