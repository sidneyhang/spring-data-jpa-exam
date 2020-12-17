package com.example.jpa.exam.repository;

import com.example.jpa.exam.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author yanghang
 * @version V1.0
 * Created in 2020-12-17 15:49
 */
@Repository
public interface ArticleRpt extends JpaRepository<Article, Long> {

}
