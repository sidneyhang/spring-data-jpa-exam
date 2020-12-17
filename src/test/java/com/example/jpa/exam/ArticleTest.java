package com.example.jpa.exam;

import com.example.jpa.exam.service.ArticleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;

/**
 * @author yanghang
 * @version V1.0
 * Created in 2020-12-17 15:48
 */
public class ArticleTest extends SpringDataJpaExamApplicationTests {

    @Autowired
    private ArticleService articleService;

    @Test
    public void saveTest() {
        articleService.save();
    }
}
