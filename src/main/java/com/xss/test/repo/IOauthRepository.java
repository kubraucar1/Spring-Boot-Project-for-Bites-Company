package com.xss.test.repo;

import com.xss.test.entity.OauthState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOauthRepository extends JpaRepository<OauthState,Integer> {
}
