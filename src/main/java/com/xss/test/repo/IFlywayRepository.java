package com.xss.test.repo;

import com.xss.test.entity.FlywaySchemaHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IFlywayRepository extends JpaRepository<FlywaySchemaHistory, Integer> {
}
