package com.example.exa_107_quiz;

import org.junit.Test;

import java.util.List;

public class TestQuestionPool {

    @Test
    public void testQuestionPool(){
        at.htlkaindorf.quiz.QuestionPool pool = new at.htlkaindorf.quiz.QuestionPool();
        List<QuizQuestion> set = pool.getQuestionSet(Category.FORTNITE);
        set.forEach(System.out::println);
    }
}
