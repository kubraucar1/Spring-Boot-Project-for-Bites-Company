package com.xss.test.service;

import com.xss.test.entity.UserProvider;
import com.xss.test.entity.UserSession;
import com.xss.test.entity.Users;
import com.xss.test.exceptions.ResutEmpty;
import com.xss.test.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.time.*;
import java.util.List;


import static java.sql.Timestamp.valueOf;
import static java.time.LocalDate.now;

@Service
@Transactional
public class UserService implements  IUserService {


    @Autowired
    private final IUsersRepository usersRepository;
    private final IUserSessionRepository userSessionRepository;
    private final IUserProviderRepository  userProviderRepository;
    private final ISessionRecordingRepository sessionRecordingRepository;
    private final IProvider provider;


    @Autowired
    public UserService(IUsersRepository usersRepository, IUserSessionRepository userSessionRepository, IUserProviderRepository userProviderRepository, ISessionRecordingRepository sessionRecordingRepository, IProvider provider) {

        this.usersRepository = usersRepository;
        this.userSessionRepository = userSessionRepository;
        this.userProviderRepository = userProviderRepository;
        this.sessionRecordingRepository = sessionRecordingRepository;
        this.provider = provider;
    }


    public List<Users> findAllUsersWithSorting(String field) {
        return usersRepository.findAll(Sort.by(Sort.Direction.ASC, field));
    }

    public Page<Users> findUsersWithPagination(int page, int pageSize) {
        Page<Users> users = usersRepository.findAll(PageRequest.of(page, pageSize));
        return users;
    }

    public Page<Users> findusersWithPaginationAndSorting(int page, int pageSize, String field) {
        Page<Users> users = usersRepository.findAll(PageRequest.of(page, pageSize).withSort(Sort.by(field)));
        return users;
    }



    @Override
    public List<Users> getRecordDay(LocalDate cdate) {

        LocalDateTime nowDate = LocalDateTime.now();

        try {
            LocalDateTime startDay = cdate.atStartOfDay();
            LocalDateTime endDay = cdate.atTime(23, 59);

            if (nowDate.isAfter(startDay)) {
                List<Users> users = usersRepository.getRecordsWithThisDay(valueOf(startDay), valueOf(endDay));
                return users;
            }
            {
                throw new RuntimeException("this date is not valid!");
            }
        } catch (Exception e) {
            throw new RuntimeException("it did not work");
        }
    }

    @Override
    public List<Users> getRecordMonth(int monthValue) {

        List<Users> users = usersRepository.getRecordsWithThisMonth(monthValue);
        if (1 <= monthValue && monthValue <= 12) {
           /* if(users.isEmpty()){
                throw new RuntimeException("No users registered this month");    //?
            }*/
            return users;
        } else {
            throw new RuntimeException("this month value is not valid!");
        }
    }

    @Override
    public List<Users> getRecordYear(int yearValue) {
        return usersRepository.getRecordsWithThisYear(yearValue);
    }

    @Override
    public List<Users> getRecordHour(int yearValue,int monthValue,int hourValue) {
        List<Users> users = usersRepository.getRecordWithThisHour(yearValue,monthValue,hourValue);
        if(0<=hourValue && hourValue<= 24) {
            return users;
        }
        else {
            throw new RuntimeException("hour range must be between 0 and 24");
        }
    }

    @Override
    public List<Users> getRecordWeek(int yearValue, int weekValue) {
        List<Users> users = usersRepository.getRecordWithThisWeek(yearValue,weekValue);
        if (1 <= weekValue && weekValue <= 52) {
            return users;
        } else {
            throw new RuntimeException("week range must be between 1 and 52");

        }

    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Override
    public List<Users> getUserRegister(LocalDate sdate, LocalDate edate) {

        LocalDateTime nowDate = LocalDateTime.now();    //eger saat vermediyse 00 ve 23:59 dan başlat


        LocalDateTime startDay = sdate.atStartOfDay();
        LocalDateTime endDay = edate.atTime(23, 59);

        Timestamp deneme = Timestamp.valueOf(sdate.atStartOfDay());

        if (nowDate.isAfter(startDay)) {
            List<Users> users = usersRepository.getRecordsWithThisDay(valueOf(startDay), valueOf(endDay));
            return users;
        }
       else {
            throw new DateTimeException("");

        }
    }

    @Override
    public List<UserSession> getCurrentUser() {
        LocalDate date = now();

        List<UserSession> result = userSessionRepository.getCurrentUsers(date);
        if(result.isEmpty())
            throw new ResutEmpty();
        else
        return result;
    }

    @Override
    public List<UserProvider> getmostUsedStreamingPlatform() {
     UserProvider providers = new UserProvider();

        var youtube = userProviderRepository.streamYoutube();
        var twitch = userProviderRepository.streamTwitch();



       if( youtube.size()>twitch.size()){

           List< UserProvider> result = userProviderRepository.streamYoutube();
           return result;
       }
             if( youtube.size()==twitch.size()){

            throw new RuntimeException("twitch ve youtube eşit");
        }
             if( youtube.size()<twitch.size()){
                 List< UserProvider> result = userProviderRepository.streamTwitch();
                 return result;
             }

        else {
            throw new RuntimeException();
        }




    }
}
