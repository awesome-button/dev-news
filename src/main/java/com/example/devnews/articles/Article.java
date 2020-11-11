package com.example.devnews.articles;

import javax.persistence.*;

//@Entity
//@Table(name="articles")
public class Article {

//    @Column(columnDefinition = "TEXT")
    String title;

//    @Column(columnDefinition = "TEXT")
    String body;

//    @Column(columnDefinition = "TEXT")
    String authorName;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

//    public Article() {}

    public Article(String title, String body, String authorName, Long id) {
        this.title = title;
        this.body = body;
        this.authorName = authorName;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getAuthorName() {
        return authorName;
    }

    public Long getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.title = body;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

}
