package com.bitstudy.app.repository;

import com.bitstudy.app.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/** 할일 - 클래스 레벨에 @RepositoryRestResource 넣어서 해당 클래스를 spring rest data 사용할 준비 시켜놓기
 * 
 * */

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
