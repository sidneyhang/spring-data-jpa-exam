package com.example.jpa.exam.service;

import com.example.jpa.exam.entity.Article;
import com.example.jpa.exam.entity.ArticleBody;
import com.example.jpa.exam.repository.ArticleRpt;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author yanghang
 * @version V1.0
 * Created in 2020-12-17 15:47
 */
@Slf4j
@Service
@Transactional(rollbackFor = RuntimeException.class)
public class ArticleService {

    @Autowired
    private ArticleRpt articleRpt;

    public void save() {
        Article article = new Article();
        article.setTitle("这是标题");
        article.setIntroduction("文章简介");

        ArticleBody body = new ArticleBody();
        body.setContent("文章的内容");

        article.setArticleBody(body);
        articleRpt.save(article);
    }
}
