package com.xss.test.repo;

import com.xss.test.entity.UserSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Repository
public interface IUserSessionRepository extends JpaRepository<UserSession, UUID> {
    @Query(value = "select * from user_session where cdate= ?1",nativeQuery = true)
    List<UserSession> getCurrentUsers(LocalDate nowDate);
}
