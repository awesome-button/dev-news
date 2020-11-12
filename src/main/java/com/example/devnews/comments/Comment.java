package com.example.devnews.comments;

import com.example.devnews.articles.Article;

import javax.persistence.*;

@Entity
@Table(name="comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String name;

    @Column(columnDefinition = "TEXT")
    private String body;

    @Column(columnDefinition = "TEXT")
    private String authorName;

    @ManyToOne
    Article article;

    public Comment() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBody() {
        return body;
    }

    public String getAuthorName() {
        return authorName;
    }

    public Article getArticle() {
        return article;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
