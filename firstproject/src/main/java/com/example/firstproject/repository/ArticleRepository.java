package com.example.firstproject.repository;

import com.example.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

// 1. 관리 대상 entity를 넣어 준다.
// 2. 대표 값의 타입을 넣어 준다.
// Result : CrudRepository<Article, Long>
public interface ArticleRepository extends CrudRepository<Article, Long> {

}
