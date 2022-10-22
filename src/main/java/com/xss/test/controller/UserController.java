package com.xss.test.controller;

import com.xss.test.dto.APIResponse;
import com.xss.test.dto.SessionRecordingDto;
import com.xss.test.dto.UserProviderDto;
import com.xss.test.entity.*;
import com.xss.test.repo.*;
import com.xss.test.service.IUserService;
import com.xss.test.service.UserService;
import jdk.jfr.Timespan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/test")
@Controller
@Repository
public class UserController {
    @Autowired
    private final UserService userService;
    private final IUserService iUserService;
    private final IFlywayRepository flywayRepository;
    private final IOauthRepository oauthRepository;
    private final IProvider iprovider;
    private final ISessionRecordingRepository sessionRecordingRepository;
    private final IUserProviderRepository userProviderRepository;
    private final IUserRecordsToBeDeletedRepository userRecordsToBeDeletedRepository;
    private final IUserSessionRepository userSessionRepository;
    private final IUserSessionProviderRepository userSessionProviderRepository;
    private final IUserSessionSettingsRepository userSessionSettingsRepository;
    private final IUserSettingsRepository userSettingsRepository;
    private final IUsersRepository usersRepository;


    public UserController(UserService userService, IUserService iUserService, IFlywayRepository flywayRepository, IOauthRepository oauthRepository, IProvider iprovider,
                          ISessionRecordingRepository sessionRecordingRepository, IUserProviderRepository userProviderRepository,
                          IUserRecordsToBeDeletedRepository userRecordsToBeDeletedRepository, IUserSessionRepository userSessionRepository, IUserSessionProviderRepository userSessionProviderRepository, IUserSessionSettingsRepository userSessionSettingsRepository, IUserSettingsRepository userSettingsRepository, IUsersRepository usersRepository) {
        this.userService = userService;
        this.iUserService = iUserService;
        this.flywayRepository = flywayRepository;
        this.oauthRepository = oauthRepository;
        this.iprovider = iprovider;
        this.sessionRecordingRepository = sessionRecordingRepository;
        this.userProviderRepository = userProviderRepository;
        this.userRecordsToBeDeletedRepository = userRecordsToBeDeletedRepository;
        this.userSessionRepository = userSessionRepository;
        this.userSessionProviderRepository = userSessionProviderRepository;
        this.userSessionSettingsRepository = userSessionSettingsRepository;
        this.userSettingsRepository = userSettingsRepository;
        this.usersRepository = usersRepository;
    }

    @GetMapping("/flyway/getAll")
    public List<FlywaySchemaHistory> getAll(FlywaySchemaHistory flyway_schema_history){
       return flywayRepository.findAll();
    }
    @GetMapping("/oauth/getAll")
    public List<OauthState> getAll(OauthState oauth_state){
        return oauthRepository.findAll();
    }

    @GetMapping("/provider/getAll")
    public List<Provider>  getAll(Provider provider){
        return iprovider.findAll();
    }

    @GetMapping("/session/recording/getAll")
    public List<SessionRecording> getAll(SessionRecording session_recording){
        return sessionRecordingRepository.findAll();
    }

    @GetMapping("/user/provider/getAll")
    public List<UserProvider> getAll(UserProvider user_provider){

        return userProviderRepository.findAll();
    }

    @GetMapping("/user/recordtobe/deleted/getAll")
    public List<UserRecordsTobeDeleted> getAll(UserRecordsTobeDeleted userRecordsTobeDeleted){
        return userRecordsToBeDeletedRepository.findAll();
    }

    @GetMapping("/user/session/getAll")
    public List<UserSession> getAll(UserSession userSession){
        return userSessionRepository.findAll();
    }

    @GetMapping("/user/session/provider/getAll")
    public List<UserSessionProvider> getAll(UserSessionProvider user_session_provider){
        return userSessionProviderRepository.findAll();
    }

    @GetMapping("/user/session/settings/getAll")
     public List<UserSessionSettings> getAll(UserSessionSettings userSessionSettings){
        return userSessionSettingsRepository.findAll();
    }

    @GetMapping("/user/settings/getAll")
    public List<UserSettings> getAll(UserSettings userSettings){
        return userSettingsRepository.findAll();
    }

    @GetMapping("/users/getAll")
    public List<Users> getAll(Users users){
        return usersRepository.findAll();
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @GetMapping("/users/getAll/{field}")
    public APIResponse<List<Users> > getUUsersWithSort(@PathVariable String field){
        List<Users> users = userService.findAllUsersWithSorting(field);
        return new APIResponse<>(users.size(),users);
    }
    @GetMapping("user/pagination/{page}/{pageSize}")
    public APIResponse<Page<Users>> getUsersWithPagination(@PathVariable int page,@PathVariable int pageSize){
        Page<Users> users = userService.findUsersWithPagination(page,pageSize);
        return new APIResponse<>(users.getSize(),users);
    }
    @GetMapping("user/pagination/{page}/{pageSize}/{field}")
    public APIResponse<Page<Users>> getUsersWithPaginationAndSorting(@PathVariable int page,@PathVariable int pageSize,@PathVariable String field ){
        Page<Users> users = userService.findusersWithPaginationAndSorting(page,pageSize,field);
        return new APIResponse<>(users.getSize(),users);
    }



    @GetMapping("/name/{name}")
    public List<Provider> getName(@PathVariable String name){
        return (List<Provider>) iprovider.getProviderWithThisname(name) ;
    }
    @GetMapping("/dates")
    public List<SessionRecording> getdates(SessionRecording sessionRecording){

        return (List<SessionRecording>) sessionRecordingRepository.getBetweenDates();
    }
////////////////////////////



}
