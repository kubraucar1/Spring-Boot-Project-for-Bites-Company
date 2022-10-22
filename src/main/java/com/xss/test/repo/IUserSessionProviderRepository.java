package com.xss.test.repo;

import com.xss.test.entity.UserSessionProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IUserSessionProviderRepository extends JpaRepository<UserSessionProvider, UUID> {
}
