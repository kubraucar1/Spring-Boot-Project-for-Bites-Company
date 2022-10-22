package com.xss.test.repo;

import com.xss.test.entity.Provider;
import com.xss.test.entity.SessionRecording;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Repository
public interface IProvider extends JpaRepository<Provider, UUID> {
    @Query(value = "select * from provider where name =?1", nativeQuery = true)
    Collection<Provider> getProviderWithThisname(String name);

}
