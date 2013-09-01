package com.ocean.direct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.ocean.direct.domain.entity.BoardContent;

public interface BoardContentRepository extends JpaRepository<BoardContent, Long>, QueryDslPredicateExecutor<BoardContent> {

}