package com.example.QuestionService.repository;

import com.example.QuestionService.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.QueryHints;

public interface answerrepo extends JpaRepository<Question,Integer> {
}
