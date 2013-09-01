package com.ocean.direct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.ocean.direct.domain.entity.LocationInfo;

public interface LocationInfoRepository extends JpaRepository<LocationInfo, Long>, QueryDslPredicateExecutor<LocationInfo> {

}