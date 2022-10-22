package com.xss.test.controller;

import com.xss.test.dto.APIResponse;
import com.xss.test.entity.UserProvider;
import com.xss.test.entity.UserSession;
import com.xss.test.entity.Users;
import com.xss.test.repo.IUserProviderRepository;
import com.xss.test.repo.IUsersRepository;
import com.xss.test.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/api")
@org.springframework.stereotype.Controller
@Repository
public class Controller {

    @Autowired
    private final IUserService iUserService;
    private final IUsersRepository usersRepository;

    public Controller(IUserService iUserService, IUsersRepository usersRepository) {

        this.iUserService = iUserService;
        this.usersRepository = usersRepository;
    }


    @GetMapping("/user/register/year/month/day/{cdate}")
    public APIResponse<List<Users>> getRecordsDays(@DateTimeFormat(pattern = "yyyy-MM-dd") @PathVariable LocalDate cdate) {
        List<Users> result = (List<Users>) iUserService.getRecordDay(cdate);
        return new APIResponse<>(result.size(), result);
    }


    @GetMapping("/user/register/month/{monthValue}")
    public APIResponse<List<Users>> getRecordsMonths(@PathVariable int monthValue) {
        List<Users> result = iUserService.getRecordMonth(monthValue);
        return new APIResponse<>(result.size(), result);
    }

    @GetMapping("/user/register/year/{yearValue}")
    public APIResponse<List<Users>> getRecordsYears(@PathVariable int yearValue) {
        List<Users> result = iUserService.getRecordYear(yearValue);
        return new APIResponse<>(result.size(), result);
    }

    @GetMapping("/user/register/year/month/hour/{yearValue}/{monthValue}/{hourValue}")
    public APIResponse<List<Users>> getRecordsHours(@PathVariable int yearValue, @PathVariable int monthValue, @PathVariable int hourValue) {
        List<Users> result = iUserService.getRecordHour(yearValue, monthValue, hourValue);
        return new APIResponse<>(result.size(), result);
    }

    @GetMapping("/user/register/year/week/{yearValue}/{weekValue}")
    public APIResponse<List<Users>> getRecordsWeeks(@PathVariable int yearValue, @PathVariable int weekValue) {
        List<Users> result = iUserService.getRecordWeek(yearValue, weekValue);
        return new APIResponse<>(result.size(), result);

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @RequestMapping( value = "user/register/" , method = RequestMethod.GET)
    public APIResponse<List<Users>> getRecords(@DateTimeFormat(pattern = "yyyy-MM-dd") @RequestParam("sdate") LocalDate
                                                           sdate, @DateTimeFormat(pattern = "yyyy-MM-dd")
    @RequestParam("edate") LocalDate edate) {

        List<Users> result = iUserService.getUserRegister(sdate,edate);
        return new APIResponse<List<Users>>(result.size(), result);
    }



    @RequestMapping( value = "user/registerr/" , method = RequestMethod.GET)
    public APIResponse<List<Users>> getRecords2(@RequestParam("sdate") String dateBeforeString,
                                                @RequestParam("edate") String dateAfterString)  {

        LocalDate sdate = LocalDate.parse(dateBeforeString, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS"));
        LocalDate edate = LocalDate.parse(dateAfterString, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS"));


        List<Users> result = iUserService.getUserRegister(sdate,edate);
        return new APIResponse<>(result.size(), result);
    }

    @GetMapping("/current/user")
    public APIResponse<List<UserSession>> getCurrentUsers(){
        return (APIResponse<List<UserSession>>) iUserService.getCurrentUser();
    }


    @GetMapping("/most/stream/layer")
    public APIResponse<List<UserProvider>> getMostStreamPlatform(){
        List<UserProvider> result = iUserService.getmostUsedStreamingPlatform();

        return new APIResponse<>("youtube",result.size(), result);
    }
}

