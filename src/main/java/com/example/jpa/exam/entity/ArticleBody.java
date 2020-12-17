package com.example.jpa.exam.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author yanghang
 * @version V1.0
 * Created in 2020-12-17 14:47
 */
@Getter
@Setter
@Entity
@Table(name = "article_body")
public class ArticleBody extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

}
