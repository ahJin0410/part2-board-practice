package com.board.boardpractice.repository;

import com.board.boardpractice.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
