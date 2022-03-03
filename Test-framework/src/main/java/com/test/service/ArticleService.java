package com.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.test.domain.ResponseResult;
import com.test.entity.Article;



public interface ArticleService extends IService<Article> {
    ResponseResult hotArticleList();
}
