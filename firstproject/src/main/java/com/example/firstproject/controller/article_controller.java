package com.example.firstproject.controller;

import com.example.firstproject.entity.Arricle;
import dto.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class article_controller {
    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticles(ArticleForm form){
        System.out.println(form.toString());

//        1. Dto를 변환 -> Entity!
        Arricle article = form.toEntity();
//        2. Repository에게 Entity를 DB안에 저장

        return "";
    }
}
