package com.example.jpa.exam.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 * @author yanghang
 * @version V1.0
 * Created in 2020-12-17 14:17
 */
@Getter
@Setter
@Entity
@Table(name = "article")
public class Article extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String introduction;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "release_time")
    private Date releaseTime;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ArticleBody articleBody;
}
