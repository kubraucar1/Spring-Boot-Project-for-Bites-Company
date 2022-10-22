package com.xss.test.repo;

import com.xss.test.dto.UserProviderDto;
import com.xss.test.entity.UserProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Repository
public interface IUserProviderRepository extends JpaRepository<UserProvider, UUID> {
    @Query(value = "select * from user_provider where provider_id = '2a245ed3-f727-4f4c-bc72-904290b53a6b'",nativeQuery = true)
    List<UserProvider> streamYoutube();

    @Query(value = "select * from user_provider where provider_id = 'cfe56cee-84a8-47f5-8e15-99d4f6b605ea'",nativeQuery = true)
    List<UserProvider> streamTwitch();

}
