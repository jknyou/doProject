package com.ocean.direct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.ocean.direct.domain.entity.BoardContentDetail;

public interface BoardContentDetailRepository extends JpaRepository<BoardContentDetail, Long>, QueryDslPredicateExecutor<BoardContentDetail> {

}