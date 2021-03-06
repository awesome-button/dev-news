package com.example.devnews.comments;

import com.example.devnews.articles.Article;
import com.example.devnews.articles.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    CommentService commentService;

    @GetMapping("")
    public List<Comment> getAll(@RequestParam(required = false) Long articleId) {
        if (articleId == null) {
            return commentService.getAll();
        } else {
            return commentService.getAllByArticleId(articleId);
        }
    }

    @GetMapping("/{id}")
    public Optional<Comment> getById(@PathVariable Long id) {
        return commentService.getById(id);
    }

    @PostMapping("")
    public Comment create(@RequestBody Comment comment) {
        return commentService.create(comment);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        commentService.delete(id);
    }

    @PutMapping("")
    public Comment update(@RequestBody Comment updComment) {
        return commentService.update(updComment);
    }
}