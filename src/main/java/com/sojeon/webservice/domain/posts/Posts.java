package com.sojeon.webservice.domain.posts;

import lombok.Builder;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Posts { //Posts 클래스는 실제 DB의 테이블과 매칭될 클래스. Entity 클래스라고도 함

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public  Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }


}
