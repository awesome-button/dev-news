package com.example.devnews.articles;

import javax.persistence.*;

@Entity
@Table(name="articles")
public class Article {

    @Column(columnDefinition = "TEXT")
    private String title;

    @Column(columnDefinition = "TEXT")
    private String body;

    @Column(columnDefinition = "TEXT")
    private String authorName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    public Article() {}

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
        this.body = body;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

}
